class informaRegras {
    @Deprecated
    public void mostrarRegrasParaAposentadoria() {
        System.out.println("Regras para a Aposentadoria");
    }

    public void mostrarNovasRegrasParaAposentadoria() {
        System.out.println("NOVAS Regras para a Aposentadoria");
    }
}

public class Previdencia {
    
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
    
        informaRegras regras = new informaRegras();

        //Uso do método obsoleto (deprecated)
        regras.mostrarRegrasParaAposentadoria();
        //Uso do método novo
        regras.mostrarNovasRegrasParaAposentadoria();
    }
}