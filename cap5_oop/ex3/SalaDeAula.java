/*
Instruções
Este exercício tem como objetivo ensinar o uso de variáveis e métodos static em
Java, utilizando duas classes no mesmo arquivo. Você irá criar uma classe que utiliza
variáveis e métodos estáticos para contar o número de alunos em uma sala de aula e
outra classe para testar essa funcionalidade.

Passos para fazer o exercício
    1. Crie uma classe chamada SalaDeAula.
    2. Dentro da classe SalaDeAula, declare uma variável estática para armazenar o
    número total de alunos.
    3. Crie um método estático para adicionar alunos à contagem.
    4. Crie um método estático para exibir o número total de alunos.
    5. Crie uma segunda classe chamada TesteSalaDeAula no mesmo arquivo.
    6. No método main da classe TesteSalaDeAula, crie três instâncias da classe
    SalaDeAula e adicione alunos para testar a funcionalidade.
*/

public class SalaDeAula {
    // Variável estática para contar o número total de alunos
    static int totalAlunos = 0;

    // Método estático para adicionar alunos
    public static void adicionarAluno() {
        totalAlunos++;
    }

    // Método estático para exibir o número total de alunos
    public static void exibirTotalAlunos() {
        System.out.println("Total de alunos na sala: " +
                totalAlunos);
    }
}

