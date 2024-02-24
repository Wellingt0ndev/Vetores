import java.util.Scanner;

//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas? ");
        int n = scanner.nextInt();
        String [] nome = new String[n];
        int [] idade = new int[n];
        double [] altura = new double[n];
        double soma = 0.0;
        int menorIdade = 0;
        double percentualMenores = 0.0;
        for(int i = 0; i < n; i++){
            System.out.printf("Dados da %dº pessoa\n", i + 1);
            System.out.print("Nome: ");
            nome[i] = scanner.next();
            System.out.print("Idade: ");
            idade[i] = scanner.nextInt();
            System.out.print("Altura: ");
            altura[i] = scanner.nextDouble();
            soma += altura[i];
            if (idade[i] < 16)
                menorIdade++;
        }
        double mediaAltura = soma / n;
        percentualMenores = ((double)menorIdade / n) * 100.0;

        System.out.printf("Altura média: %.2f\n", mediaAltura);
        System.out.printf("Percentual de pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        for (int i = 0; i < n; i++){
            if(idade[i] < 16)
                System.out.println(nome[i]);
        }
        scanner.close();
    }
}