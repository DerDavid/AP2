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

        int i = 1;

        while(i<100){
            i++;
            int p = i;
            Item helper = new Item(p);
            helper.PrintItem();
            Item dance = new Item(p,helper.ToString(p));
            dance.PrintItem();
        }

     }

}
