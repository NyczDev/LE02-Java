import java.util.Scanner;

public class Exercicio11 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < 5; i++) {
            vetorA[i] = sc.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < 5; i++) {
            vetorB[i] = sc.nextInt();
        }


        int produtoEscalar = 0;
        for (int i = 0; i < 5; i++) {
            produtoEscalar += vetorA[i] * vetorB[i];
        }

        System.out.println("Produto escalar: " + produtoEscalar);

        sc.close();
    }
}
