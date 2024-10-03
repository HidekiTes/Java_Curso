abstract class Animal { // Superclasse
    public abstract void fazerSom();

    public void tipoObjeto(){
        System.out.println("Objeto do tipo Animal");
    }
}

class Cachorro extends Animal { //Subclasse Cachorro
    public void fazerSom() {
        System.out.println("O cachorro faz: Au Au!");
    }
}

class Gato extends Animal { //Subclasse Gato
    public void fazerSom() {
        System.out.println("O gato faz: miau miau!");
    }
}

public class TestPolimorfismo {
    public static void main(String[] args) {
        Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();
        
        meuCachorro.fazerSom(); //Imprime: O cachorro faz Au au!
        meuGato.fazerSom(); // O gato faz miau miau!

        meuCachorro.tipoObjeto(); //Imprime: O cachorro faz Au au!
        meuGato.tipoObjeto(); // O gato faz miau miau!
    }
}