import java.util.Scanner;

public class Exercicio10 {

   public static void main(String[] args) {
       // Cria um Scanner para ler a entrada do usuário
       Scanner scanner = new Scanner(System.in);

       // Solicita ao usuário que digite uma frase ou número
       System.out.println("Digite uma frase ou um número:");

       // Lê a entrada do usuário como uma String
       String entrada = scanner.nextLine();

       // Declara uma variável para armazenar o número convertido
       int numero = 0;

       try {
           // Tenta converter a entrada para um número inteiro
           numero = Integer.parseInt(entrada);
           System.out.println("Você digitou um número válido: " + numero);
       } catch (NumberFormatException e) {
           // Trata o caso em que a entrada não pode ser convertida para um número inteiro
           System.out.println("A entrada não é um número válido.");
       } finally {
           // Fecha o Scanner
           scanner.close();
       }
   }
}
