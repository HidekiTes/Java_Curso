public class Funcionario {
    String nome;
    String cargo;
    int idade;

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(); // Corrigido para Funcionario
        funcionario.nome = "João";
        funcionario.cargo = "Desenvolvedor";
        funcionario.idade = 30;

        Funcionario funcionario2 = new Funcionario(); // Corrigido para Funcionario
        funcionario2.nome = "Maria"; // Corrigido para funcionario2
        funcionario2.cargo = "Gerente"; // Corrigido para funcionario2
        funcionario2.idade = 47; // Corrigido para funcionario2

        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Cargo: " + funcionario.cargo);
        System.out.println("Idade: " + funcionario.idade);
        System.out.println("---------------------------");
        System.out.println("Nome: " + funcionario2.nome);
        System.out.println("Cargo: " + funcionario2.cargo);
        System.out.println("Idade: " + funcionario2.idade);
    }
}