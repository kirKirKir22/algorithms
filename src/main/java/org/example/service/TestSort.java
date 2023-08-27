package org.example.service;

public class TestSort {

    public static void swapElements(Integer[] arr, int indexA, int indexB) { // метод замены элементов
        int tmp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = tmp;
    }

    public static void sortBubble(Integer[] arr) { // пузырьковая сортировка
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] != null && arr[j + 1] != null && arr[j] > arr[j + 1]) {
                    swapElements(arr, j, j + 1);
                }
            }
        }
    }

    public static void sortSelection(Integer[] arr) { // Сортировка выбором
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] != null && (arr[minIndex] == null || arr[j] < arr[minIndex])) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Integer temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void sortInsertion(Integer[] arr) { // Сортировка вставкой
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            Integer key = arr[i];
            int j = i - 1;

            while (j >= 0 && (arr[j] == null || key != null && arr[j] > key)) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }


}
