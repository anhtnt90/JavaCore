package dynamic_array;

import java.util.ArrayList;

/**
 * Created by anhtran on 8/5/2017.
 */
public class DynamicArray {
    private ArrayList<String> al;

    /** constructor **/
    public DynamicArray()
    {
        al = new ArrayList<String>();
    }
    /** function to clear **/
    public void clear()
    {
        al.clear();
    }
    /** function to get size **/
    public int size()
    {
        return al.size();
    }
    /** function to insert element **/
    public void insert(String key)
    {
        al.add(key);
    }
    /** function to get element at index **/
    public String get(int index)
    {
        if (index >= al.size())
            return "";
        return al.get(index);
    }
    /** function to remove element at index **/
    public void remove(int index)
    {
        if (index >= al.size())
            return ;
        al.remove(index);
    }
    /** function to remove element **/
    public void remove(String key)
    {
        al.remove(key);
    }
    /** function to display array **/
    public void display()
    {
        System.out.println("\nDynamic Array : "+ al);
        System.out.println();
    }
}
