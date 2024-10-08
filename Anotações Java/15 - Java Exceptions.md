**Exceções** são eventos que ocorrem durante a execução de um programa, interrompendo seu fluxo normal. Elas indicam situações inesperadas ou erros que precisam ser tratados para evitar que o programa termine de forma abrupta. Em Java, as exceções são representadas por objetos que contêm informações sobre o erro ocorrido e fazem parte do **Java Exception Handling**.
##### Por que precisamos de exceções?  

As exceções são necessárias para lidar com situações imprevisíveis, como:
- Entrada de dados inválida.
- Falha na leitura de arquivos.
- Problemas de rede.
- Erros de aritmética, como divisão por zero. Tratar exceções adequadamente garante que o programa possa lidar com erros de forma controlada, melhorando a robustez e a confiabilidade do código.
### Hierarquia de exceções

A hierarquia de exceções em Java é dividida em duas principais categorias: **`Error`** e **`Exception`**.
#### `Error` -> Problemas Graves

- Representa problemas graves que normalmente estão fora do controle do programador, como erros de hardware ou falta de memória.
- Exemplo: `OutOfMemoryError`.
- **Não é recomendado** tentar tratar `Errors`, pois geralmente indicam falhas críticas que não podem ser recuperadas.
#### `Exception` -> Problemas trátaveis

- Representa problemas mais comuns e que podem ser tratados pelo programa. A maioria das exceções que você encontrará e tratará em Java são subtipos de `Exception`.
- As subclasses de `Exception` são divididas em:
##### Exceções verificadas

**Exceções Verificadas**: Exceções que o compilador exige que sejam tratadas, seja com um bloco `try-catch` ou declarando-as no método com `throws`.
- Exemplos: `IOException`, `SQLException`.
##### Exceções não verificadas

**Exceções Não Verificadas**: Exceções que não precisam ser declaradas ou tratadas pelo compilador. Elas geralmente são erros de lógica de programação.
- Exemplo: `NullPointerException`, `ArithmeticException`.
### Tratamento de Exceções 

O tratamento de exceções em Java é feito usando os blocos **`try`, `catch` e `finally`**:
##### `try`

O bloco `try` contém o código que pode lançar uma exceção. Se uma exceção ocorrer dentro do bloco `try`, o controle é transferido para o bloco `catch` correspondente.

```java
try {
    int resultado = 10 / 0; // Pode lançar ArithmeticException
} 
```
##### `catch`

O bloco `catch` é usado para capturar e tratar exceções lançadas pelo bloco `try`. Você pode ter múltiplos blocos `catch` para tratar diferentes tipos de exceções.

```java
catch (ArithmeticException e) {
    System.out.println("Erro: Divisão por zero!");
}
```
##### `finally`

O bloco `finally` é opcional e sempre é executado, independentemente de uma exceção ter sido lançada ou não. Ele é usado para liberar recursos ou executar código que precisa sempre ser executado, como fechar arquivos ou conexões de banco de dados.

```java
finally {
    System.out.println("Bloco finally executado.");
}
```
### Exemplo `ArithmeticException` (Divisão por Zero)

Ocorre quando há uma tentativa de dividir um número por zero.

```java
try {
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Erro: Não é possível dividir por zero.");
}
```
### Exemplo `NullPointerException` (Objeto nulo)

Ocorre quando o programa tenta acessar um método ou atributo de um objeto que não foi inicializado.

```java
String texto = null;
try {
    System.out.println(texto.length());
} catch (NullPointerException e) {
    System.out.println("Erro: Objeto nulo.");
}
```

### Exemplo `ArrayIndexOutOfBoundsException` 

Ocorre quando há uma tentativa de acessar um índice fora dos limites de um array.

```java
int[] numeros = {1, 2, 3};
try {
    System.out.println(numeros[3]);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Erro: Índice fora dos limites do array.");
}
```
### Hierarquia de Exceptions

A hierarquia de exceções em Java tem `Throwable` como a classe raiz, que possui duas subclasses principais:
- **`Error`**: Para erros graves.
- **`Exception`**: Para exceções tratáveis, que se dividem em:
    - **Exceções Verificadas** (`IOException`, `SQLException`).
    - **Exceções Não Verificadas** (`RuntimeException` e suas subclasses, como `NullPointerException` e `IndexOutOfBoundsException`).
### Declaração de Exceções em métodos

Quando um método pode lançar uma exceção verificada, ele deve declarar isso usando a cláusula **`throws`**. Isso informa ao compilador e aos usuários do método que ele pode lançar uma exceção que precisa ser tratada.

```java
public void metodoComExcecao() throws IOException {
    // Código que pode lançar IOException
}
```

Dessa forma, o tratamento de exceções é uma parte essencial do desenvolvimento em Java, ajudando a tornar o código mais robusto e resistente a falhas.