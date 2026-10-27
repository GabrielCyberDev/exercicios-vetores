import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nome = scanner.nextLine();

        char[] letras = nome.toCharArray();

        // Troca a primeira letra com a última, a segunda com a penúltima, etc.
        for (int i = 0; i < letras.length / 2; i++) {
            char aux = letras[i];                           // variável auxiliar
            letras[i] = letras[letras.length - 1 - i];
            letras[letras.length - 1 - i] = aux;
        }

        System.out.println("Nome invertido: " + new String(letras));

        scanner.close();
    }
}