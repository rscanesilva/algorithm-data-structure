package algoritmos.sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {0, 2, 3, 4, 1};
        sort(array, SortingType.ASCENDING);
        System.out.println("===========================");
        sort(array, SortingType.DESCENDING);
    }

    public static void sort(int[] array, SortingType sortingType) {
        int i, unsorted, j;
        for (i = 1; i < array.length; i++) {
            unsorted = array[i];
            j = i - 1;
            while (j >= 0 && swap(unsorted, array[j], sortingType)) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = unsorted;
        }
        // mostrando o vetor ordenado
        for (i = 0; i < array.length; i++) {
            System.out.println((i + 1) + "° number: " + array[i]);
        }
    }

    private static boolean swap(int unsorted, int previus, SortingType sortingType) {
        return switch (sortingType) {
            case ASCENDING -> previus > unsorted;
            case DESCENDING -> previus < unsorted;
        };
    }
}
