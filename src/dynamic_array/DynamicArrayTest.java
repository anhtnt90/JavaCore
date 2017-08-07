package dynamic_array;

import java.util.Scanner;

/**
 * Created by anhtran on 8/5/2017.
 */
public class DynamicArrayTest {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dynamic Array Test\n");

        DynamicArray da = new DynamicArray();

        char ch;
        /*  Perform Dynamic Array operations */
        do
        {
            System.out.println("\nDynamic Array\n");
            System.out.println("1. insert ");
            System.out.println("2. remove by index");
            System.out.println("3. remove by val");
            System.out.println("4. clear");
            System.out.println("5. size");

            int choice = scan.nextInt();
            switch (choice)
            {
                case 1 :
                    System.out.println("Enter value to insert");
                    da.insert(scan.next() );
                    break;
                case 2 :
                    System.out.println("Enter index");
                    da.remove(scan.nextInt() );
                    break;
                case 3 :
                    System.out.println("Enter value");
                    da.remove(scan.next() );
                    break;
                case 4 :
                    System.out.println("\nDynamic Array Cleared");
                    da.clear();
                    break;
                case 5 :
                    System.out.println("\nSize = "+ da.size() );
                    break;
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            da.display();

            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');
    }
}
