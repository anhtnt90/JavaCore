package sorted_vector;



import java.util.Collections;
import java.util.Scanner;
import java.util.Collections;
import java.util.Vector;

/**
 * Created by anhtran on 8/5/2017.
 */
public class SortedVector {
    private Vector<Integer> vect;

    /**  Constructor  **/
    public SortedVector()
    {
        vect = new Vector<Integer>();
    }
    /**  Function to check if vector is empty  **/
    public boolean isEmpty()
    {
        return vect.size() == 0 || vect == null;
    }
    /** Function to clear vector  **/
    public void clear()
    {
        vect = new Vector<Integer>();
    }
    /**  Function to get size of vector  **/
    public int size()
    {
        return vect.size();
    }
    /**  Function to add element to vector  **/
    public void add(int ele)
    {
        int pos = vect.size();
        vect.add(ele);
        while (pos > 0 && ele < vect.get(pos - 1))
        {
            vect.set(pos, vect.get(pos - 1));
            pos--;
        }
        vect.set(pos, ele);
    }
    /** Function to remove element at index **/
    public void remove(int ind)
    {
        vect.remove(ind);
    }
    /** Function to perform binary search  **/
    public int binarySearch(int ele)
    {
        return Collections.binarySearch(vect, ele);
    }
    /**  Function to check if element is present in vector  **/
    public boolean contains(int ele)
    {
        return binarySearch(ele) >= 0;
    }
    /** Function to string  **/
    public String toString()
    {
        return vect.toString();
    }
}
