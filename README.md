## Notação BigO

Big O é uma maneira de medir a eficiência de algoritmos com base no tempo e no espaço. Para medir a complexidade do tempo, o tamanho da entrada é comparado ao tempo necessário para a execução do algoritmo.
Para medir a complexidade do espaço, ele compara o tamanho da entrada com a quantidade de memória que um algoritmo usa.

BigO nos ajuda a determinar qual será o comportamento do nosso algoritmo no **PIOR** dos casos e quanto tempo ele levará para ser completado conforme a entrada.
Podemos classficar o tempo de execução de algorítimo de acordo as sete opções abaixo:

1) Tempo Constante – O(1)
2) Tempo Logarítmico – O(log n)
3) Tempo Linear - O(n)
4) Tempo N Log N  – O(n log n)
5) Tempo polinomial – O(n^x)
6) Tempo Exponencial – O(x^n)
7) Tempo Fatorial – O(n!)

##### Tempo Constante: O(1)
Exemplo:
```
public static String getLastCharacter(String text) {
    if (text == null) {
        return "";
    }
    return String.valueOf(text.charAt( text.length() - 1));
}
```

##### Tempo Logarítmico: O(log n)
Exemplo:

```
public static void printLogN(int n) {
    int numberOperations = 0;
    for (int i = 1; i < n; i = i * 2){
        numberOperations++;
    }
    System.out.println(numberOperations);
}
```

##### Tempo Linear: O(n)
Exemplo:
```
public static void printAllCharactersOfString(String text) {
    for (var s : text.toCharArray()) {
        System.out.print(s);
    }
}
```

##### Tempo N Log N:  O(n log n)
Exemplo:
```
public static void printNLogN(int n) {
    int numberOperations = 0;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j < n; j = j * 2) {
            numberOperations++;
        }
    }
    System.out.println("\nnumber of operations:" + numberOperations);
}
```

##### Tempo polinomial: O(n^x)
Exemplo:
```
public static void printPolynomialNumberOperations(int n) {
    long numberOperations = 0;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            numberOperations++;
        }
    }
    System.out.println("number of operations:" + numberOperations);
}
```
##### Tempo Exponencial: O(x^n)
Exemplo:
```
public static void printExponentialNumberOperations(int n) {
    long numberOperations = 0;
    for (int i = 1; i <= Math.pow(2, n); i++){
        numberOperations++;
    }
    System.out.println("number of operations:" + numberOperations);
}
```
##### Tempo Fatorial – O(n!)
Exemplo:
```
public static void printFatorialNumberOperations(int n) {
    long numberOperations = 0;
    for (int i = 1; i <= getFatorial(n); i++) {
        numberOperations++;
    }
    System.out.println("number of operations:" + numberOperations);
}
```