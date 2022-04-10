package Sorts;

import static Sorts.SortUtils.*;

import javax.swing.text.GapContent;

public class ShellSort implements SortAlgorithm {
    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        int length = array.length;
        int gap = 1;

        while (gap < length / 3) {
            gap = 3 * gap + 1;
        }

        for (; gap > 0; gap /= 3) {
            for (int i = gap; i < length; i++) {
                int j;
                for (j = i; j >= gap && less(array[j], array[j - gap]); j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = array[i];
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Integer[] toSort = {4,23,6,78,1,54,231,9,12};

        ShellSort sort = new ShellSort();
        print(sort.sort(toSort));
    }
}