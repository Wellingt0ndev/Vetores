import java.util.Scanner;

//Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
//que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
//de homens.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas? ");
        int n = scanner.nextInt();
        double [] altura = new double[n];
        char [] genero = new char[n];
        double menorAltura = Double.MAX_VALUE;
        double maiorAltura = Double.MIN_VALUE;
        double somaAlturaMulher = 0.0;
        int homens = 0;
        for (int i = 0; i < n; i++){
            System.out.printf("Altura da %dª pessoa: ", i+1);
            altura[i] = scanner.nextDouble();
            System.out.printf("Genero da %dª pessoa: ", i+1);
            genero[i] = scanner.next().charAt(0);
            if(altura[i] > maiorAltura)
                maiorAltura = altura[i];
            if(altura[i] < menorAltura)
                menorAltura = altura[i];
            if(genero[i] == 'f' || genero[i] == 'F'){
                somaAlturaMulher+= altura[i];
            }else if(genero[i] == 'm' || genero[i] == 'M'){
                homens++;
            }
        }
        double mediaAlturaMulher = somaAlturaMulher / (n - homens);

        System.out.printf("Mmenor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Média das alturas das mulheres = %.2f\n", mediaAlturaMulher);
        System.out.println("Número de homens = " + homens);

        scanner.close();
    }
}