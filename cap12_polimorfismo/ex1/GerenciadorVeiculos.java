/*
Objetivo
O objetivo deste exercício é demonstrar o uso de polimorfismo em uma hierarquia de
classes relacionadas a veículos.

Instruções
    Passos para fazer o exercício:
    1. Definir a classe abstrata Veiculo:
        A classe Veiculo é abstrata, o que significa que não pode ser instanciada
        diretamente. Ela serve como um modelo para outras classes derivadas.
        Ela possui dois atributos privados: placa (String) e ano (int).
        O construtor da classe Veiculo recebe esses dois parâmetros e inicializa os
        atributos.
        A classe Veiculo também possui um método chamado
        exibirInformacoes(), que imprime a placa e o ano do veículo.
    2. Criar as classes derivadas Onibus e Caminhao:
        Ambas as classes herdam da classe Veiculo.
        A classe Onibus possui um atributo adicional chamado assentos (int).
        A classe Caminhao possui um atributo adicional chamado eixos (int).
        Os construtores das classes derivadas chamam o construtor da classe base
        (Veiculo) usando super(placa, ano).
        Cada classe derivada sobrescreve o método exibirInformacoes() para
        incluir informações específicas (assentos para ônibus e eixos para
        caminhões).
    3. Classe GerenciadorVeiculos:
        Essa classe contém o método main, que é o ponto de entrada do programa.
        No método main, você cria instâncias de Onibus e Caminhao com valores
        específicos para placa, ano, assentos e eixos.
        Em seguida, você chama o método exibirInformacoes() para mostrar os
        detalhes de cada veículo.
    
    Lembre-se de que, como a classe Veiculo é abstrata, você não pode criar um objeto
    diretamente dela. Use as classes derivadas (Onibus e Caminhao) para instanciar
    veículos específicos e exibir suas informações.
*/

abstract class Veiculo {
    private String placa;
    private int ano;

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    // Novo método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Placa: " + placa);
        System.out.println("Ano: " + ano);
    }
}

class Onibus extends Veiculo {
    private int assentos;

    public Onibus(String placa, int ano, int assentos) {
        super(placa, ano);
        this.assentos = assentos;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Assentos: " + assentos);
    }
}

class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, int ano, int eixos) {
        super(placa, ano);
        this.eixos = eixos;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Eixos: " + eixos);
    }
}

public class GerenciadorVeiculos {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Onibus("ABC123", 2020, 40);
        Veiculo veiculo2 = new Caminhao("XYZ789", 2018, 6);
        System.out.println("Detalhes do veículo 1 (ônibus):");
        veiculo1.exibirInformacoes();
        System.out.println();
        System.out.println("Detalhes do veículo 2 (caminhão):");
        veiculo2.exibirInformacoes();
    }
}
