/*
Faça um programa que calcule a soma dos números de 1 até 1000 e exiba o resultado.

Instruções:
   1. Crie um programa Java que calcule a soma dos números de 1 até 1000.
   2. Utilize um array para armazenar os números.
   3. Imprima o resultado da soma.

*/

public class SomaNumeros {
   public static void main(String[] args) {
      int[] numeros = new int[1000];
      int soma = 0;
      for (int i = 1; i <= 1000; i++) {
         numeros[i - 1] = i;
         soma += i;
      }
      System.out.println("Soma dos números de 1 até 1000: " +
            soma);
   }
}
