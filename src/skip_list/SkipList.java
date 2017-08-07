package skip_list;

/**
 * Created by anhtran on 8/5/2017.
 */
public class SkipList {
    private SkipNode header;
    private int infinity;
    private SkipNode bottom = null;
    private SkipNode tail = null;

    /* Constructor */
    public SkipList(int inf)
    {
        infinity = inf;
        bottom = new SkipNode(0);
        bottom.right = bottom.down = bottom;
        tail = new SkipNode(infinity);
        tail.right = tail;
        header = new SkipNode(infinity, tail, bottom);
    }
    /* Function to insert element */
    public void insert(int x)
    {
        SkipNode current = header;
        bottom.element = x;
        while (current != bottom)
        {
            while (current.element < x)
                current = current.right;
            /*  If gap size is 3 or at bottom level and must insert, then promote middle element */
            if (current.down.right.right.element < current.element)
            {
                current.right = new SkipNode(current.element, current.right, current.down.right.right);
                current.element = current.down.right.element;
            }
            else
                current = current.down;
        }
        /* Raise height of skiplist if necessary */
        if (header.right != tail)
            header = new SkipNode(infinity, tail, header);
    }
    /* Function to clear list */
    public void makeEmpty()
    {
        header.right = tail;
        header.down = bottom;
    }
    /* Function to check if empty */
    public boolean isEmpty()
    {
        return header.right == tail && header.down == bottom;
    }
    /* Function to get node at a position */
    private int elementAt(SkipNode t)
    {
        return t == bottom ? 0 : t.element;
    }
    /* Function to print list */
    public void printList()
    {
        System.out.print("\nSkiplist = ");
        SkipNode current = header;
        while( current.down != bottom )
            current = current.down;
        while (current.right != tail )
        {
            System.out.print(current.element +" ");
            current = current.right;
        }
        System.out.println();
    }
}
