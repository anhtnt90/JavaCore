package sorted_array;

/**
 * Created by anhtran on 8/5/2017.
 */
public class SortedArrayTest {
    public static void main(String...arg)
    {
        Integer[] inums = {10,9,8,7,6};
        Float[] fnums = {23.9f,5.5f,10.8f,2.5f,82.0f};
        Double[] dnums = {12.5,244.92,1.9,98.3,35.2};
        String[] strings = {"banana","pineapple","apple","mango","jackfruit"};

        System.out.println("The Values Before sorting");
        System.out.println();

        System.out.println("Integer Values");
        for (int i = 0; i < inums.length; i++)
            System.out.print(inums[i] + "\t");

        System.out.println();
        System.out.println("Floating Values");
        for (int i = 0; i < fnums.length; i++)
            System.out.print(fnums[i] + "\t");

        System.out.println();
        System.out.println("Double Values");

        for (int i = 0; i < dnums.length; i++)
            System.out.print(dnums[i] + "\t");

        System.out.println();
        System.out.println("String Values");

        for (int i = 0; i < strings.length; i++)
            System.out.print(strings[i] + "\t");

        SortedArray<Integer> integer = new SortedArray<Integer>(inums);
        SortedArray<Float> floating = new SortedArray<Float>(fnums);
        SortedArray<Double> doubles = new SortedArray<Double>(dnums);
        SortedArray<String> string = new SortedArray<String>(strings);

        integer.sort();
        floating.sort();
        doubles.sort();
        string.sort();

        inums = integer.getArray();
        fnums = floating.getArray();
        dnums = doubles.getArray();
        strings = string.getArray();

        System.out.println();
        System.out.println("The Values After sorting");
        System.out.println();
        System.out.println("Integer Values");
        for (int i = 0; i < inums.length; i++)
            System.out.print(inums[i] + "\t");

        System.out.println();
        System.out.println("Floating Values");
        for (int i = 0; i < fnums.length; i++)
            System.out.print(fnums[i] + "\t");

        System.out.println();
        System.out.println("Double Values");
        for (int i = 0; i < dnums.length; i++)
            System.out.print(dnums[i] + "\t");

        System.out.println();
        System.out.println("String Values");
        for (int i = 0; i < strings.length; i++)
            System.out.print(strings[i] + "\t");
    }
}
