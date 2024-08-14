import java.util.Scanner;

public class Exercicio10 {

   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.println("Digite uma frase ou um número:");

       String entrada = scanner.nextLine();

       int numero = 0;

       try {
           numero = Integer.parseInt(entrada);
           System.out.println("Você digitou um número válido: " + numero);
       } catch (NumberFormatException e) {
           System.out.println("A entrada não é um número válido.");
       } finally {
           scanner.close();
       }
   }
}
