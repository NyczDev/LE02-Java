import java.util.Scanner;

public class Exercicio03 {
    public static void executar() {
        Scanner sc = new Scanner(System.in);

       System.out.println("Digite a quantidade de elementos do vetor: ");
       int quantidade = sc.nextInt();

       double[] N = new double[quantidade];
       double[] dobroN = new double[quantidade];

       System.out.println("Digite os elementos do vetor: ");
       for (int i = 0; i < quantidade; i++) {
           N[i] = sc.nextDouble();
           dobroN[i] = 2 * N[i];
       }

       System.out.println("Os valores do vetor dobroN são: ");
       for (int i = 0; i < quantidade; i++) {
           System.out.println(dobroN[i]);
       }

       sc.close();
   }
}