package skip_list;

import java.util.Scanner;

/**
 * Created by anhtran on 8/5/2017.
 */
public class SkipListTest {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        /* Creating object of SkipList */
        SkipList sl = new SkipList(100000000);
        System.out.println("SkipList List Test\n");
        char ch;
        /*  Perform list operations  */
        do
        {
            System.out.println("\nSkipList List Operations\n");
            System.out.println("1. insert");
            System.out.println("2. check empty");
            System.out.println("3. clear");

            int choice = scan.nextInt();
            switch (choice)
            {
                case 1 :
                    System.out.println("Enter integer element to insert");
                    sl.insert( scan.nextInt() );
                    break;
                case 2 :
                    System.out.println("Empty status = "+ sl.isEmpty());
                    break;
                case 3 :
                    System.out.println("List cleared\n");
                    sl.makeEmpty();
                    break;
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            /*  Display List  */
            sl.printList();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);

        } while (ch == 'Y'|| ch == 'y');
    }
}
