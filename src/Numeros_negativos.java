import java.util.Locale;
import java.util.Scanner;

public class Numeros_negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        int n = scan.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número");
            numeros[i] = scan.nextInt();
        }

        System.out.println("Números negativos: ");

        for (int i = 0; i < n; i++) {
            if (numeros[i] < 0 ) {
                System.out.printf("%d%n", numeros[i]);
            }
        }

        scan.close();

    }
}