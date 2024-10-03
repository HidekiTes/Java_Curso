import empresa.dados.*;

class FolhaDePagamento {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Arnaldo", 5000.00);
        System.out.println(funcionario.obterInfo());
        
        funcionario.alterarQualquerSalario(funcionario, 9000.00);
        System.out.println(funcionario.obterInfo());
        funcionario.salario = 7000.00;
        System.out.println(funcionario.obterInfo());
    }
}