
public class Funcionario {
    String nome;
    String cargo;
    int idade;

    Funcionario(String nomeInit, String cargoInit, int idadeInit) {
        nome = nomeInit;
        cargo = cargoInit;
        idade = idadeInit;
    }

    Funcionario(int idadeInit,String cargoInit, String nomeInit) {
        idade = idadeInit;
        cargo = cargoInit;
        nome = nomeInit;
    }

    Funcionario(String nomeInit) {
        nome = nomeInit;
    }

    Funcionario() {
    }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(50,"Gerente","Maria"); // Cai no 2°

        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Cargo: " + funcionario.cargo);
        System.out.println("Idade: " + funcionario.idade);
    }
}
