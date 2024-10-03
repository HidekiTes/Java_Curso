/*
Praticar o uso dos operadores de incremento (++) e decremento (--) em Java.

Instruções:
1. Declare uma variável inteira chamada contador e inicialize-a com o valor 5.
2. Utilize o operador de incremento para aumentar o valor de contador em 1.
3. Em seguida, utilize o operador de decremento para diminuir o valor de contador
em 1.
4. Imprima o valor final de contador.
 */
public class IncrementoDecremento {
    public static void main(String[] args) {
        int contador = 5;

        // Incremento
        contador++; // Equivalente a contador = contador + 1;
        // Decremento
        contador--; // Equivalente a contador = contador - 1;

        System.out.println("Valor final do contador: " + contador);
    }
}
