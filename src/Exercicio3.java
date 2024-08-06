import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();


        if (numero <= 0) {
            System.out.println("O número deve ser um inteiro positivo.");
            return;
        }


        int soma = 0;
        for (int i = 1; i <= numero; i++) {
            soma += i;
        }


        System.out.println("A soma de " + numero + " com todos os seus antecessores é: " + soma);

        scanner.close();
    }
}
