/*
Entender o uso da palavra-chave final para variáveis em Java.

Instruções
    1. Crie uma classe chamada FinalVariables.
    2. Declare uma variável final do tipo int chamada numeroMaximo e atribua a ela
    um valor inteiro (por exemplo, 100).
    3. Declare outra variável final do tipo String chamada mensagem e atribua a ela
    uma mensagem de sua escolha (por exemplo, "Bem-vindo ao mundo da
    programação!").
    4. Tente alterar o valor das variáveis numeroMaximo e mensagem dentro do método
    main e observe os erros gerados.
    5. Crie um método chamado imprimirValoresFinais que imprima os valores das
    variáveis numeroMaximo e mensagem


 */

public class FinalVariables {
    private final int numeroMaximo = 100;
    private final String mensagem = "Bem-vindo ao mundo da programação!";

    public void imprimirValoresFinais() {
        System.out.println("Número máximo: " + numeroMaximo);
        System.out.println("Mensagem: " + mensagem);
    }

    public static void main(String[] args) {
        FinalVariables exemplo = new FinalVariables();
        exemplo.imprimirValoresFinais();
        // Tente alterar o valor das variáveis abaixo e observe os erros:
        // exemplo.numeroMaximo = 200; // Isso resultará em um erro de compilação
        // exemplo.mensagem = "Nova mensagem"; // Isso também resultará em um erro
    }
}