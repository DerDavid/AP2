
public class Main {


    public static void main(String[] args) {
       //Ein einfacher Systemout Test
       System.out.println("Hello World!");

        //Eine ArrayListe und ein paar Methoden
        Item NeuesItem = new Item();
        NeuesItem.setElement("Hallo ");
        NeuesItem.setElement("Du ");
        NeuesItem.setElement("Bastard");

        System.out.println("Element: "+NeuesItem.getElement(1));
        NeuesItem.PrintAllItems();
        NeuesItem.setElementto(1,"Ich");
        NeuesItem.PrintAllItems();

        //Hier wird nun ein Objekte aus abgeleiteten Klassen

        Kaffee kleinerkaffee = new Espresso();



    }

}
