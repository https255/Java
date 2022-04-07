package Sorts;

import static Sorts.SortUtils.less;
import static Sorts.SortUtils.print;

class InsertionSort implements SortAlgorithm {
    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        for (int j = 1; j < array.length; j++) {

            T key = array[j];
            int i = j - 1;

            while (i >= 0 && less(key, array[i])) {
                array[i + 1] =array[i];
                i--;
            }
            array[i + 1] = key;
        }
        return array;
    }

    public static void main(String[] args) {
        Integer[] integers = {4,23,6,78,1,54,231,,12};

        InsertionSort sort = new InsertionSort();

        sort.sort(integers);

        print(integers);

        String[] strings = {"c","a","e","b","d"};

        sort.sort(strings);

        print(strings);
    }
}