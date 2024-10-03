/*
Neste exercício, você usará diferentes operadores de atribuição para manipular o valor
de uma variável inteira.

Instruções:
1. Declare uma variável inteira chamada numero e inicialize-a com um valor
qualquer (por exemplo, 5).
2. Utilize os seguintes operadores de atribuição para modificar o valor de numero:
    Atribuição de adição (+=): Incremente o valor de numero em 3.
    Atribuição de subtração (-=): Subtraia 2 do valor de numero.
    Atribuição de multiplicação (*=): Multiplique o valor de numero por 4.
    Atribuição de divisão (/=): Divida o valor de numero por 2.
3. Imprima o valor final da variável numero.

 */

public class OperadoresAtribuicaoExercicio {

    public static void main(String[] args) {
        // Declare e inicialize a variável
        int numero = 5;
        // Utilize os operadores de atribuição
        numero += 3; // Equivalente a numero = numero + 3;
        numero -= 2; // Equivalente a numero = numero - 2;
        numero *= 4; // Equivalente a numero = numero * 4;
        numero /= 2; // Equivalente a numero = numero / 2;
        // Imprima o resultado
        System.out.println("Valor final: " + numero);

    }

}
