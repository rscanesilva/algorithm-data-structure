package algoritmos.sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {2, 34, 65, 3, 567, 1, 56, 4, 56758, 6, 572, 7, 896, 5, 2346, 9, 10};
        sort(array, TipoOrdenacao.DECRESCENTE);
        for (int i : array) System.out.print("; "+i);
        sort(array, TipoOrdenacao.CRESCENTE);
        for (int i : array) System.out.print("; "+i);
    }

    public static void sort(int[] array, TipoOrdenacao tipoOrdenacao) {
        var operations = 0;
        boolean swap;
        var lastIndexUnsorted = array.length-1;
        do {
            swap = false;
            for (var i=0; i<lastIndexUnsorted; i++){
                operations++;
                switch (tipoOrdenacao) {
                    case CRESCENTE -> swap = array[i] > array[i + 1];
                    case DECRESCENTE -> swap = array[i] < array[i + 1];
                }
                if (swap) {
                    var aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                }
            }
            lastIndexUnsorted--;
        } while (swap);
        System.out.printf("\noperations: %s", operations);
    }
}



