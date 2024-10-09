As **Expressões Lambda** em Java são uma forma concisa de representar funções anônimas (funções que não têm nome). Elas foram introduzidas no Java 8 para permitir uma forma mais expressiva e funcional de programação, especialmente ao trabalhar com coleções e APIs como `Stream`. Com lambdas, é possível passar um bloco de código como argumento para um método, tornando o código mais enxuto e legível.
#### O que são Expressões Lambda

Uma expressão lambda é uma **função anônima** que pode ser tratada como uma **instância** de uma interface funcional (uma interface que possui apenas um método abstrato). Lambdas são usadas principalmente para simplificar a criação de instâncias de classes que implementam essas interfaces.
#### Sintaxe de Expressões Lambda

A sintaxe básica de uma expressão lambda é:

```java
(Argumentos) -> { Corpo }
```

Ela é composta por:
1. **Argumentos**: Os parâmetros que a função recebe.
2. **Setas (`->`)**: O operador que separa os argumentos do corpo da função.
3. **Corpo (`{...}`)**: O bloco de código que define o comportamento da função.

##### Exemplos

- **Sem parâmetros**:
``` java
() -> System.out.println("Olá, Lambda!")
```
- **Com um parâmetro**:
``` java
(x) -> x * 2
```
- **Com mais de um parâmetro**:
``` java
(a, b) -> a + b
```
### Regras adicionais

As expressões lambda podem variar em complexidade, e algumas regras adicionais ajudam a simplificar sua sintaxe.
##### Parênteses Opcionais

Se uma expressão lambda possui apenas um parâmetro, os parênteses ao redor do parâmetro são opcionais:

``` java
x -> x * x
```
##### Parâmetros com Tipo Explícito

Você pode, opcionalmente, especificar o tipo dos parâmetros:

``` java
(int x, int y) -> x + y
```
##### Chaves Opcionais: Exemplo `(int x, int y -> x + y)`

Se o corpo da expressão lambda contém apenas uma única instrução, as chaves `{}` podem ser omitidas, e a instrução é retornada implicitamente:

``` java
(x, y) -> x + y
```

No entanto, se o corpo contiver mais de uma instrução, as chaves são necessárias e é preciso usar a palavra-chave `return` para retornar um valor:

``` java
(x, y) -> {
    int soma = x + y;
    return soma * 2;
}
```
### Exemplo Completo

```java
// Usando lambda para criar uma instância de Runnable
Runnable runnable = () -> System.out.println("Executando em uma thread");
new Thread(runnable).start();
```

As expressões lambda simplificam a sintaxe e tornam o código mais conciso, especialmente ao trabalhar com APIs que exigem o uso de interfaces funcionais, como `Runnable`, `Comparator` ou funções de alto nível com `Stream`.