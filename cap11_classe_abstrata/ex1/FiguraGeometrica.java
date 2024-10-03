/*
Objetivo
O objetivo deste exercício é praticar a criação e utilização de classes abstratas e a
implementação de métodos abstratos em Java.

Instruções
    1. Crie uma classe abstrata chamada FiguraGeometrica com dois métodos
    abstratos: calcularArea e calcularPerimetro.
    2. Implemente a classe FiguraGeometrica em uma classe concreta chamada
    Retangulo.
    3. Crie uma classe chamada Main com o método main para testar a implementação
    da classe Retangulo.
    4. Compile e execute o programa para verificar os resultados.
*/

public abstract class FiguraGeometrica {
    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}

public class Retangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5.0, 3.0);
        System.out.println("Área do retângulo: " +
                retangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " +
                retangulo.calcularPerimetro());
    }
}
