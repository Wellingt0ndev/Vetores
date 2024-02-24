import java.util.Scanner;

//Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
//devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
//da pessoa mais velha.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas pessoas você vai digitar? ");
        int n = scanner.nextInt();
        String [] nome = new String[n];
        int [] idade = new int[n];
        int maisVelha = 0;
        int index = 0;
        for(int i = 0; i < n; i++){
            System.out.printf("Dados da %dº pessoa:\n", i+1);
            System.out.print("Nome: ");
            nome[i] = scanner.next();
            System.out.print("Idade: ");
            idade[i] = scanner.nextInt();
            if(idade[i] > maisVelha){
                maisVelha = idade[i];
                index = i;
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + nome[index]);
        scanner.close();
    }
}