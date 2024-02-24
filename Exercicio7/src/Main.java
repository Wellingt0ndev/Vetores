import java.util.Scanner;

//Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
//mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
//os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = scanner.nextInt();
        double [] vetor = new double[n];
        double soma = 0.0;
        for(int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = scanner.nextDouble();
            soma+=vetor[i];
        }
        double media = soma / n;
        System.out.printf("MÉDIA DO VETOR = %.3f\n", media);
        System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
        for (int i = 0; i < n; i++){
            if(vetor[i] < media){
                System.out.printf("%.1f\n", vetor[i]);
            }
        }
        scanner.close();
    }
}