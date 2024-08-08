import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Digite os valores da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("A matriz inserida é:");
        imprimirMatriz(matriz);

        int somaDiagonalPrincipal = 0;
        System.out.print("Os valores da diagonal principal são: ");
        for (int i = 0; i < 3; i++) {
            int valorDiagonal = matriz[i][i];
            System.out.print(valorDiagonal + " ");
            somaDiagonalPrincipal += valorDiagonal;
        }

        System.out.println();
        System.out.println("A soma é: " + somaDiagonalPrincipal);

        scanner.close();
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

