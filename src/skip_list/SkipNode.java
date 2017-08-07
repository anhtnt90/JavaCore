package skip_list;

/**
 * Created by anhtran on 8/5/2017.
 */
public class SkipNode {
    int element;
    SkipNode right;
    SkipNode down;

    /* Constructor */
    public SkipNode(int x)
    {
        this(x, null, null);
    }
    /* Constructor */
    public SkipNode(int x, SkipNode rt, SkipNode dt)
    {
        element = x;
        right = rt;
        down = dt;
    }
}
