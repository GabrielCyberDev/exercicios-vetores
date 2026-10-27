import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números deseja informar? ");
        int n = scanner.nextInt();
        int[] vetor = new int[n];

        // Preenche o vetor com valores digitados
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Bubble Sort (ordem crescente)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));

        scanner.nextLine(); // limpa o buffer

        // Conta vogais usando um vetor de char
        System.out.print("Digite um nome: ");
        String nome = scanner.nextLine();
        char[] letras = nome.toLowerCase().toCharArray();
        String vogais = "aeiouáéíóúâêôãõà";
        int quantidadeVogais = 0;
        for (char letra : letras) {
            if (vogais.indexOf(letra) != -1) {
                quantidadeVogais++;
            }
        }
        System.out.println("O nome \"" + nome + "\" possui " + quantidadeVogais + " vogais.");

        scanner.close();
    }
}