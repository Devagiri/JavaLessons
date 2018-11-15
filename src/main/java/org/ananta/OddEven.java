package org.ananta;

public class OddEven {


    public static void main(String[] args) {
        int arr[] = new int[]{18, 0, 7, 9, 10, 6, 0, 25}; //как писал - помню, как получился верный результат - не помню
        System.out.println("Число   чётных элементов = " + numberOfEven(arr));
        System.out.println("Число нечётных элементов = " + numberOfOdd(arr)) ;
        System.out.println("Количество нулей         = " + numberOfZero(arr));
    }

    /**
     *
     * @param arr
     * @return
     */
    public static int numberOfEven(int arr[]) {
        int countEven = 0;
        for (int i = 0;  i < arr.length; i++) {
            if((arr[i] % 2 == 0) && (arr[i] != 0)) countEven++;
        }
        return countEven;
    }


    public static int numberOfZero(int arr[]) {
        int countZero = 0;
        for (int i = 0;  i < arr.length; i++) {
            if (arr[i] == 0) countZero++;
        }
        return countZero;
    }


    public static int numberOfOdd(int arr[]){
        int countOdd=0;

        for (int i = 0;  i < arr.length; i++) {
            if(arr[i] % 2 != 0) countOdd++;
        }

        return countOdd;
    }
}