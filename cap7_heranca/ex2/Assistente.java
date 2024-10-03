public class Assistente extends Funcionario {
    private int numeroMatricula;

    @Override
    public double ganhoAnual() {
        // Considerando um bônus fixo de R$ 1000 para assistentes
        return super.ganhoAnual() + 1000;
    }

    // Getter e Setter para número de matrícula (opcional)
    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
}