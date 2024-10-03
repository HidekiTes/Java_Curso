/* 
Imagine que você está desenvolvendo um sistema para gerenciar o
estoque de uma padaria. Vamos criar um programa em Java que
permita ao usuário registrar a quantidade de farinha e açúcar
disponíveis.

Instruções: 
Crie uma classe chamada ControleEstoquePadaria.
Declare duas variáveis:
    quantidadeFarinha (do tipo inteiro) para representar
    a quantidade de farinha disponível.
    quantidadeAcucar (do tipo inteiro) para representar a
    quantidade de açúcar disponível.
Atribua valores iniciais às variáveis (por exemplo, 10
para farinha e 5 para açúcar).
Exiba mensagens na tela informando as quantidades de
farinha e açúcar.
*/

public class Main {
    public static void main(String[] args) {
    // Declaração das variáveis
    int quantidadeFarinha = 10; // Quantidade inicial de farinh
    int quantidadeAcucar = 5; // Quantidade inicial de açúcar
    // Exibição das quantidades
    System.out.println("Quantidade de farinha disponível: " + quantidadeFarinha);
    System.out.println("Quantidade de açúcar disponível: " + quantidadeAcucar);
    }
}