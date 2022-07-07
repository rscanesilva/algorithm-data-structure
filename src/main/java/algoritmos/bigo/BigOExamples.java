package algoritmos.bigo;

public class BigOExamples {

    public static final int LENGTH =10;

    public static void main(String[] args) {
        String text = "1234567890";
        System.out.printf("Tamanho da entrada: %s%n", text.length());
        System.out.print("O(Log n): "); printLogN(text.length());
        System.out.print("O(n)"); printAllCharactersOfString(text);
        System.out.print("O(n log n)"); printNLogN(text.length());
        System.out.print("O(n^x)"); printPolynomialNumberOperations(text.length());
        System.out.print("O(x^n)"); printExponentialNumberOperations(text.length());
        System.out.print("O(n!)"); printFatorialNumberOperations(text.length());
    }

    // O(1)
    public static String getLastCharacter(String text) {
        if (text == null) {
            return "";
        }
        return String.valueOf(text.charAt( text.length() - 1));
    }

    // O(log n) -- Sempre base 2
    public static void printLogN(int n) {
        long numberOperations = 0;
        for (int i = 1; i < n; i = i * 2){
            numberOperations++;
        }
        System.out.println("number of operations:" + numberOperations);
    }

    // O(n)
    public static void printAllCharactersOfString(String text) {
        long numberOperations = 0;
        for (var s : text.toCharArray()) {
            //System.out.print(s);
            numberOperations++;
        }
        System.out.println("number of operations:" + numberOperations);
    }

    //O(n log n)
    public static void printNLogN(int n) {
        long numberOperations = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n; j = j * 2) {
                numberOperations++;
            }
        }
        System.out.println("number of operations:" + numberOperations);
    }

    //O(n^x)  (X = number of FORs, in this example, x=2)
    public static void printPolynomialNumberOperations(int n) {
        long numberOperations = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                numberOperations++;
            }
        }
        System.out.println("number of operations:" + numberOperations);
    }

    // O(x^n) in this example, x=2
    public static void printExponentialNumberOperations(int n) {
        long numberOperations = 0;
        for (int i = 1; i <= Math.pow(2, n); i++){
            numberOperations++;
        }
        System.out.println("number of operations:" + numberOperations);
    }

    // O(n!)
    public static void printFatorialNumberOperations(int n) {
        long numberOperations = 0;
        for (int i = 1; i <= getFatorial(n); i++) {
            numberOperations++;
        }
        System.out.println("number of operations:" + numberOperations);
    }

    public static long getFatorial(int number) {
        String text = "012345";

        long fatorial = number;
        for (int i = 1; i < number; i ++ ) {
            fatorial *= i;
        }
        return fatorial;
    }
}
