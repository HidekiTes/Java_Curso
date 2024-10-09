A manipulação de **entrada e saída (I/O)** é essencial em Java para realizar operações de leitura e escrita de dados em arquivos, dispositivos e redes. Java oferece duas principais APIs para essa finalidade: **I/O (Input/Output)**, que é a API mais antiga, e **NIO (New I/O)**, uma versão mais moderna e eficiente.
### I/O (Input/Output)

A API de **I/O** em Java é usada para lidar com operações de entrada e saída de maneira **bloqueante**, ou seja, o programa espera que a operação de leitura ou escrita seja concluída antes de continuar. Ela é baseada em **streams** que representam fluxos contínuos de dados.
#### Implementação de IO

- **Streams de Entrada e Saída**: Java utiliza **InputStream** e **OutputStream** para trabalhar com dados binários, e **Reader** e **Writer** para trabalhar com dados de texto (caracteres).
- **InputStream/OutputStream**: Classes como `FileInputStream` e `FileOutputStream` são usadas para manipular dados binários de arquivos.
- **Reader/Writer**: Classes como `FileReader` e `FileWriter` são usadas para manipular arquivos de texto.

```java
import java.io.FileReader;
import java.io.IOException;

public class LeituraArquivo {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("arquivo.txt")) {
            int caractere;
            while ((caractere = reader.read()) != -1) {
                System.out.print((char) caractere);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
### NIO (New I/O)

**NIO (New I/O)** foi introduzido no Java 1.4 para oferecer uma maneira mais eficiente e flexível de lidar com I/O. Ele traz suporte para **I/O não bloqueante**, o que permite que um programa continue executando outras tarefas enquanto espera por uma operação de I/O.
#### Implementação de NIO

- **Channels**: NIO utiliza canais (`FileChannel`, `SocketChannel`, etc.) para a leitura e escrita de dados. Os canais podem ser não bloqueantes e são mais eficientes que os streams tradicionais.
- **Buffers**: NIO usa buffers (`ByteBuffer`, `CharBuffer`) para armazenar temporariamente os dados que são lidos ou escritos, oferecendo um controle mais preciso sobre as operações.
- **Selectors**: Usados para monitorar múltiplos canais simultaneamente, permitindo que um único thread gerencie múltiplas conexões sem bloquear.

```java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LeituraArquivoNIO {
    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("arquivo.txt")).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```
### Serialização em Java

**Serialização** é o processo de converter um objeto Java em um fluxo de bytes, para que ele possa ser salvo em um arquivo ou transmitido pela rede. O processo inverso é chamado de **desserialização**.

- Em Java, para que um objeto seja serializável, a classe dele deve implementar a interface `Serializable`.
- A serialização é útil para salvar o estado de um objeto, armazenar objetos em arquivos ou transferir objetos entre diferentes partes de um sistema.

```java
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Pessoa implements Serializable {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

public class Serializacao {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("pessoa.ser"))) {
            oos.writeObject(pessoa);
            System.out.println("Objeto serializado com sucesso.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```
#### Conversão de Inteiros para Caracteres

A conversão de inteiros para caracteres pode ser feita para representar códigos de caracteres ASCII, por exemplo:

```java
int codigo = 65;
char caractere = (char) codigo;
System.out.println(caractere); // Saída: A
```