abstract class Carro {
    int codigo = 10;

    abstract void acelerar();

    void frear() {
        System.out.println("O carro está freando..;");
    }
}

class CarroF1 extends Carro {
    void acelerar() {
        System.out.println("O carro de F1 está acelerando muito rápido");
    }
}

class Caminhao extends Carro {
    void acelerar() {
        System.out.println("O caminhao está acelerando lentamente");
    }
}

public class TestAbstract {
    public static void main(String[] args) {
    
    Caminhao caminhao = new Caminhao();
    System.out.println("Codigo: " + caminhao.codigo);
    
    caminhao.codigo = 888;
    System.out.println("Codigo trocado: " + caminhao.codigo);
    }
}