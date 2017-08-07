package sorted_vector;

import java.util.Scanner;

/**
 * Created by anhtran on 8/5/2017.
 */
public class SortedVectorTest {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        /* Creating object of class SortedVector */
        SortedVector sv = new SortedVector();

        System.out.println("Sorted Vector Test\n");
        char ch;
        /*  Perform vector operations  */
        do
        {
            System.out.println("\nSorted Vector Operations\n");
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
                    sv.add( scan.nextInt() );
                    break;
                case 2 :
                    System.out.println("Enter index");
                    sv.remove(scan.nextInt() );
                    break;
                case 3 :
                    System.out.println("Enter integer element to search");
                    System.out.println("Binary search result : "+ sv.binarySearch(scan.nextInt() ));
                    break;
                case 4 :
                    System.out.println("Enter integer element ");
                    System.out.println("Contains result : "+ sv.contains(scan.nextInt() ));
                    break;
                case 5 :
                    System.out.println("Empty status = "+ sv.isEmpty());
                    break;
                case 6 :
                    System.out.println("Size = "+ sv.size() +" \n");
                    break;
                case 7 :
                    System.out.println("Sorted Vector cleared");
                    sv.clear();
                    break;
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            /*  Display Vector  */
            System.out.println(sv);

            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');
    }
}
