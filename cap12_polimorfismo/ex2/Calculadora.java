/*
Objetivo:
O objetivo deste exercício é criar uma calculadora polimórfica em Java que pode
realizar operações de adição, subtração, multiplicação e divisão.

Instruções
    1. Crie uma classe abstrata chamada Operacao com um método abstrato calcular.
    2. Implemente a classe Operacao em quatro classes concretas: Soma, Subtracao,
    Multiplicacao e Divisao.
    3. Crie uma classe chamada Calculadora com o método main para testar as
    implementações das operações matemáticas.
    4. Compile e execute o programa para verificar os resultados.
*/
abstract class Operacao {
    public abstract double calcular(double a, double b);
}

class Soma extends Operacao {
    @Override
    public double calcular(double a, double b) {
        return a + b;
    }
}

class Subtracao extends Operacao {
    @Override
    public double calcular(double a, double b) {
        return a - b;
    }
}

class Multiplicacao extends Operacao {
    @Override
    public double calcular(double a, double b) {
        return a * b;
    }
}

class Divisao extends Operacao {
    @Override
    public double calcular(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return Double.NaN; // Retorna NaN (Not-a-Number) para representar erro
        }
    }
}

public class Calculadora {
    public static void main(String[] args) {
        Operacao soma = new Soma();
        Operacao subtracao = new Subtracao();
        Operacao multiplicacao = new Multiplicacao();
        Operacao divisao = new Divisao();
        double num1 = 10;
        double num2 = 5;
        System.out.println("Soma: " + soma.calcular(num1, num2));
        System.out.println("Subtração: " + subtracao.calcular(num1, num2));
        System.out.println("Multiplicação: " + multiplicacao.calcular(num1, num2));
        System.out.println("Divisão: " + divisao.calcular(num1, num2));
    }
}
