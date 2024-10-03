abstract class Animal { // Classe base abstrata
    public abstract void fazerSom();
}

class Cachorro extends Animal { // Subclasse Cachorro
    @Override
    public void fazerSom() {
        System.out.println("O cachorro faz: Au Au!");
    }
}

class Gato extends Animal { // Subclasse Gato
    @Override
    public void fazerSom() {
        System.out.println("O gato faz: miau miau!");
    }
}

public class TestPolimorfismo {
    public static void main(String[] args) {
        // Criando objetos polimórficos
        Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();
        
        meuCachorro.fazerSom(); // Imprime: O cachorro faz: Au Au!
        meuGato.fazerSom(); // Imprime: O gato faz: miau miau!
    }
}
