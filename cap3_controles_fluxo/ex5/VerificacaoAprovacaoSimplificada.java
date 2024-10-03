/*
Você está desenvolvendo um sistema de notas para uma escola. O sistema deve
verificar se um aluno foi aprovado em uma disciplina com base em suas notas.
Implemente um programa que utilize operadores lógicos para determinar se um aluno
foi aprovado ou não.

Orientações:
1. Declare duas variáveis inteiras: nota1 e nota2.
2. Atribua valores às variáveis nota1 (primeira nota) e nota2 (segunda nota).
3. Considere que a aprovação ocorre se a média das notas ((nota1 + nota2) / 2)
for maior ou igual a 6.
4. Utilize operadores lógicos para verificar se o aluno foi aprovado.
5. Exiba uma mensagem indicando se o aluno foi aprovado ou não.
 */

public class VerificacaoAprovacaoSimplificada {
    public static void main(String[] args) {
        int nota1 = 7;
        int nota2 = 5;
        double media = (nota1 + nota2) / 2.0;
        if (media >= 6) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno não aprovado.");
        }
    }
}
