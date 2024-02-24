import java.util.Scanner;

//Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
//no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
//os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
//igual a 6.0 (seis).
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos alunos serão digitados? ");
        int n = scanner.nextInt();
        String [] nome = new String[n];
        double [] semestre1 = new double[n];
        double [] semestre2 = new double[n];
        for (int i = 0; i < n; i++){
            System.out.printf("Digite nome, primeira e segunda nota do %dº aluno:\n", i+1);
            nome[i] = scanner.next();
            semestre1[i] = scanner.nextDouble();
            semestre2[i] = scanner.nextDouble();
        }
        System.out.println("Alunos Aprovados:");
        for (int i = 0; i < n; i++){
            double media = (semestre1[i]+semestre2[i])/2;
            if(media >= 6){
                System.out.println(nome[i]);
            }
        }
        scanner.close();
    }
}