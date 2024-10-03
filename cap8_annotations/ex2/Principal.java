/*
Objetivo
O objetivo deste exercício é praticar a criação e utilização de métodos em Java, além
de entender o uso da anotação @Deprecated.

Instruções
    1. Crie uma classe chamada MinhaClasse com dois métodos: calcularSoma e
    calcularProduto.
    2. Utilize a anotação @Deprecated no método calcularProduto para indicar que
    ele não deve ser mais utilizado.
    3. Crie uma classe chamada Principal com o método main para testar os métodos
    da classe MinhaClasse.
    4. Compile e execute o programa para verificar os resultados.
*/

public class MinhaClasse {
    public int calcularSoma(int a, int b) {
        return a + b;
    }

    @Deprecated
    public int calcularProduto(int a, int b) {
        return a * b;
    }
}

public class Principal {
    public static void main(String[] args) {
        MinhaClasse minhaClasse = new MinhaClasse();
        int resultadoSoma = minhaClasse.calcularSoma(5, 3);
        int resultadoProduto = minhaClasse.calcularProduto(5, 3);
        System.out.println("Soma: " + resultadoSoma);
        System.out.println("Produto: " + resultadoProduto);
    }
}