package KI_35.Dzoban.lab7;


public interface IElements extends Comparable<IElements> {

    int getData();
    void setLink(Element link);
    Element getLink();
    void print();
}
