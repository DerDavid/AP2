/**
 * Created by DerDaviD on 16.09.2015.
 */
 public abstract class Heissgetraenk {

    String Name;
    Integer Temperatur;
    Integer Menge = 100;


    public void erhitzen() {

        this.Temperatur = 100;

    }
        public void servieren(String name){

            System.out.println("Voila hier ist ihr" + name );
    }
}
