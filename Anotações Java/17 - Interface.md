No Java, a **programação funcional** se refere ao uso de funções como objetos de primeira classe, o que significa que funções podem ser passadas como argumentos, retornadas de métodos e atribuídas a variáveis. As **expressões lambda** e as **interfaces funcionais** são recursos-chave que permitem programar de maneira funcional em Java, tornando o código mais conciso e expressivo.
### Interfaces Funcionais

 Uma **interface funcional** é uma interface que possui exatamente um método abstrato. Essas interfaces servem como **tipos de alvo** para expressões lambda, ou seja, são as interfaces que uma expressão lambda pode implementar.
#### O que são Interfaces Funcionais?

- São interfaces com **apenas um método abstrato**.
- Elas podem ter métodos `default` e `static` além do método abstrato.
- São usadas para representar **funções anônimas** ou **comportamentos** que podem ser passados como parâmetros.

```java
@FunctionalInterface
public interface Operacao {
    int executar(int a, int b);
}
```

Nesse caso, `Operacao` é uma interface funcional porque tem um único método abstrato, `executar`. Podemos usar uma expressão lambda para criar uma implementação dessa interface.
#### Beneficios das Interfaces Funcionais
##### Expressões Lambda

As interfaces funcionais permitem o uso de **expressões lambda**, simplificando o código e evitando a necessidade de criar classes anônimas ou implementar interfaces de maneira mais verbosa.

```java
Operacao soma = (a, b) -> a + b;
System.out.println(soma.executar(5, 3)); // Saída: 8
```
##### Polimorfismo

As interfaces funcionais permitem que métodos aceitem comportamentos como parâmetros, favorecendo o **polimorfismo**. Em vez de implementar várias classes diferentes para cada comportamento, é possível usar lambdas para definir esses comportamentos diretamente onde são necessários.
#### Anotação @FunctionalInterface 

A anotação **`@FunctionalInterface`** é usada para garantir que uma interface seja funcional. Se você adicionar essa anotação a uma interface, o compilador verificará se ela possui exatamente um método abstrato, garantindo que a interface siga as regras de uma interface funcional.

```java
@FunctionalInterface
public interface Comparador {
    boolean comparar(int a, int b);
}
```

A anotação `@FunctionalInterface` também serve como documentação para indicar a intenção de que aquela interface é funcional, facilitando a leitura e a compreensão do código.
### Exemplos de Interfaces Funcionais em Java

O Java possui várias interfaces funcionais predefinidas no pacote `java.util.function`, como:

- `Predicate<T>`: Recebe um argumento e retorna um valor booleano.
- `Consumer<T>`: Recebe um argumento e não retorna nenhum valor.
- `Function<T, R>`: Recebe um argumento e retorna um valor.

Essas interfaces são amplamente usadas em operações com coleções e `Stream`, permitindo escrever código funcional e expressivo.

As interfaces funcionais e expressões lambda são partes essenciais da programação funcional em Java, ajudando a simplificar o código e aumentar sua flexibilidade ao trabalhar com comportamentos como parâmetros.