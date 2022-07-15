package algoritmos.sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] vetor = new int[]{29,10,14,37,15,11,30,50};
        quickSort(vetor, 0, vetor.length - 1);
        for (int i : vetor) System.out.print(i+";");
    }

    private static void quickSort(int[] vetor, int inicio, int fim) {
        if(fim > inicio) {
            int indexPivo = dividir(vetor, inicio, fim);
            /* Chamada recursiva para redivisao do vetor de elementos menores que o pivô. */
            quickSort(vetor, inicio, indexPivo - 1);
            /* Chamada recursiva para redivisao do vetor de elementos maiores que o pivô. */
            quickSort(vetor, indexPivo + 1, fim);
        }
    }

    private static int dividir(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int pontEsq = inicio + 1;
        int pontDir = fim;

        while(pontEsq <= pontDir) {
            while(pontEsq <= pontDir && vetor[pontEsq] <= pivo) {
                pontEsq++;
            }
            while(pontDir >= pontEsq && vetor[pontDir] > pivo) {
                pontDir--;
            }

            if(pontEsq < pontDir) {
                trocar(vetor, pontDir, pontEsq);
                pontEsq++;
                pontDir--;
            }
        }

        trocar(vetor, inicio, pontDir);
        return pontDir;
    }

    private static void trocar(int[] vetor, int pontDir, int pontEsq) {
        int temp = vetor[pontDir];
        vetor[pontDir] = vetor[pontEsq];
        vetor[pontEsq] = temp;
    }
}
