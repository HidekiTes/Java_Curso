/*
Demonstrar o uso da palavra-chave final em métodos de classes Java.

Instruções:
    1. Crie uma classe chamada Calculadora.
    2. Defina um método chamado somar(int a, int b) na classe Calculadora. Esse
    método deve retornar a soma dos valores a e b.
    3. Declare o método somar() como final.
    4. Crie uma subclasse chamada CalculadoraCientifica que estenda a classe
    Calculadora.
    5. Tente sobrescrever o método somar() na classe CalculadoraCientifica. Isso
    deve gerar um erro, pois o método é final.
 */

class Calculadora {
    final int somar(int a, int b) {
        return a + b;
    }
}

class CalculadoraCientifica extends Calculadora {
    // Tente descomentar o trecho abaixo para ver o erro:
    // @Override
    // int somar(int a, int b) {
    // return a + b;
    // }
}

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Resultado: " + calculadora.somar(5, 3));
    }
}
