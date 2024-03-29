package algoritmos.search;

import java.util.Scanner;

public class BinarySearch {

    public static final int LENGTH = 1000000;

    public static void main(String[] args) {
        int[] list = new int[LENGTH];
        for (var i=0; i < LENGTH; i++) {
            list[i] = i;
        }
        System.out.print("Digite o número que deseja locallizar: ");
        Scanner read = new Scanner(System.in);
        binarySearch(list, read);
        read.close();
    }

    private static void binarySearch(int[] list, Scanner read) {
        int target = read.nextInt(), ini = 0, end = list.length - 1, middle, numberOfOpertarions = 0;
        boolean find = false;
        while (ini <= end) {
           numberOfOpertarions++;
           middle = (ini + end) / 2;
           if (target == list[middle]) {
               System.out.println(target + " encontrado na posição " + middle);
               break;
           } else if (target > list[middle]){
               ini = middle+1;
           } else if (target < list[middle]){
               end = middle-1;
           }
        }
        System.out.println("Número de operações: "+ numberOfOpertarions);
    }
}
