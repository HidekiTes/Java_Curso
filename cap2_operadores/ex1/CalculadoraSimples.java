/*
Criar um programa Java que realiza operações aritméticas básicas usando os
operadores mencionados.

Instruções
1. Crie uma classe chamada CalculadoraSimples.
2. Dentro da classe, declare duas variáveis inteiras chamadas a e b.
3. Atribua valores diferentes a essas variáveis (por exemplo, a = 10 e b = 2).
4. Calcule e imprima os seguintes resultados:
    Soma de a e b.
    Subtração de a por b.
    Multiplicação de a por b.
    Divisão de a por b (como um número de ponto flutuante).
    Resto da divisão entre a e b.
5. Execute o programa e verifique se os resultados estão corretos.
 */

public class CalculadoraSimples {

    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        double divisao = (double) a / b;
        int modulo = a % b;
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Módulo: " + modulo);
    }

}
