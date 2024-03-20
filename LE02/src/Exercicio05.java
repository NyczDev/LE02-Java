import java.util.Scanner;

public class Exercicio05 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 5 números:");
        int[] num = new int[5];
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println("Digite um número N:");
        int n = sc.nextInt();

        int cont = 0;
        for (int i = 0; i < 5; i++) {
            if (num[i] == n) {
                cont++;
            }
        }
        System.out.printf("O número %d aparece %d vez(es) dentro do vetor\n", n, cont);

        sc.close();
    }
}