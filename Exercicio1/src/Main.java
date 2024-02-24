import java.util.Scanner;

//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero de 1 à 10: ");
        int n = scanner.nextInt();
        int [] valores =new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            valores[i] = scanner.nextInt();
        }
        System.out.println("Valores negativos");
         for(int i = 0; i < n; i++ ){
             if(valores[i] < 0){
                 System.out.println(valores[i]);
             }
         }
        scanner.close();
    }
}