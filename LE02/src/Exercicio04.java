import java.util.Scanner;

public class Exercicio04 {
    public static void executar() {
       Scanner sc = new Scanner(System.in);

       System.out.println("Digite 5 números:");
       double[] numeros = new double[5];
       for (int i = 0; i < 5; i++) {
           numeros[i] = sc.nextDouble();
       }

       System.out.println("Digite um número n:");
       double n = sc.nextDouble();

       System.out.println("Os índices dos elementos inferiores a n são:");
       for (int i = 0; i < 5; i++) {
           if (numeros[i] < n) {
               System.out.println(i + " ");
           }
       }

       sc.close();
   }
}