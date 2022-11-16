package KI_35.Dzoban.lab7;

import java.util.ArrayList;

/**
 *
 * @param <T>
 */
public class LinkedList<T extends IElements> {
    private final ArrayList<T> arrayList;
    private Element first = new Element(0);

    /**
     * Method LinkedList sets link for first element
     */
    public LinkedList()
    {
        arrayList = new ArrayList<T>();
        first.setLink(first);
    }

    /**
     * Method adds new element to list
     * @param data
     */
    public void addElement(T data) {
        if (first.getLink() != first.getLinkElement()) data.setLink(first.getLinkElement());
        first.setLink(data.getLink());
        arrayList.add(data);
        System.out.print("Added new element: ");
        data.print();
        System.out.print("\n");
    }

    /**
     * Method deletes element from list
     * @param i
     */
    public void deleteElement(int i) {
        if (i+1< arrayList.size()) arrayList.get(i+1).setLink(arrayList.get(i-1).getLink());
        arrayList.remove(i);
    }

    /**
     *
     * @return minimum value in list
     */
    public T findMin()
    {
        if(!arrayList.isEmpty())
        {
            T min = arrayList.get(0);
            for (T n : arrayList) {
                if (n.compareTo(min) < 0) min = n;
            }
            return min;
        }
        return null;
    }

    /**
     * Method shows all elements
     */
    public void printAll()
    {
        for (T n: arrayList
        ) {
            n.print();
            System.out.print("\n");
        }
    }
}

