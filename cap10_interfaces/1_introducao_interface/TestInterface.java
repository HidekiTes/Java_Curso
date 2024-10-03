interface Animal {
    void fazerSom(); // Método abstrato
}

//Classe cachorro que implementa a interface Animal
class Cachorro implements Animal {
    public void fazerSom(){
        System.out.println("O cachorro fez Au au!");
    }
}

//Classe gato que implementa a interface Animal
class Gato implements Animal {
    public void fazerSom(){
        System.out.println("O gato fez Miau Miau!");
    }
}

public class TestInterface {
    public static void main(String[] args){
        Cachorro cachorro = new Cachorro();
        cachorro.fazerSom(); 
        
        Gato gato = new Gato();
        gato.fazerSom();
    }
}