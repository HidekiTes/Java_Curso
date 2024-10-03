class ExemploFinal {
    // Definição de Constante - uso de final
    final int CODIGO_FIXO = 10;

    // Método final
    final void meuMetodo() {
        System.out.println("Este é um método final.");
    }
}

public class TestFinalKeyword {
    public static void main(String[] args) {
        ExemploFinal testFinal = new ExemploFinal();

        int testFinalVariableLocal = 777;
        testFinalVariableLocal = 3256;
        System.out.println("Valor da variavel: " + testFinalVariableLocal);
        // testFinal.CODIGO_FIXO = 555; -> Erro

        System.out.println("Valor da constante: " + testFinal.CODIGO_FIXO);
        testFinal.meuMetodo();
    }
}
