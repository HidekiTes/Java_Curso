/*
Objetivo
O objetivo deste exercício é praticar a implementação de interfaces em Java e o uso de
métodos padrão (default) em interfaces.

Instruções
    1. Crie uma interface chamada Veiculo com os métodos iniciar, parar e um
    método padrão buzinar.
    2. Implemente a interface Veiculo em duas classes: Carro e Caminhao.
    3. Crie uma classe chamada Main com o método main para testar as
    implementações das classes Carro e Caminhao.
    4. Compile e execute o programa para verificar os resultados.
 */

interface Veiculo {
   void iniciar();

   void parar();

   default void buzinar() {
      System.out.println("Buzinando");
   }
}

class Carro implements Veiculo {
   public void iniciar() {
      System.out.println("Ligando o motor do carro...");
   }

   public void parar() {
      System.out.println("Parando o motor do carro...");
   }
}

class Caminhao implements Veiculo {
   public void iniciar() {
      System.out.println("Ligando o motor do caminhão...");
   }

   public void parar() {
      System.out.println("Parando o motor do caminhão...");
   }
}

public class Main {
   public static void main(String[] args) {
      Veiculo tesla = new Carro();
      Veiculo tata = new Caminhao();
      tesla.iniciar(); // Ligando o motor do carro...
      tesla.buzinar(); // Buzinando
      tata.iniciar(); // Ligando o motor do caminhão...
      tata.buzinar(); // Buzinando
   }
}
