import empresa.dados.*;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Arnaldo", 5000.00);
        System.out.println(funcionario.obterInfo());
        
        double d = 3000;
        funcionario.aumentarSalario(d);
        d = d + 100;
        System.out.println(funcionario.obterInfo());
    }
}