package sorted_list;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by anhtran on 8/5/2017.
 */
public class SortedList {
    private ArrayList<Integer> list;

    /**  Constructor  **/
    public SortedList()
    {
        list = new ArrayList<Integer>();
    }
    /**  Function to check if list is empty  **/
    public boolean isEmpty()
    {
        return list.size() == 0 || list == null;
    }
    /** Function to clear list  **/
    public void clear()
    {
        list = new ArrayList<Integer>();
    }
    /**  Function to get size of list  **/
    public int size()
    {
        return list.size();
    }
    /**  Function to add element to list  **/
    public void add(int ele)
    {
        int pos = list.size();
        list.add(ele);
        while (pos > 0 && ele < list.get(pos - 1))
        {
            list.set(pos, list.get(pos - 1));
            pos--;
        }
        list.set(pos, ele);
    }
    /** Function to remove element at index **/
    public void remove(int ind)
    {
        list.remove(ind);
    }
    /** Function to perform binary search  **/
    public int binarySearch(int ele)
    {
        return Collections.binarySearch(list, ele);
    }
    /**  Function to check if element is present in list  **/
    public boolean contains(int ele)
    {
        return binarySearch(ele) >= 0;
    }
    /** Function to string  **/
    public String toString()
    {
        return list.toString();
    }
}
