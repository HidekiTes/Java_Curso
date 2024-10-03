public class ExceptionDivisaoPorZero {
    public static void main(String[] args) {
        int totalNotas = 0;
        int quantidadeAlunos = 0;

        try {
            int media = totalNotas / quantidadeAlunos; // Divisão por Zero
        } catch (ArithmeticException e) {
            System.err.println("Problema: Divisão or Zero!");
        } finally {
            System.out.println("O programa terminou.");
        }

    }

}