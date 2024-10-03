/*
Objetivo:
Criar uma interface chamada PedidoRestaurante que define métodos para adicionar
itens ao pedido e calcular o valor total.

Instruções:
    1. Crie a interface PedidoRestaurante com os seguintes métodos:
    adicionarItem(String item, double preco): Adiciona um item ao
    pedido com o nome e preço.
    calcularTotal(): Calcula o valor total do pedido.
    2. Implemente a interface em uma classe chamada Pedido que mantém uma lista
    de itens e seus preços.
    3. Teste sua implementação criando um pedido com alguns itens (por exemplo,
    "Hambúrguer", "Batata Frita" e "Refrigerante") e exiba o valor total.
 */

interface PedidoRestaurante {
    void adicionarItem(String item, double preco);

    double calcularTotal();
}

public class Pedido implements PedidoRestaurante {
    private double total = 0;

    @Override
    public void adicionarItem(String item, double preco) {
        System.out.println("Adicionando " + item + " (R$" + preco +
                ") ao pedido.");
        total += preco;
    }

    @Override
    public double calcularTotal() {
        return total;
    }

    public static void main(String[] args) {
        PedidoRestaurante pedido = new Pedido();
        pedido.adicionarItem("Hambúrguer", 15.0);
        pedido.adicionarItem("Batata Frita", 8.0);
        pedido.adicionarItem("Refrigerante", 4.0);
        System.out.println("Valor total do pedido: R$" +
                pedido.calcularTotal());
    }
}
