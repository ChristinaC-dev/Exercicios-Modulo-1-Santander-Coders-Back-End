```markdown
# Exercícios de Lógica de Programação - Módulo 1

Este repositório contém uma coleção de exercícios de lógica de programação do módulo 1 do curso Santander Coders. Os exercícios cobrem uma variedade de tópicos fundamentais, incluindo cálculos, estruturas condicionais, enums, e manipulação de matrizes.

## Exercícios

### Exercício 1: Índice de Massa Corporal (IMC)
Crie um programa que pergunte qual a altura em metros e o peso em Kg de uma pessoa e retorne o IMC e a classificação deste IMC.

A fórmula para calcular o IMC é:

IMC = peso / (altura * altura)

Para a classificação do IMC, utilize a tabela disponível [Tabela IMC - Wikipedia](https://en.wikipedia.org/wiki/Body_mass_index).

### Exercício 2: Média de Notas
Faça um programa que peça para o usuário quantas provas ele fez, depois pergunte para ele a nota inteira, de 0 a 100, de cada prova e retorne a média, a maior nota e a menor nota entre as provas informadas.

### Exercício 3: Soma de Antecessores
Faça um programa que pede para o usuário digitar um número inteiro positivo. Seu programa deverá calcular e retornar a soma desse número com todos os seus antecessores positivos.

### Exercício 4: FizzBuzz
Faça um programa que imprima os números de 1 a 100, porém com as seguintes condições:
- Caso o número seja divisível por 3, imprimir "Fizz" no lugar do número.
- Caso o número seja divisível por 5, imprimir "Buzz" no lugar do número.
- Caso o número seja divisível por 3 e 5, imprimir "FizzBuzz" no lugar do número.

### Exercício 5: Conversão de Temperatura
Crie um enum chamado `UnidadeTemperatura` representando unidades de temperatura (CELSIUS, FAHRENHEIT, KELVIN). Escreva um programa que utiliza um `Scanner` para obter a unidade de temperatura atual do usuário e a unidade desejada, pedindo a temperatura atual e imprimindo a temperatura convertida. Considere as seguintes fórmulas de conversão:
- **CELSIUS**:
  - F -> (celsius * 9 / 5) + 32
  - K -> celsius + 273.15
- **FAHRENHEIT**:
  - C -> (fahrenheit - 32) * 5 / 9
  - K -> (fahrenheit + 459.67) * 5 / 9

### Exercício 6: Cálculo de Juros
Pergunte para o usuário o valor que será investido em uma aplicação, a taxa de juros ao mês e o tempo que o dinheiro ficará aplicado. Seu programa deverá exibir quanto de juros será pago e o saldo total em cada mês.

### Exercício 7: Matriz - Maior Elemento
Crie um programa em Java que recebe o tamanho da linha e coluna para definir uma matriz de números inteiros. Solicite ao usuário os valores de cada elemento e encontre o maior elemento dentro desta matriz e informe ao usuário.

Exemplo de entrada:

[1, 50, 6]
[55, 100, 2]
[20, 7, 9]


Saída: O maior elemento da matriz é: 100

### Exercício 8: Matriz 3x3 - Soma da Diagonal Principal
Escreva um programa Java que declara uma matriz 3x3 e pede ao usuário para informar seus valores. Em seguida, mostre todos os valores da matriz e a soma dos elementos da diagonal principal.

Exemplo de saída:

1 2 3
4 5 6
7 8 9

Os valores da diagonal principal são 1, 5, 9 e a soma é: 15

````

## Como Executar os Exercícios

1. Clone o repositório:
   ```bash
   git clone https://github.com/ChristinaC-dev/Exercicios-Modulo-1-Santander-Coders-Back-End.git
   ```

2. Navegue até o diretório do repositório:
   ```bash
   cd Exercicios-Modulo-1-Santander-Coders-Back-End
   ```

3. Compile e execute o código desejado.

## Requisitos

- JDK 8 ou superior para a execução dos códigos Java.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

```
