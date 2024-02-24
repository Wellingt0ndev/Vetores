import java.util.Scanner;

//Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
//tela todos os números pares, e também a quantidade de números pares.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos numeros você vai digitar? ");
        int n = scanner.nextInt();
        int [] vetor = new int[n];
        int pares = 0;
        for (int i = 0; i < n; i++){
            System.out.print("Digite o numero: ");
            vetor[i] = scanner.nextInt();
        }
        System.out.println("NUMEROS PARES:");
        for(int i = 0; i < n; i++){
            if(vetor[i] % 2 == 0){
                System.out.printf("%d ", vetor[i]);
                pares++;
            }
        }
        System.out.printf("\nQuantidade de pares = %d", pares);
        scanner.close();
    }
}