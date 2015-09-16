public class Main {




    public static void main(String[] args) {
        System.out.println("Hello World!");


        Item NeuesIem = new Item();

        NeuesIem.PrintItem();
        NeuesIem.setCount(12);
        NeuesIem.setItem("Muhaha");

        if(NeuesIem.getCount() == 12)
                System.out.println("Es ist eine " + NeuesIem.getCount());

        NeuesIem.PrintItem();
    }

}
