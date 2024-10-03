/*
Este exercício envolve a criação de um programa em Java que calcula a soma dos
números de 1 a 10 usando um loop for.

Instruções
1. Inicialização: Inicie uma variável chamada soma com o valor 0.
2. Loop: Execute um loop enquanto i for menor ou igual a 10.
3. Acumulação: A cada iteração, some o valor de i à variável soma.
4. Incremento: Incremente i em 1 a cada iteração
 */

public class SomaNumeros {
    public static void main(String[] args) {
        int soma = 0; // Inicializa a variável soma com 0
        for (int i = 1; i <= 10; i++) {
            soma += i; // Soma o valor de i à variável soma
        }
        System.out.println("A soma dos números de 1 a 10 é: " +
                soma);
    }

}
