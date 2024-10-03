/*
Demonstrar a aplicação prática dos comandos continue e break em uma estrutura de
repetição em Java, com o objetivo de pular a impressão de números múltiplos de 3 e
interromper a repetição no número 7.

Instruções
1. Inicie um laço for que comece em 1 e vá até 10.
2. Verifique se o número atual é divisível por 3 usando a condição i % 3 == 0. Se
verdadeiro, utilize o continue para pular a iteração atual e continuar com a
próxima iteração.
3. Verifique se o número atual é 7 usando a condição i == 7. Se verdadeiro, utilize o
break para interromper o loop e encerrar a execução do código.
4. Imprima o número atual do loop, a menos que seja divisível por 3 ou seja igual a 7
*/

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if(i % 3 == 0) {
            continue;
            }
            if(i == 7) {
            break;
            }
            System.out.println(i);
           }
           
    }
}
