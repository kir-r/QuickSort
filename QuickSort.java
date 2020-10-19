/*Быстрая сортировка (Хоара)!
 * Средняя сложность O(n log n)
 * Сортировка пузырьком в сравнении - O(n^2), т.е. - O(Math.pow(n, 2))*/

import com.sun.source.tree.WhileLoopTree;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[]{42, 1, 65, 3, 32, -3, 54, 1, 20, 432, 2, 0, 32, 65};
        int low = 0;
        int high = array.length - 1;
        System.out.println(Arrays.toString(array));
        quickSort(array, low, high);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array, int low, int high) {
        if (array.length == 0) {
            return;
        }
        if (low >= high){
            return;
        }

        int i = low;
        int j = high;
        int pivotIndex = low + (high - low) / 2;
        int pivot = array[pivotIndex];

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(array, low, j);
        }
        if (i < high) {
            quickSort(array, i, high);
        }

    }
}
