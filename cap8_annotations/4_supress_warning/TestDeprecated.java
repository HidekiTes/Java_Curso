class informaRegras {
    @Deprecated
    public void mostrarRegrasParaAposentadoria() {
        System.out.println("Regras para a Aposentadoria");
    }

    public void mostrarNovasRegrasParaAposentadoria() {
        System.out.println("NOVAS Regras para a Aposentadoria");
    }

    public void chamarMetodoObsoletoNaMesmaClasse() {
        mostrarRegrasParaAposentadoria();
    }
}

public class TestDeprecated {

    public static void main(String[] args) {
    
        informaRegras regras = new informaRegras();

        regras.chamarMetodoObsoletoNaMesmaClasse();
    }
}