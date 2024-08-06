import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor inicial investido em R$: ");
        double valorInicial = scanner.nextDouble();

        System.out.println("Informe o juros ao mês em %: ");
        double taxaJuros = scanner.nextDouble();

        System.out.println("Informe o tempo em meses que o dinheiro ficará investido: ");
        int tempoMeses = scanner.nextInt();

        double taxaJurosDecimal = taxaJuros / 100;

        double saldo = valorInicial;
        double jurosMensais;

        for (int mes = 1; mes <= tempoMeses; mes++) {
            jurosMensais = saldo * taxaJurosDecimal;
            saldo += jurosMensais;

            System.out.printf("Mês %d: Juros: R$ %.2f, saldo: R$ %.2f%n", mes, jurosMensais, saldo);
        }

        scanner.close();
    }
}
