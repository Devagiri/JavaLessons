package org.ananta.algorithms;

import org.ananta.algorithms.ArrayLibrary;

import java.util.Random;
import java.util.Scanner;

/**
 * Домашнее задание.
 * Выведено в отдельный класс, чтобы было удобнее отличить, что было сделано именно в этом задании
 */
public class ArrayUtil {

    public static void main(String[] args) {
        int[] arrayInput = inputArray();
        System.out.println("Среднее для 100 элементов: " + getAverage(arrayInput));
        calculateOddAndEven(arrayInput);


        System.out.println("\nСреднее для 100 элементов: " + getAverage(getRandomArray(100, 100)));
        System.out.println("Среднее для 500 элементов: " + getAverage(getRandomArray(500, 100)));
        System.out.println("Среднее для 1000 элементов: " + getAverage(getRandomArray(1000, 100)));

        calculateOddAndEven(getRandomArray(100, 100));

        int[] arr = getRandomArray(100, 100);
        int[] arr1 = getRandomArray(500, 100);
        int[] arr2 = getRandomArray(1000, 100);

        ArrayLibrary.bubbleSort(arr);
        ArrayLibrary.bubbleSort(arr1);
        ArrayLibrary.bubbleSort(arr2);

        System.out.println("\nМедиана для 100 элементов = " + getMedian(arr));
        System.out.println("Медиана для 500 элементов = " + getMedian(arr));
        System.out.println("Медиана для 1000 элементов = " + getMedian(arr));
    }

    /**
     * Возвращает true, если массивы одинаковы по размеру и их члены соответсвенно равны
     * Иначе возращает false
     * @param source первый массив
     * @param target второй массив
     * @return булево занчение
     */
    public static boolean isEqual(int[] source, int[] target) {
        boolean isEqual = true;

        // сравниваем размеры массивов
        if (source.length == target.length) {
            for (int i = 0; i < source.length; i++) {
                if (source[i] != target[i]) {
                    isEqual = false;
                    break;
                }
            }
        } else {
            isEqual = false;
        }

        return isEqual;
    }

    public static int getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    /**
     * Знак % используется для получения остатка от целочисленного деления.
     * Например, 2 % 2 - это 0, а 3 % 2 - это примерно 0.5
     * Для определения четности мы делим на 2. Если остатка нет, значит число - четное, иначе нечетное.
     * @param array - входной массив
     */
    public static void calculateOddAndEven(int[] array) {
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            }
        }
        // Если четных элементов некоторое число N, то нечетных M - N, где M - общее число всех элементов множества
        System.out.println("\nЧетных элементов в массиве: " +  even + " Нечетных: " + (array.length - even));
    }

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

    public static int[] getRandomArray(int size, int range) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(range);
        }
        return array;
    }

    public static int getMedian(int[] array) {
        int middle = array.length / 2;
        return (array[middle] + array[middle + 1]) / 2;
    }
}
