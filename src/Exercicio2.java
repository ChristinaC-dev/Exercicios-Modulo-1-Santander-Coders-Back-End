import java.util.Scanner;

    public class Exercicio2{
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe a quantidade de provas:");
            int quantidadeProvas = scanner.nextInt();

            int[] notas = new int[quantidadeProvas];
            int somaNotas = 0;
            int maiorNota = Integer.MIN_VALUE;
            int menorNota = Integer.MAX_VALUE;


            for (int i = 0; i < quantidadeProvas; i++) {
                System.out.println("Informe a nota da prova " + (i + 1) + ":");
                notas[i] = scanner.nextInt();
                somaNotas += notas[i];
                if (notas[i] > maiorNota) {
                    maiorNota = notas[i];
                }
                if (notas[i] < menorNota) {
                    menorNota = notas[i];
                }
            }

            double mediaNotas = (double) somaNotas / quantidadeProvas;

            System.out.println("A menor nota é: " + menorNota);
            System.out.println("A maior nota é: " + maiorNota);
            System.out.println("A média das notas é: " + mediaNotas);

            scanner.close();
        }
    }

