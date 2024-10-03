public class ExemploObjetosNulos {
    public static void main(String[] args) {
        String nome = new String("Arnaldo");
        int varLocal = 10;

        System.out.println("Variável Local " + varLocal);

        try {
            int tamanhoNome = nome.length(); // Tentando acessar objeto nulo
            System.out.println("Tamanho do nome: " + tamanhoNome);
        } catch (NullPointerException e) {
            System.err.println("Erro: A variável 'nome' está nula!");
        }
    }
}
