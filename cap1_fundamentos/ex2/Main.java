/*
Criar um programa Java que calcule a área de um retângulo com
base em sua largura e altura.

Instruções:
1. Crie uma classe chamada CalculadoraAreaRetangulo.
2. Dentro da classe, declare duas variáveis do tipo double: largura
e altura.
3. Atribua valores às variáveis largura e altura (por exemplo, 5.0
e 3.0, respectivamente).
4. Calcule a área do retângulo usando a fórmula:
5. Exiba o resultado na tela com uma mensagem informativa.

 */

public class Main {
    public static void main(String[] args) {
        double largura = 5.0;
        double altura = 3.0;
        double area = largura * altura;
        System.out.println("Largura do retângulo: " + largura);
        System.out.println("Altura do retângulo: " + altura);
        System.out.println("Área do retângulo: " + area);
    }
}
