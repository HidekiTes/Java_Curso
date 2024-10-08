Em Java, uma **interface** é um tipo de referência que define um conjunto de métodos abstratos (sem implementação) e constantes que uma classe pode implementar. As interfaces são usadas para estabelecer um **contrato** que classes devem seguir, garantindo que certas funcionalidades ou comportamentos estarão presentes. Diferente de uma classe abstrata, uma interface não pode conter estado ou implementação completa, mas pode incluir métodos com implementação usando as palavras-chave `default` e `static`.
#### Implementação de Interface

Quando uma classe implementa uma interface, ela se compromete a fornecer as implementações dos métodos definidos nessa interface. Uma classe pode implementar várias interfaces, o que permite simular uma forma de herança múltipla, já que Java não permite herança múltipla de classes.

**Exemplo:**

```java
interface Animal {    
	void emitirSom(); // Método abstrato 
}

class Cachorro implements Animal {  
@Override     
	public void emitirSom() {   
		System.out.println("Latido");     
	}
}
```

No exemplo acima, a classe `Cachorro` implementa a interface `Animal`, fornecendo a implementação para o método `emitirSom`.
### Criação de Interfaces

Para criar uma interface, usa-se a palavra-chave `interface`. Por padrão, todos os métodos em uma interface são `public` e `abstract` (mesmo que não sejam explicitamente definidos como tais).

```java
interface Veiculo {   
	void acelerar();   
	void frear();
}
```
### Regras de Interface
##### Não podem ser instanciadas
Interfaces não podem ser instanciadas diretamente; elas devem ser implementadas por uma classe que fornecerá as implementações dos métodos definidos.
##### Todos os atributos dentro de uma interface são obrigatoriamente public, final e static.

As interfaces podem conter atributos, mas eles são implicitamente `public`, `static` e `final`,ou seja, são constantes que podem ser acessadas diretamente e não podem ser modificadas.

```java
interface Constantes {
    int VELOCIDADE_MAXIMA = 120; // public static final é implícito
}
```
##### Todos os métodos devem ser o mais acessível possível, ou seja, devem ser public.

Todos os métodos em uma interface são implicitamente `public`, garantindo que eles sejam acessíveis para implementação em outras classes.
##### A palavra 'abstract' no método é opcional.

Como todos os métodos de uma interface são abstratos por padrão, não é necessário usar a palavra `abstract` ao definir métodos.
##### Uma interface pode estender outras interfaces.

Uma interface pode herdar de outras interfaces, permitindo que ela agregue mais funcionalidades ou métodos em seu contrato.

``` java
interface Motor {
    void ligar();
}

interface Veiculo extends Motor {
    void acelerar();
}
```
### Casos especiais de Interfaces

A partir do Java 8, interfaces podem ter métodos com implementação usando `default` e `static`.
##### **Métodos `default`**

Um método `default` é um método que fornece uma implementação padrão para as classes que implementam a interface. As classes podem sobrescrever esse método, mas não são obrigadas a fazê-lo.

```java
interface Veiculo {
    void acelerar();

    default void buzinar() {
        System.out.println("Buzina padrão");
    }
}
```
##### **Métodos `static`**

Métodos estáticos em interfaces são como métodos estáticos em classes: eles pertencem à interface e não podem ser sobrescritos pelas classes que a implementam. Eles são chamados diretamente pela interface.

```java
interface Utilidades {
    static void mostrarInfo() {
        System.out.println("Informações úteis");
    }
}
```
##### Métodos `default`e `static` não precisam ser sobrescritos.

Diferentemente dos métodos abstratos, os métodos `default` e `static` em interfaces não precisam ser implementados pelas classes que as implementam. Eles já possuem uma implementação e, no caso de métodos `static`, só podem ser usados diretamente pela interface.
#### Interface em Java com métodos `abstract`,`default` e `static`
```java
interface Dispositivo {
    void ligar(); // Método abstrato

    default void desligar() { // Método default
        System.out.println("Desligando...");
    }

    static void reiniciar() { // Método static
        System.out.println("Reiniciando dispositivo");
    }
}
```

Neste exemplo:

- `ligar()` é um método abstrato e deve ser implementado pela classe que implementar `Dispositivo`.
- `desligar()` é um método `default` e possui uma implementação padrão.
- `reiniciar()` é um método `static` e pode ser chamado diretamente através da interface: `Dispositivo.reiniciar()`.

Esses recursos tornam as interfaces mais flexíveis e permitem que elas evoluam sem quebrar o código das classes que já as implementam, mantendo a compatibilidade retroativa.