import java.util.Scanner;

//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int n = scanner.nextInt();
        double [] vetor = new double[n];
        double soma = 0.0;
        for(int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextDouble();
            soma += vetor[i];
        }
        double media = soma / n;
        System.out.print("VALORES: ");
        for(int i = 0; i < n; i++){
            System.out.printf("%.1f ", vetor[i]);
        }
        System.out.printf("\nSOMA: %.2f\n", soma);
        System.out.printf("MÉDIA: %.2f\n", media);

        scanner.nextInt();
    }
}