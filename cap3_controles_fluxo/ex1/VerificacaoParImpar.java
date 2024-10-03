/*
Instruções:
1. Defina um número inteiro fixo: O programa deve receber um número inteiro
fixo (por exemplo, 10). Se desejar, você pode alterar esse valor para qualquer
outro número inteiro.
2. Verificação de paridade: O operador % (resto da divisão) é usado para verificar
se o número é divisível por 2. Se o resto da divisão for igual a 0, o número é par;
caso contrário, é ímpar.
3. Exibição da mensagem: Dependendo do resultado da verificação, o programa
exibirá a mensagem apropriada: "O número é par" ou "O número é ímpar".
 */

public class VerificacaoParImpar {
    public static void main(String[] args) {
        int numero = 10; // Número fixo (pode ser alterado)
        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

    }

}
