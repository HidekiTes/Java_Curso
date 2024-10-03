/*
Demonstrar o uso da palavra-chave final em uma classe Java.

Instruções:
    1. Crie uma classe chamada Veiculo.
    2. Marque a classe Veiculo como final, impedindo que outras classes a estendam.
    3. Dentro da classe Veiculo, declare um método chamado ligarMotor(). Esse
    método deve imprimir "Motor ligado".
    4. Crie uma subclasse chamada Carro que tente estender a classe Veiculo. Isso
    deve gerar um erro, pois a classe Veiculo é final.
 */

final class Veiculo {
    void ligarMotor() {
        System.out.println("Motor ligado");
    }
}
// Tente descomentar o trecho abaixo para ver o erro:
// class Carro extends Veiculo {
// // Erro! Classe 'Veiculo' é final e não pode ser estendida.
// }
