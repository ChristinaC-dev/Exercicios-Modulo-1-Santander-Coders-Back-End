import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a unidade de temperatura atual (CELSIUS, FAHRENHEIT, KELVIN):");
        UnidadeTemperatura unidadeAtual = UnidadeTemperatura.valueOf(scanner.nextLine().toUpperCase());

        System.out.println("Digite a unidade de temperatura desejada (CELSIUS, FAHRENHEIT, KELVIN):");
        UnidadeTemperatura unidadeDesejada = UnidadeTemperatura.valueOf(scanner.nextLine().toUpperCase());

        System.out.println("Digite a temperatura atual:");
        double temperaturaAtual = scanner.nextDouble();

        double temperaturaConvertida = unidadeAtual.converterPara(unidadeDesejada, temperaturaAtual);

        System.out.printf("Temperatura convertida: %.2f %s%n", temperaturaConvertida, unidadeDesejada.name());

        scanner.close();
    }
}

enum UnidadeTemperatura {
    CELSIUS {
        @Override
        public double paraCelsius(double temperatura) {
            return temperatura;
        }

        @Override
        public double paraFahrenheit(double temperatura) {
            return (temperatura * 9 / 5) + 32;
        }

        @Override
        public double paraKelvin(double temperatura) {
            return temperatura + 273.15;
        }
    },
    FAHRENHEIT {
        @Override
        public double paraCelsius(double temperatura) {
            return (temperatura - 32) * 5 / 9;
        }

        @Override
        public double paraFahrenheit(double temperatura) {
            return temperatura;
        }

        @Override
        public double paraKelvin(double temperatura) {
            return (temperatura + 459.67) * 5 / 9;
        }
    },
    KELVIN {
        @Override
        public double paraCelsius(double temperatura) {
            return temperatura - 273.15;
        }

        @Override
        public double paraFahrenheit(double temperatura) {
            return (temperatura * 9 / 5) - 459.67;
        }

        @Override
        public double paraKelvin(double temperatura) {
            return temperatura;
        }
    };


    public abstract double paraCelsius(double temperatura);
    public abstract double paraFahrenheit(double temperatura);
    public abstract double paraKelvin(double temperatura);


    public double converterPara(UnidadeTemperatura destino, double temperatura) {
        if (destino == CELSIUS) {
            return paraCelsius(temperatura);
        } else if (destino == FAHRENHEIT) {
            return paraFahrenheit(temperatura);
        } else {
            return paraKelvin(temperatura);
        }
    }
}