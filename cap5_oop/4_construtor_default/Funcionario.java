
public class Funcionario {
    String nome;
    String cargo;
    int idade;

    Funcionario(String nomeInit, String cargoInit, int idadeInit) {
        nome = nomeInit;
        cargo = cargoInit;
        idade = idadeInit;
    }

    Funcionario() {
    }

    public static void main(String[] args) {
        // Funcionario funcionario = new Funcionario("João", "Desenvolvedor",30);
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "João";

        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Cargo: " + funcionario.cargo);
        System.out.println("Idade: " + funcionario.idade);
    }
}
