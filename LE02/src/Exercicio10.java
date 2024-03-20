import java.util.Scanner;

public class Exercicio10 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os elementos do vetor A:");
        double[] A = new double[5];
        for (int i = 0; i < 5; i++) {
            A[i] = sc.nextDouble();
        }

        double[] B = new double[5];
        for (int i = 0; i < 5; i++) {
            B[4 - i] = A[i];
        }

        System.out.println("Vetor B:");
        for (int i = 0; i < 5; i++) {
            System.out.println(B[i]);
        }

        sc.close();
    }
}