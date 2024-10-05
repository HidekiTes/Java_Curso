import java.io.*;

public class ExemploIO {
    public static void main(String[] args) {
        try {
            // Escrevendo em um arquivo
            FileWriter writer = new FileWriter("meuArquivo.txt");
            writer.write("Olá mundo!"); // Grava os dados
            writer.close();

            // Lendo de um arquivo
            FileReader reader = new FileReader("meuArquivo.txt");
            int data = reader.read();

            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Problemas de IO: " + e.getMessage());
        }
    }
}
