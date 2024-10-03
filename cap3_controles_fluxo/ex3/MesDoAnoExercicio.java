/*
Criar um programa em Java que verifica o valor de uma variável representando um
mês do ano e exibe o nome desse mês.

Instruções
1. Crie uma variável chamada mes para representar um mês do ano (1 para janeiro,
2 para fevereiro, etc.).
2. Use a estrutura switch para verificar o valor de mes.
3. Com base no valor de mes, exiba uma mensagem correspondente ao mês.

Tipo de switch a ser usado
Use o switch legacy (legado), o switch antigo (que precisa colocar break).
 */

public class MesDoAnoExercicio {
    public static void main(String[] args) {
        int mes = 5; // Exemplo: 5 representa maio
        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Valor inválido para mês.");
        }
    }

}
