/*
Objetivo
Entender como a palavra-chave super é usada para chamar métodos da superclasse
em Java.

Instruções
    1. Crie uma classe chamada Veiculo com um método chamado acelerar(). O
    método acelerar() deve imprimir "Veículo acelerando!".
    2. Crie uma subclasse chamada Carro que estenda a classe Veiculo.
    3. Na classe Carro, sobrescreva o método acelerar() para imprimir "Carro
    acelerando!".
    4. Utilize a palavra-chave super para chamar o método acelerar() da superclasse
    Veiculo dentro do método sobrescrito da classe Carro.
*/

class Veiculo {
    void acelerar() {
        System.out.println("Veículo acelerando!");
    }
}

class Carro extends Veiculo {
    @Override
    void acelerar() {
        System.out.println("Carro acelerando!");
        super.acelerar(); // Chamando o método da superclasse
    }
}

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.acelerar();
    }
}
