package vector;

import java.util.ArrayList;

/**
 * Created by anhtran on 8/5/2017.
 */
public class Vector<T>  {
    private int capacity;
    private int size;
    private ArrayList<T> vector;
    private static final int INCREMENT_FACTOR = 5;

    public Vector(int size)
    {
        this.size = size;
        this.capacity = size + INCREMENT_FACTOR;
        vector = new ArrayList<T>();
    }

    public void store(int index, T value)
    {
        try
        {
            vector.set(index, value);
        } catch (IndexOutOfBoundsException indexOutBounds)
        {
            if (index >= 0 && (index < size))
            {
                vector.add(index, value);
            }
            if (index >= 0 && (index >= size && index < capacity))
            {
                vector.add(index, value);
                size = index + 1;
                if (size == capacity)
                    capacity = capacity + INCREMENT_FACTOR;
            }
            if (index >= capacity)
            {
                throw new IndexOutOfBoundsException();
            }
        }
    }

    public T get(int index)
    {
        try
        {
            return vector.get(index);
        } catch (IndexOutOfBoundsException indexOutBounds)
        {
        }
        return null;
    }

    public int getSize()
    {
        return size;
    }

    public int getCapacity()
    {
        return capacity;
    }
}
