/*
Instruções:
   1. Declare um array de inteiros com um tamanho fixo (por exemplo, 6 elementos).
   2. Preencha o array manualmente com números pares (por exemplo, 2, 4, 6, ...).
   3. Imprima todos os elementos do array em uma única linha.
*/

public class ExercicioArrays {
   public static void main(String[] args) {
      int tamanho = 6; // Tamanho do array (pode ser alterado)
      int[] meuArray = new int[tamanho];
      // Preenchendo manualmente o array com números pares
      for (int i = 0; i < tamanho; i++) {
         meuArray[i] = 2 * (i + 1);
      }
      System.out.print("Elementos do array: ");
      for (int i = 0; i < tamanho; i++) {
         System.out.print(meuArray[i] + " ");
      }
   }
}
