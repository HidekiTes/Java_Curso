Os Fundamentos de Programação em Java cobrem os conceitos essenciais necessários para desenvolver software na linguagem Java. Java é uma linguagem de programação orientada a objetos, conhecida por sua portabilidade, robustez e ampla utilização em diversas áreas, como desenvolvimento de aplicativos, sistemas corporativos e dispositivos móveis.
### Variáveis

- Variáveis em programação são como ingredientes em uma receita.
- Uma variável tem um nome e um valor.
- O nome da variável é usado para se referir ao seu valor.
- No exemplo acima, a variável farinha tem o valor 2.

### Tipos Primitivos

- **byte**: (8 bits) - Vai de -128 a 127.
- **short**: (16 bits) - Vai de -32.768 a 32.767.
- **int**: (32 bits) - Vai de 2 bilhões (aproximadamente) negativos a 2 bilhões positivos (aproximadamente).
- **long**: (64 bits) - Vai de -9.223.372.036.854.775.808 (-2^63) até 9.223.372.036.854.775.807 (2^63-1).
- **float**: (32 bits) - Sua faixa de valor é ilimitada.
- **double**: (64 bits) - Sua faixa de valor é ilimitada.
- **boolean**: Pode ser True ou False.
- **char**: (16 bits) - Caracteres únicos como 'a' ou 'A' com uma faixa de valor de até 65.535.

### Estrutura Básica de Código

Ao iniciar o desenvolvimento em Java, é importante ressaltar que todo o código que será executado está compilado dentro de uma classe (Muitas vezes sendo referenciada como Main) `class Main` junto de um retorno dentro do Terminal sendo assim `public static void main (String args[])`, ao desenvolver, preste atenção para que não haja problemas nem erros no desenvolvimento inicial

``` java
class HelloWorld {
    public static void main (String args[]) {
       System.out.println("Hello World");
    }
}
```

### Promoções Automáticas

1. **byte**, **short** e **char** são promovidos para **int** quando usados em uma expressão.
    ```java
    byte a = 10;
    int b = a + 5; // a é promovido para int antes do cálculo
    ```

2. Se um operando é **long, o outro é promovido para long**.
    ```java
    int a = 10;
    long b = 15L;
    long c = 1 + b; // a é promovido para long antes do cálculo
    ```

3. Se um operando é **float, o outro é promovido para float**.
    ```java
    int a = 10;
    float b = 1.5f;
    float c = a * b; // a é promovido para float antes do cálculo
    ```

4. Se um operando é **double, o outro é promovido para double**.
   ``` java
    int a = 10;
    double b = 1.5;
    double c = a * b; // a é promovido para double antes do cálculo
    ```

### Uso de var em Java

- var foi introduzido no Java 10.
- Usado para declarar uma variável com inferência de valor.

    ```java
    var numero = 10; // inferência para int
    var usuario = new Usuario(); // inferência para o tipo Usuario
    ```

#### Limitações do var

- Só pode ser usado para variáveis locais.
- Não pode ser usado com valores nulos.

### Comentários em Java

1. **Comentários de linha única**
    ```java
    // Este é um comentário de linha única
    ```

2. **Comentários de várias linhas**
    ```java
    /*
    Este é um 
    comentário de várias linhas
    */
    ```

3. **Comentários Javadoc** - Começam com `/**` e terminam com `*/`. Eles são usados para produzir a documentação da API do código.
    ```java
    /**
    * Este é um comentário Javadoc
    */
    ```
    
### Regras de Identificadores em Java

1. **Caracteres permitidos**: Letras (`a-z` ou `A-Z`), dígitos (`0-9`), sublinhados (`_`) ou cifrões (`$`). Não pode começar com um dígito.
2. **Sensível a maiúsculas e minúsculas**: `nome` e `Nome` são diferentes.
3. **Palavras reservadas**: Palavras como `int`, `class`, `public`, etc., não podem ser usadas como identificadores.
4. **Sem limite de comprimento**: No entanto, é melhor manter os nomes curtos e significativos.

**Exemplos de Identificadores Válidos**:
```java
nome 
idade 
salarioAnual 
_temp 
$id 
```

**Exemplos de Identificadores Inválidos**:
``` java
123abc // começa com um dígito 
a-b // contém um caractere inválido, - 
class // é uma palavra reservada
```