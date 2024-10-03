/*
Instruções
Este exercício tem como objetivo testar seu entendimento sobre encapsulamento em
Java, utilizando os modificadores de acesso public e private. Você criará uma classe
Produto com atributos que representam as características de um produto, utilizando
apenas construtores para inicializar os atributos.

Passos para fazer o exercício
    1. Crie uma classe chamada Produto.
    2. Adicione três atributos à classe Produto: nome, preco e quantidadeEmEstoque.
    3. Utilize o modificador de acesso private para os atributos.
    4. Crie um construtor público para inicializar os atributos.
    5. Teste a classe Produto em uma classe principal, criando instâncias e exibindo os
    atributos através de um método de exibição.
*/

// Classe Produto
public class Produto {
    // Atributos privados
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // Construtor público
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Método para exibir informações do produto
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em Estoque: " +
                quantidadeEmEstoque);
    }
}

