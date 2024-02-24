import java.util.Scanner;

//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
//o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
//considerando a primeira posição como 0 (zero).
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = scanner.nextInt();
        double [] vetor = new double[n];
        double maior = 0.0;
        int index = 0;
        for(int i = 0; i < n; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = scanner.nextDouble();
            if(vetor[i] > maior){
                maior = vetor[i];
                index = i;
            }
        }
        System.out.printf("MAIOR VALOR = %.1f\n", maior);
        System.out.println("POSIÇÃO DO MAIOR VALOR = " + index);


        scanner.close();
    }
}