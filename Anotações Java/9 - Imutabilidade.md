Imutabilidade se refere à propriedade de um objeto ou valor que, uma vez criado, não pode ser alterado. Em Java, você pode criar variáveis, métodos e classes imutáveis usando a palavra-chave `final` e outros recursos específicos para garantir que certas partes do código não possam ser modificadas após a inicialização.
### Keyword Final

A palavra-chave `final` é usada para definir variáveis, métodos ou classes que não podem ser alterados após serem estabelecidos. Abaixo estão os diferentes usos:
#### Variáveis maracada com Final

Quando uma variável é declarada como `final`, seu valor só pode ser atribuído uma vez. Isso garante que ela seja constante e imutável.

**Exemplo com variáveis primitivas:**
```java
final int numero = 10; 
// numero = 20; // Isso causará um erro de compilação
```

**Exemplo com variáveis de referência:**
```java
final String texto = "Olá"; 
// texto = "Mundo"; // Isso causará um erro de compilação
```

Quando se usa `final` com variáveis de referência, o valor da referência não pode ser alterado, mas o objeto que ela aponta pode ser modificado (se for mutável).
### Métodos Final

Quando um método é declarado como `final`, ele não pode ser sobrescrito por subclasses. Isso é útil quando você deseja garantir que o comportamento de um método específico não seja alterado.

```java
class Animal { 
final void emitirSom() {     
System.out.println("Som de animal");     
}
}  

class Cachorro extends Animal {   
// Este método não pode ser sobrescrito devido à palavra-chave 'final' na superclasse  
// void emitirSom() { ... 
} // Isso causará um erro de compilação }
```
### Classes Final

Quando uma classe é declarada como `final`, ela não pode ser estendida por outras classes. Isso é feito para evitar herança e garantir que a implementação da classe permaneça inalterada.

```java
final class Animal {     
// implementação da classe 
}  

// class Cachorro extends Animal {} // Isso causará um erro de compilação
```
### Enum

Enums (ou _enumerations_) são tipos especiais de classes que representam um conjunto fixo de constantes. Em Java, `enum` é imutável por natureza, pois os valores definidos em um enum são constantes e não podem ser alterados.

**Exemplo de enum:**
```java
enum DiaDaSemana {  
	SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO; 
}
```

Ao usar enums, você define um conjunto fixo de valores possíveis para uma variável, garantindo que ela só possa assumir valores pré-determinados e imutáveis.


