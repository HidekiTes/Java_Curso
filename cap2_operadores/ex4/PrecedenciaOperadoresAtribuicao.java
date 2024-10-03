/* 
Neste exercício você praticará o comportamento de precedência de operadores.

Instruções:
1. Crie uma classe chamada PrecedenciaOperadoresAtribuicao.
2. Dentro da classe, declare uma variável inteira chamada numero e inicialize-a com
um valor (por exemplo, 5).
3. Em seguida, siga as instruções abaixo:
    Pré-incremento (++var): Primeiro, o valor da variável é incrementado e,
    em seguida, o valor incrementado é usado na expressão. Implemente o
    pré-incremento para a variável numero e imprima o resultado.
   
    Pós-incremento (var++): Primeiro, o valor atual da variável é usado na
    expressão e, em seguida, o valor da variável é incrementado. Implemente o
    pós-incremento para a variável numero e imprima o resultado.
   
    Pré-decremento (--var): Primeiro, o valor da variável é decrementado e,
    em seguida, o valor decrementado é usado na expressão. Implemente o
    pré-decremento para a variável numero e imprima o resultado.
   
    Pós-decremento (var--): Primeiro, o valor atual da variável é usado na
    expressão e, em seguida, o valor da variável é decrementado. Implemente
    o pós-decremento para a variável numero e imprima o resultado.




 */
public class PrecedenciaOperadoresAtribuicao {
    public static void main(String[] args) {
        int numero = 5;
        // Pré-incremento
        System.out.println("Valor antes do pré-incremento: " + numero);
        numero = numero + 1;
        System.out.println("Valor após o pré-incremento: " + numero);
        // Pós-incremento
        System.out.println("Valor antes do pós-incremento: " + numero);
        numero = numero + 1;
        System.out.println("Valor após o pós-incremento: " + numero);
        // Pré-decremento
        System.out.println("Valor antes do pré-decremento: " + numero);
        numero = numero - 1;
        System.out.println("Valor após o pré-decremento: " + numero);
        // Pós-decremento
        System.out.println("Valor antes do pós-decremento: " + numero);
        numero = numero - 1;
        System.out.println("Valor após o pós-decremento: " + numero);
    }

}
