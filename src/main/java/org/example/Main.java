package org.example;


import java.util.Random;

import static org.example.service.TestSort.*;

public class Main {
    public static void main(String[] args) {
        test_sort1();
        test_sort2();
        test_sort3();
    }

        public static Integer[] createRandomArray () {
            Integer[] arr = new Integer[100000];
            Random random = new Random();
            for (int i = 0; i < arr.length; i++) {
                arr[1] = random.nextInt(100) + 1;
            }
            return arr;
        }

    private static void test_sort1() {
        Integer[] arr1 = createRandomArray();
        Integer[] arr2 = createRandomArray();
        Integer[] arr3 = createRandomArray();

        System.out.println("пузырьковая сортировка");

        long start1 = System.currentTimeMillis();
        sortBubble(arr1);
        System.out.println(System.currentTimeMillis() - start1);

        long start2 = System.currentTimeMillis();
        sortBubble(arr2);
        System.out.println(System.currentTimeMillis() - start2);

        long start3 = System.currentTimeMillis();
        sortBubble(arr3);
        System.out.println(System.currentTimeMillis() - start3);



    }
    public  static void test_sort2(){

        Integer[] arr1 = createRandomArray();
        Integer[] arr2 = createRandomArray();
        Integer[] arr3 = createRandomArray();

        System.out.println("Сортировка выбором");

        long start1 = System.currentTimeMillis();
        sortSelection(arr1);
        System.out.println(System.currentTimeMillis() - start1);

        long start2 = System.currentTimeMillis();
        sortSelection(arr2);
        System.out.println(System.currentTimeMillis() - start2);

        long start3 = System.currentTimeMillis();
        sortSelection(arr3);
        System.out.println(System.currentTimeMillis() - start3);

    }

        public  static void test_sort3(){
            Integer[] arr1 = createRandomArray();
            Integer[] arr2 = createRandomArray();
            Integer[] arr3 = createRandomArray();

            System.out.println("Сортировка вставкой");

            long start1 = System.currentTimeMillis();
            sortInsertion(arr1);
            System.out.println(System.currentTimeMillis() - start1);

            long start2 = System.currentTimeMillis();
            sortInsertion(arr2);
            System.out.println(System.currentTimeMillis() - start2);

            long start3 = System.currentTimeMillis();
            sortInsertion(arr3);
            System.out.println(System.currentTimeMillis() - start3);

    }
}