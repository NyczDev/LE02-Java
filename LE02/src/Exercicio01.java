import java.util.Scanner;

public class Exercicio01 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[5];
        double[] medias = new double[5];
        double soma = 0;

        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = sc.nextDouble();
            soma += numeros[i];
        }

        double media = soma / 5;

        for (int i = 0; i < 5; i++) {
            medias[i] = media;
            if (numeros[i] < media) {
                System.out.println("O número " + numeros[i] + " é menor que a média.");
            } else if (numeros[i] == media) {
                System.out.println("O número " + numeros[i] + " é igual à média.");
            } else {
                System.out.println("O número " + numeros[i] + " é maior que a média.");
            }
        }
        sc.close();
    }
}