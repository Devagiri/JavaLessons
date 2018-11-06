package org.ananta.algorithms;

import static org.ananta.algorithms.ArrayLibrary.*;

public class Application {
    public static void main(String[] args) {

       // int[] array = inputArray();
        int[] array = randomInputArray(100 , 2);

       // System.out.println("Max = "+ max(array));

       // System.out.println("Min = "+ min(array));

       // printArray(find(array, 3));

      //  printArray(findBooleans(array, 3));

       // bubbleSort(array);
        printArray(array);

        int summ =0;

        for (int i=0; i<array.length;i++){
            summ+=array[i];
        }
        System.out.println("Среднее "+(double)summ/array.length);

    }


}
