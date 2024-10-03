/*
Objetivo
O objetivo deste exercício é praticar a criação e utilização de classes abstratas e a
implementação de métodos concretos em Java.

Instruções
    1. Crie uma classe abstrata chamada Loja com atributos e métodos para abrir e
    fechar a loja.
    2. Implemente a classe Loja em uma classe concreta chamada LojaComercial.
    3. Crie uma classe chamada Main com o método main para testar a implementação
    da classe LojaComercial.
    4. Compile e execute o programa para verificar os resultados.
*/

abstract class Loja {
    private String cnpj;
    private String razaoSocial;
    private boolean aberta;

    public Loja(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.aberta = false;
    }

    // Método para abrir a loja
    public void abrir() {
        this.aberta = true;
    }

    // Método para fechar a loja
    public void fechar() {
        this.aberta = false;
    }
}

// Classe concreta LojaComercial
class LojaComercial extends Loja {
    public LojaComercial(String cnpj, String razaoSocial) {
        super(cnpj, razaoSocial);
    }
}

// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        LojaComercial minhaLoja = new LojaComercial("123456789", "Minha Loja");
        minhaLoja.abrir(); // Abre a loja
        System.out.println("A loja está aberta? " + minhaLoja.aberta); // Exibe se a loja está aberta
    }
}