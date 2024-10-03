/*
O objetivo deste exercício é criar um programa em Java que conte quantos doces o
filho pode comer enquanto a condição estabelecida pela mãe for verdadeira (ou seja,
no máximo 3 doces).

Instruções:
Crie um programa em Java que conte quantos doces o filho pode comer
enquanto a condição estabelecida pela mãe for verdadeira (ou seja, no máximo 3
doces).
Passos
    Inicialização da variável: Declare uma variável inteira chamada
    contadorDoces e inicialize-a com o valor 1.
    Laço while: Utilize um laço while para repetir o seguinte bloco de código
    enquanto contadorDoces for menor ou igual a 3:
 */

public class ContagemDeDoces {
   public static void main(String[] args) {
      int contadorDoces = 1;
      while (contadorDoces <= 3) {
         System.out.println("Número de doces: " + contadorDoces);
         contadorDoces++;
      }
      System.out.println("Não pode comer mais doces.");
   }
}
