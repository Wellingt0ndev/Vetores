import java.util.Scanner;

//Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
//terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
//o vetor C gerado.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = scanner.nextInt();
        int [] vetorA = new int[n];
        int [] vetorB = new int[n];
        int [] vetorC = new int[n];
        System.out.println("Digite os valores do vetor A");
        for(int i = 0; i < n; i++)
            vetorA[i] = scanner.nextInt();
        System.out.println("Digite os valores do vetor B");
        for(int i = 0; i < n; i++)
            vetorB[i] = scanner.nextInt();
        for(int i = 0; i < n; i++)
            vetorC[i] = vetorA[i]+vetorB[i];
        System.out.println("VETOR RESULTANTE:");
        for(int i = 0; i < n; i++)
            System.out.println(vetorC[i]);

        scanner.close();
    }
}