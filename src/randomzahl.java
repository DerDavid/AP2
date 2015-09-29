


/**
 * Created by derdavid on 27/09/15.
 */


import java.lang.*;

public class randomzahl {


    public int erzeugerandomzahl() {

        /**
         * @returns Random int in between 1 and 10
         */
            double x = Math.random() * 100 + 1;
            int y = (int) x;

            return y;
        }

    public int[] bubblesortarray(int[] array){

        //int[] unsortetarray = array;


        int i=0;
        int j=0;
        int helper;
        int helper2;

        while(i < array.length){

        helper = array[i];
            helper2 = array[i+1];

            if(helper > helper2){
                array[i] = helper2;
                array[i+1] = helper;

                System.out.println("Die Zahl in der Sortiermethode: "+array[i]);
            }


        }


      return array;
    }


        }


