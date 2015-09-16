/**
 * Created by DerDaviD on 16.09.2015.
 */
public class Item {

    private Integer count;
    private String item;

    public Item() {

    }
    public Item(Integer count, String item){

    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void PrintItem(){

        System.out.println("Die Nummer des Items ist: " + count + " und heisst: " +item);

    }

}

