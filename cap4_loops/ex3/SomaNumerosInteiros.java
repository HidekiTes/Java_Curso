/*
Instruções
1. Objetivo: Escrever um programa Java que calcule a soma de todos os números
inteiros positivos menores ou iguais a esse número.
2. Passos:
   Defina uma variável com número inteiro positivo (valor 10, por exemplo).
   Utilize um laço do-while para iterar e acumular a soma dos números
   inteiros positivos.
   Exiba o resultado da soma.

 */

public class SomaNumerosInteiros {
   public static void main(String[] args) {
      int numero = 10; // Exemplo de número inteiro positivo
      int soma = 0;
      // Calcula a soma dos números inteiros positivos
      do {
         soma += numero;
         numero--; // Decrementa o número para a próxima iteração
      } while (numero > 0);
      // Exibe o resultado da soma
      System.out.println("A soma dos números inteiros positivos é:" + soma);
   }
}
