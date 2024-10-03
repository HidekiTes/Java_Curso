public class Bolo {
    int quantidadeAcucar; // Caso seja seta um valor aqui, ele será considerado como "defaulçt"

    public static void main(String [] args) {
        Bolo boloDeChocolate = new Bolo();
        boloDeChocolate.quantidadeAcucar = 200;

        Bolo boloDeBaunilha = new Bolo();
        boloDeBaunilha.quantidadeAcucar = 150;

        System.out.println("Quantidade de açúcar no bolo de Chocolate: " + boloDeChocolate.quantidadeAcucar);
        System.out.println("Quantidade de açúcar no bolo de Baunilha: " + boloDeBaunilha.quantidadeAcucar);
    }
}