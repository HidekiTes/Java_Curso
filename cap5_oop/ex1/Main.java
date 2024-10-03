/*
Instruções
Crie uma classe Carro que possua três atributos: marca, modelo e ano. Implemente
três construtores diferentes para a classe:
    1. Um construtor padrão que não recebe parâmetros.
    2. Um construtor que recebe marca e modelo.
    3. Um construtor que recebe marca, modelo e ano.
*/

public class Main {
    public class Carro {
        private String marca;
        private String modelo;
        private int ano;

        // Construtor padrão
        public Carro() {
            this.marca = "Desconhecida";
            this.modelo = "Desconhecido";
            this.ano = 0;
        }

        // Construtor com dois parâmetros
        public Carro(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
            this.ano = 0; // Valor padrão para ano
        }

        // Construtor com três parâmetros
        public Carro(String marca, String modelo, int ano) {
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
        }

        // Método para exibir os detalhes do carro
        public void exibirDetalhes() {
            System.out.println("Marca: " + this.marca);
            System.out.println("Modelo: " + this.modelo);
            System.out.println("Ano: " + this.ano);
        }
    }

    public class Aplicacao {
        public static void main(String[] args) {
            // Testando o construtor padrão
            Carro carro1 = new Carro();
            carro1.exibirDetalhes();
            // Testando o construtor com dois parâmetros
            Carro carro2 = new Carro("Toyota", "Corolla");
            carro2.exibirDetalhes();
            // Testando o construtor com três parâmetros
            Carro carro3 = new Carro("Honda", "Civic", 2020);
            carro3.exibirDetalhes();
        }
    }
}
