Em Java, uma **classe abstrata** é uma classe que não pode ser instanciada diretamente e serve como base para outras classes. Ela pode conter métodos abstratos (sem implementação) e métodos concretos (com implementação). O objetivo das classes abstratas é fornecer uma estrutura comum para subclasses e definir comportamentos que as subclasses devem ou podem implementar.
### A Palavra-Chave `abstract`

A palavra-chave `abstract` é usada para declarar uma classe abstrata ou um método abstrato. Uma **classe abstrata** é marcada com `abstract` e pode conter métodos abstratos e concretos. Um **método abstrato** é declarado dentro da classe abstrata sem corpo, e as subclasses são obrigadas a fornecer sua implementação.

```java
abstract class Animal {
    abstract void emitirSom(); // Método abstrato

    void dormir() { // Método concreto
        System.out.println("O animal está dormindo");
    }
}
```
### Regras Importantes sobre Classes Abstratas
##### Não podem ser Instanciadas

Classes abstratas não podem ser instanciadas diretamente. Elas existem para serem estendidas por subclasses que implementarão ou reutilizarão seus métodos.

``` java
Animal animal = new Animal(); // Isso causará um erro de compilação 
```
##### Podem conter métodos abstratos e não abstratos

Classes abstratas podem conter tanto métodos abstratos quanto métodos concretos. Os métodos abstratos devem ser implementados pelas subclasses, enquanto os métodos concretos já possuem uma implementação que pode ou não ser sobrescrita pelas subclasses.
##### Podem conter construtores

Embora classes abstratas não possam ser instanciadas diretamente, elas podem ter **construtores** que são chamados quando uma subclasse é instanciada.

```java
abstract class Animal {
    String nome;

    Animal(String nome) {
        this.nome = nome;
    }
}
```
##### Podem conter campos

Classes abstratas podem ter **campos** (variáveis de instância) que podem ser acessados ou modificados pelas subclasses. Isso permite que as subclasses compartilhem informações comuns.
##### Podem implementar interfaces

Classes abstratas podem implementar uma ou mais interfaces, assim como uma classe concreta faria. No entanto, se a classe abstrata não fornecer implementações para todos os métodos da interface, as subclasses deverão fazê-lo.
### Diferenças entre Classes Abstratas e Interfaces em Java
##### Estado do Objeto

Classes abstratas podem ter **campos de instância**, permitindo que elas mantenham um estado e compartilhem esse estado com suas subclasses. Interfaces, por outro lado, não podem ter campos de instância; elas só podem ter constantes (`public static final`).
##### Construtores

Classes abstratas podem ter **construtores**, que são usados para inicializar o estado comum quando as subclasses são instanciadas. Interfaces não possuem construtores, pois elas não podem ser instanciadas e não mantêm estado.
##### Herança múltipla de tipo e implementações múltiplas

- **Classes Abstratas**: Em Java, uma classe pode estender apenas uma classe (abstrata ou concreta) devido à ausência de herança múltipla.
- **Interfaces**: Uma classe pode implementar múltiplas interfaces, permitindo que ela herde comportamentos e métodos de várias fontes diferentes.
##### Métodos de Implementação

- **Classes Abstratas**: Podem ter métodos com e sem implementação (concretos e abstratos).
- **Interfaces**: Antes do Java 8, interfaces só podiam ter métodos abstratos. A partir do Java 8, interfaces podem ter métodos `default` (com implementação) e métodos `static`.
### Herança Múltipla

Java não suporta **herança múltipla** de classes (uma classe não pode herdar de mais de uma classe abstrata ou concreta). No entanto, interfaces fornecem uma maneira de obter algo semelhante, permitindo que uma classe implemente múltiplas interfaces.
### Implementação Múltiplas

Uma classe pode implementar várias interfaces, o que permite que ela combine múltiplos comportamentos ou contratos. Isso é útil para compor funcionalidades sem a necessidade de herança múltipla de classes.

```java
interface Nadador {
    void nadar();
}

interface Corredor {
    void correr();
}

class Atleta implements Nadador, Corredor {
    @Override
    public void nadar() {
        System.out.println("Atleta nadando...");
    }

    @Override
    public void correr() {
        System.out.println("Atleta correndo...");
    }
}
```
### Métodos de Implementação

Em classes abstratas, métodos concretos (com implementação) podem ser fornecidos e reutilizados por subclasses, que podem sobrescrever esses métodos se desejarem. Isso permite uma implementação parcial ou total de comportamentos que são comuns entre subclasses.

```java
abstract class Animal {
    void comer() {
        System.out.println("O animal está comendo");
    }

    abstract void emitirSom();
}

class Cachorro extends Animal {
    @Override
    void emitirSom() {
        System.out.println("Latido");
    }
}
```

No exemplo, o método `comer` é fornecido pela classe abstrata `Animal` e pode ser usado diretamente pela subclasse `Cachorro`, sem a necessidade de reimplementação.

Classes abstratas são um recurso poderoso que permite definir uma estrutura base para outras classes, fornecendo flexibilidade para combinar comportamentos abstratos e concretos, enquanto interfaces oferecem um meio de estabelecer contratos que podem ser combinados livremente por várias classes.