package KI_35.Dzoban.lab7;

public class Element implements IElements{

    private final int data;
    private Element link;

    /**
     * Method adds new element and link to list
     * @param data
     */
    public Element(int data) {
        this.data = data;
        this.link = null;
    }

    /**
     *
     * @return data from list
      */
    @Override
    public int getData() {
        return data;
    }

    /**
     * Methods sets link
     * @param element
     */
    @Override
    public void setLink(Element element) {
        link = element;
    }

    @Override
    public Element getLink() {
        return this;
    }

    /**
     *
     * @return element link
     */
    public Element getLinkElement() {
        return link;
    }

    /**
     * Print element
     */
    @Override
    public void print() {
        if (link==null) System.out.print("Element data: " + this.data + " Next element: " + null);
        else System.out.print("Element data: " + this.data + " Next element: " + this.link);
    }

    /**
     *
     * @param o the object to be compared.
     * @return compared value
     */
    @Override
    public int compareTo(IElements o) {
        Integer val = data;
        return val.compareTo(o.getData());
    }
}

