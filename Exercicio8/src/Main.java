import java.util.Scanner;

//Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
//aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
//digitado, mostrar a mensagem "NENHUM NUMERO PAR"
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = scanner.nextInt();
        int [] vetor = new int[n];
        int somaPares = 0;
        int qtdPares = 0;
        for(int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = scanner.nextInt();
            if(vetor[i] % 2 == 0) {
                somaPares += vetor[i];
                qtdPares++;
            }
        }
        if(qtdPares == 0){
            System.out.println("NENHUM NUMERO PAR");
        }else {
            double media = somaPares / qtdPares;
            System.out.printf("MEDIA DOS PARES = %.1f", media);
        }
        scanner.close();
    }
}