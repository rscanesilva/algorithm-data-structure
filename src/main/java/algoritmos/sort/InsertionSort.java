package algoritmos.sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {0, 2, 3, 4, 1};
        sort(array, TipoOrdenacao.CRESCENTE);
        System.out.println("===========================");
        sort(array, TipoOrdenacao.DECRESCENTE);
    }

    public static void sort(int[] array, TipoOrdenacao tipoOrdenacao) {
        int i, selected, j;
        for (i = 1; i < array.length; i++) {
            selected = array[i];
            j = i - 1;
            while (j >= 0 && swap(selected, array[j], tipoOrdenacao)) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = selected;
        }
        // mostrando o vetor ordenado
        for (i = 0; i < array.length; i++) {
            System.out.println((i + 1) + "° número: " + array[i]);
        }
    }

    private static boolean swap(int eleito, int value, TipoOrdenacao tipoOrdenacao) {
        return switch (tipoOrdenacao) {
            case CRESCENTE -> value > eleito;
            case DECRESCENTE -> value < eleito;
        };
    }
}
