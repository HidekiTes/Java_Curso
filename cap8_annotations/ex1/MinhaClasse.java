/*
Demonstrar o uso correto da anotação @Override para sobrescrever métodos em
classes Java e entender os problemas que podem surgir sem ela.

Instruções:
    1. Crie uma classe chamada SuperClasse com um método chamado imprime(). O
    método deve imprimir a mensagem "imprime".
    2. Crie uma classe chamada MinhaClasse que estende a SuperClasse. Sobrescreva
    o método imprime() na MinhaClasse para que ele imprima a mensagem
    "imprime diferente".
    3. Certifique-se de usar a anotação @Override ao sobrescrever o método na
    MinhaClasse.
    4. Na SuperClasse, adicione um comentário ao método imprime() explicando que
    ele será sobrescrito na classe filha.
*/

public class SuperClasse {
    /**
     * Imprime a mensagem "imprime".
     * Este método será sobrescrito na classe filha.
     */
    public void imprime() {
        // Você deve comentar esse método para ver o erro de compilação (para testar a
        // anotação @Override).
        System.out.println("imprime");
    }
}

public class MinhaClasse extends SuperClasse {
    @Override
    public void imprime() {
        System.out.println("imprime diferente");
    }

    public static void main(String[] args) {
        MinhaClasse minhaInstancia = new MinhaClasse();
        minhaInstancia.imprime();
    }
}
