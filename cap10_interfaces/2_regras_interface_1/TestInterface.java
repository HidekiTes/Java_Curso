interface Animal {
    public static final String DESCRICAO = "Animal é um ser vivo importante";
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
        System.out.println("O cachorro fez Au au!");
    }
}

public class TestInterface {
    public static void main(String[] args){			
        Gato gato = new Gato();
        gato.fazerSom();
        
        System.out.println("Descricao da interface: " + Animal.DESCRICAO);
    }
}