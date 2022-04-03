package Sorts;

import static Sorts.SortUtils.*;

class BubbleSort implements SortAlgorithm {
    @Override
    public < T extends Comparable<T>> T[] sort(T[] array) {
        for (int i = 0, size = array.length; i < size - 1; ++i) {
            boolean swapped = false;
            for (int j = 0; j < size - 1 -i; ++j) {
                if (less(array[j], array[j + 1])) {
                    swap(array, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Integer[] integers = {4, 23, 6, 78, 1, 54, 231, 9, 12};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(integers);
        print(integers);
        String[] strings = {"c", "a", "e", "b", "d"};
        print(bubbleSort.sort(strings));
    }
}