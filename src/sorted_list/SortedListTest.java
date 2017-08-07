package sorted_list;

import java.util.Scanner;

/**
 * Created by anhtran on 8/5/2017.
 */
public class SortedListTest {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        /* Creating object of class SortedList */
        SortedList list = new SortedList();

        System.out.println("Sorted List Test\n");
        char ch;
        /*  Perform list operations  */
        do
        {
            System.out.println("\nSorted List Operations\n");
            System.out.println("1. insert");
            System.out.println("2. remove ");
            System.out.println("3. binary search");
            System.out.println("4. contains");
            System.out.println("5. check empty");
            System.out.println("6. get size");
            System.out.println("7. clear");
            int choice = scan.nextInt();
            switch (choice)
            {
                case 1 :
                    System.out.println("Enter integer element to add");
                    list.add( scan.nextInt() );
                    break;
                case 2 :
                    System.out.println("Enter index");
                    list.remove(scan.nextInt() );
                    break;
                case 3 :
                    System.out.println("Enter integer element to search");
                    System.out.println("Binary search result : "+ list.binarySearch(scan.nextInt() ));
                    break;
                case 4 :
                    System.out.println("Enter integer element ");
                    System.out.println("Contains result : "+ list.contains(scan.nextInt() ));
                    break;
                case 5 :
                    System.out.println("Empty status = "+ list.isEmpty());
                    break;
                case 6 :
                    System.out.println("Size = "+ list.size() +" \n");
                    break;
                case 7 :
                    System.out.println("Sorted List cleared");
                    list.clear();
                    break;
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            /*  Display List  */
            System.out.println(list);

            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');
    }
}
