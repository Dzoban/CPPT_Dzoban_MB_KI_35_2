import KI_35.Dzoban.lab7.*;

/**
 * LinkedListApp implements work with linked list
 * @author Mykola Dzoban
 * @version 1.0.0
 */
public class LinkedListApp {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        LinkedList<? super IElements> list = new LinkedList<>();
        list.addElement(new Element(3));
        list.addElement(new Element(55));
        list.addElement(new Element(46));
        list.addElement(new Element(7));
        list.addElement(new Element(20));
        IElements res = list.findMin();
        System.out.print("\nMin:");
        res.print();
        System.out.print("\n\n");
        list.deleteElement(1);
        list.printAll();

    }
}
