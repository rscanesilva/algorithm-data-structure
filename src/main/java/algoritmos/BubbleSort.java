package algoritmos;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {2, 34, 65, 3, 567, 1, 56, 4, 56758, 6, 572, 7, 896, 5, 2346, 9, 10};
        ordernar(array, TipoOrdenacao.CRESCENTE);
        for (int i : array) System.out.print("; "+i);
        ordernar(array, TipoOrdenacao.CRESCENTE);
        for (int i : array) System.out.print("; "+i);
    }

    public static void ordernar(int[] array, TipoOrdenacao tipoOrdenacao) {
        int aux, troca, operations;
        troca = 1;
        operations = 0;
        for (int n = 0; n < array.length && troca == 1; n++) {
            troca = 0;
            for (var i = array.length-1; i > n; i--) {
                operations++;
                boolean efetuaTroca = false;
                switch (tipoOrdenacao) {
                    case CRESCENTE -> efetuaTroca = array[i] < array[i - 1];
                    case DECRESCENTE -> efetuaTroca = array[i] > array[i - 1];
                }
                if (efetuaTroca) {
                    troca = 1;
                    aux = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = aux;
                }
            }
        }
        System.out.printf("\noperations: %s", operations);
    }

    public static void ordernarOlder(int[] array, TipoOrdenacao tipoOrdenacao) {
        int n, i, aux, troca, operations;
        n = 0;  troca = 1;
        operations = 0;
        while (n < array.length && troca == 1) {
            troca = 0;

            for (i = 0; i < array.length-1; i++) {
                operations++;
                boolean efetuaTroca = false;
                switch (tipoOrdenacao){
                    case CRESCENTE -> efetuaTroca = array[i] > array[i + 1];
                    case DECRESCENTE -> efetuaTroca = array[i] < array[i + 1];
                }
                if (efetuaTroca) {
                    troca = 1;
                    aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                }
            }
            n = n + 1;
        }
        System.out.printf("\noperations: %s", operations);
    }

    public enum TipoOrdenacao {
        CRESCENTE, DECRESCENTE
    }

}



