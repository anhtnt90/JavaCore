package sorted_array;

import java.util.Arrays;

/**
 * Created by anhtran on 8/5/2017.
 */
public class SortedArray<T> {
    private T[] array;

    public SortedArray(T[] array)
    {
        this.array = array;
    }

    public void sort()
    {
        Arrays.sort(array);
    }

    public T[] getArray()
    {
        return array;
    }
}
