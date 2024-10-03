class ExemploFinal {
    // Definição de Constante - uso de final
    final int CODIGO_FIXO = 10;

    // Método final
    final void meuMetodo() {
        System.out.println("Este é um método final.");
    }
}

public class TestFinalKeyword extends ExemploFinal {
    // Override não funciona
    // final void meuMetodo() {
    //     System.out.println("Este é um método sobreescrito.");
    // }

    public static void main(String[] args) {
        ExemploFinal testFinal = new ExemploFinal();
        
        testFinal.meuMetodo();
    }
}
