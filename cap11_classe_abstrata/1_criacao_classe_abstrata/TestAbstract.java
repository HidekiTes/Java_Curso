abstract class Carro {
    abstract void acelerar();

    void frear() {
        System.out.println("O carro está freando..");
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
        CarroF1 carroF1 = new CarroF1();
        Caminhao caminhao = new Caminhao();

        carroF1.acelerar();
        carroF1.frear();

        caminhao.acelerar();
        caminhao.frear();
    }
}