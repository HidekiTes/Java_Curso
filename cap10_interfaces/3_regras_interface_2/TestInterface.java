interface SerVivo {
    public void respirar(); //metodo abstrato
}

interface Animal extends SerVivo{
    String DESCRICAO = "Animal é um ser vivo importante";
    void fazerSom(); //método abstrato
}

//Classe Cachorro que implementa a interface animal
class cachorro implements Animal {
    public void respirar() {}
    public void fazerSom(){
        System.out.println("O cachorro faz au au");
    }
}

//Classe Gato que implementa a interface animal
class Gato implements Animal {
    public void respirar() {}		
    public void fazerSom(){
        System.out.println("O gato faz miau miau");
    }
}

public class TestInterface {
    public static void main(String[] args){			
        Gato gato = new Gato();
        gato.fazerSom();
        System.out.println("Descricao da interface: " + Animal.DESCRICAO);
    }
}