import java.util.Locale;
import java.util.Scanner;

public class Soma_vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        int n = scan.nextInt();

        double[] numeros = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scan.nextDouble();
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f ", numeros[i]);
        }
        System.out.println();
        double soma = 0;

        for (double numero : numeros) {
            soma += numero;
        }

        double media = soma / numeros.length;

        System.out.printf("SOMA = %.2f%n", soma);
        System.out.printf("MEDIA = %.2f%n", media);
    }
}
