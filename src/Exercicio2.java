import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números deseja informar? ");
        int n = scanner.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Vetor original: " + Arrays.toString(vetor));

        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                vetor[i] = vetor[i] * 2;                  // par: multiplica por 2
            } else {
                vetor[i] = (int) Math.pow(vetor[i], 2);   // ímpar: eleva ao quadrado
            }
        }

        System.out.println("Vetor alterado: " + Arrays.toString(vetor));

        scanner.close();
    }
}