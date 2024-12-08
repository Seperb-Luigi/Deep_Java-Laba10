package com.dev;

public class ArrayOrderChecker {
    public static String checkOrder(int[] array) {
        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                isDescending = false;
            }
            if (array[i] < array[i - 1]) {
                isAscending = false;
            }
        }

        if (isAscending) {
            return "Масив впорядкований за зростанням.";
        } else if (isDescending) {
            return "Масив впорядкований за спаданням.";
        } else {
            return "Масив не впорядкований.";
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        System.out.println(checkOrder(array));
    }
}
