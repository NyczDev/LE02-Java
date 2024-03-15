import java.util.Scanner;

public class Exercicio02 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor:");
        int tamanho = sc.nextInt();

        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = sc.nextInt();
        }

        System.out.println("Os elementos do vetor são:");
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] > 0) {
                System.out.println("Elemento " + i + ": positivo");
            } else if (vetor[i] < 0) {
                System.out.println("Elemento " + i + ": negativo");
            } else {
                System.out.println("Elemento " + i + ": zero");
            }
        }
        sc.close();
    }
}