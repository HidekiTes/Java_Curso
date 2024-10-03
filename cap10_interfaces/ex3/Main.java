/*
Objetivo:
Demonstrar o uso de atributos de interfaces em Java para implementar um sistema
simples de controle de estoque.

Instruções:
    1. Crie uma interface chamada Produto com os seguintes atributos:
    nome (String): o nome do produto.
    quantidade (int): a quantidade disponível em estoque.
    2. Implemente uma classe chamada ProdutoImpl que implementa a interface
    Produto.
    3. Na classe ProdutoImpl, crie um construtor que inicialize os atributos nome e
    quantidade.
    4. Adicione métodos para:
    Atualizar a quantidade de produtos em estoque (por exemplo,
    adicionarQuantidade(int quantidade) e removerQuantidade(int
    quantidade)).
    Exibir informações sobre o produto (por exemplo, getNome(),
    getQuantidade()).
*/

interface Produto {
    String getNome();

    int getQuantidade();

    void adicionarQuantidade(int quantidade);

    void removerQuantidade(int quantidade);
}

class ProdutoImpl implements Produto {
    private String nome;
    private int quantidade;

    public ProdutoImpl(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    @Override
    public void removerQuantidade(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Produto produto = new ProdutoImpl("Caneta", 50);
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Quantidade em estoque: " + produto.getQuantidade());
        produto.adicionarQuantidade(20);
        System.out.println("Nova quantidade após adição: " + produto.getQuantidade());
        produto.removerQuantidade(15);
        System.out.println("Nova quantidade após remoção: " + produto.getQuantidade());
    }
}
