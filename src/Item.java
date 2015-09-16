/**
 * Created by DerDaviD on 16.09.2015.
 */
import java.util.ArrayList;
import java.util.List;


public class Item {


    List Items = new ArrayList<String>();


    public Object getElement(int elementnumber) {
        return Items.get(elementnumber);
    }

    public void addElement (String Element) {
        Items.add(Element);
    }

    public String ToString(int i) {
        String P = Integer.toString(i);
        return P;
    }

    public void PrintAllItems() {
        int i = 0;
        while (i < Items.size()) {

            System.out.println("Die Nummer des Items ist: " + i + " und heisst: " + Items.get(i));
            i++;
        }
    }

    public void setElementto(int i,String wert ){

        Items.set(i,wert);
    }

    public void setElement(String element) {
        Items.add(element);
    }
}

