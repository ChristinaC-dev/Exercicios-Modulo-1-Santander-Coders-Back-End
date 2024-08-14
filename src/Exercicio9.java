import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio9 {

   public static void main(String[] args) {

       String caminhoDoArquivo = "caminho/do/seu/arquivo.txt";

       
       BufferedReader leitor = null;

       try {

           leitor = new BufferedReader(new FileReader(caminhoDoArquivo));


           String linha;
           while ((linha = leitor.readLine()) != null) {
               System.out.println(linha);
           }
       } catch (IOException e) {

           System.err.println("Erro ao ler o arquivo: " + e.getMessage());
       } finally {

           if (leitor != null) {
               try {
                   leitor.close();
               } catch (IOException e) {
                   System.err.println("Erro ao fechar o arquivo: " + e.getMessage());
               }
           }
       }
   }
}
