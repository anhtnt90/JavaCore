package vector;

import java.util.Scanner;

/**
 * Created by anhtran on 8/5/2017.
 */
public class VectorTest {
    public static void main(String... arg)
    {
        int size;
        int num;
        int value;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the initial size of the vector");
        size = scanner.nextInt();

        Vector<Integer> vector = new Vector<>(size);
        System.out.println("Enter the number of elements ");
        num = scanner.nextInt();

        System.out.println("Enter the values");
        for (int index = 0; index < num; index++)
        {
            value = scanner.nextInt();
            vector.store(index, value);
        }

        System.out.println("The Entered Values are");
        for (int index = 0; index < vector.getSize(); index++)
        {
            System.out.print(vector.get(index) + "\t");
        }

        System.out.println("\nTHE SIZE OF THE VECTOR IS  " + vector.getSize());
        System.out.println("THE CAPACITY OF THE VECTOR IS  " + vector.getCapacity());
        scanner.close();
    }
}
