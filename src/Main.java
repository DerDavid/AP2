
public class Main {


    public static void main(String[] args) {
       //Ein einfacher Systemout Test
       System.out.println("Hello World!");

        //Eine ArrayListe und ein paar Methoden
        Item NeuesItem = new Item();
        NeuesItem.setElement("Hallo ");
        NeuesItem.setElement("Du ");
        NeuesItem.setElement("Freak");

        System.out.println("Element: "+NeuesItem.getElement(1));
        NeuesItem.PrintAllItems();
        NeuesItem.setElementto(1,"Ich");
        NeuesItem.PrintAllItems();

        //Hier wird nun ein Objekte aus abgeleiteten Klassen

        Kaffee kleinerkaffee = new Espresso();

        randomzahl sortier = new randomzahl();

        int[] neuesarray;
        neuesarray = new int[10];
        int i = 0;

        while(i < neuesarray.length) {
            neuesarray[i] = sortier.erzeugerandomzahl();
            System.out.println(" "+neuesarray[i]);
                i++;
        }

        int[] sortiertesarray = sortier.bubblesortarray(neuesarray);

        int qwark = 0;

        while(qwark < sortiertesarray.length){
            System.out.println("Zahl " +sortiertesarray[qwark]);
            qwark++;



        }

    }

}
