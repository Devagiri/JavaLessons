package org.ananta.algorithms;

import java.util.Random;
import java.util.Scanner;

public class ArrayLibrary {


    public static int[] inputArray() {
        int [] array;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество элементов: ");
        int count = scanner.nextInt();

        array = new int[count];
        System.out.println("Введите элементы: ");
        for (int i=0; i < count; i++){
            System.out.print("Значение "+i+" =");
            array[i] = scanner.nextInt();

        }
        scanner.close();
        return array;
    }

    public static int[] randomInputArray(int size, int bound, long seed){
        Random random = new Random(seed);
        int array[] =new int[size];
        for (int i=0; i < size; i++){
            array[i] = random.nextInt(bound);
        }
        return array;
    }

    public static int[] randomInputArray(int size, int bound){
        Random random = new Random();
        int array[] =new int[size];
        for (int i=0; i < size; i++){
            array[i] = random.nextInt(bound);
        }
        return array;
    }



    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static boolean[] findBooleans(int[] array, int element) {
        boolean [] index2 = new boolean[array.length];

        for (int i = 0; i < array.length; i++){
            if(array[i] == element) {
                index2[i] = true;
            }
        }
        return index2;
    }

    public static int[] find(int[] array, int element) {
        int counter = 0;

        int [] index = new int[array.length];
        for (int i = 0; i < index.length; i++){
            index[i]=-1;
        }

        for (int i = 0; i < array.length; i++){
            if(array[i] == element) {
                index[counter++] = i;
                System.out.println("Searched = "+i);
            }
        }
        return index;
    }

    public static int min(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++){
            if(array[i] < min) min = array[i];
        }
        return min;
    }


    public static int max(int [] array){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++){
            if(array[i] > max) max=array[i];
        }

        return max;
    }

    public static void printArray(int [] array){
        System.out.println("");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+", ");
        }
    }

    public static void printArray(boolean [] array){
        System.out.println("");
        for (int i = 0; i < array.length; i++){
            System.out.print("\t"+array[i]+", ");
        }
    }
}
