/*
Instruções
1. Crie uma classe chamada DiasNoMes.
2. Dentro da classe, declare uma variável chamada mes e inicialize-a com um valor
(por exemplo, "Abril").
3. Use um bloco switch para determinar o número de dias no mês com base no
valor de mes.
4. Considere os seguintes cenários:
    Se mes for "Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro" ou
    "Dezembro", o número de dias é 31.
    Se mes for "Abril", "Junho", "Setembro" ou "Novembro", o número de dias é
    30.
    Se mes for "Fevereiro", o número de dias é 28 (considerando um ano não
    bissexto).
    Se mes não corresponder a nenhum dos casos anteriores, exiba "Mês
    desconhecido".
5. Imprima o resultado na saída.

Tipo de switch a ser usado
Use o switch inicialização.
 */

public class DiasNoMes {
    public static void main(String[] args) {
        String mes = "Abril"; // Altere o valor para testar diferentes meses
        int numeroDeDias = switch (mes) {
            case "Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro", "Dezembro" -> 31;
            case "Abril", "Junho", "Setembro", "Novembro" -> 30;
            case "Fevereiro" -> 28; // Considerando um ano não bissexto
            default -> -1; // Valor inválido para mês desconhecido
        };
        if (numeroDeDias != -1) {
            System.out.println("Número de dias em " + mes + ": " +
                    numeroDeDias);
        } else {
            System.out.println("Mês desconhecido.");
        }
    }

}
