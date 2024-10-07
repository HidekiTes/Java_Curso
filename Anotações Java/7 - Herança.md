Herança é um dos princípios fundamentais da programação orientada a objetos (OOP) em Java. Ela permite que uma classe (subclasse ou classe derivada) herde características (campos e métodos) de outra classe (superclasse ou classe base). Isso promove a reutilização de código e facilita a manutenção, permitindo que você crie novas classes baseadas em classes existentes, adicionando ou modificando funcionalidades conforme necessário.
### Overriding (Sobrescrita de Métodos)

Overriding ocorre quando uma subclasse fornece uma implementação específica para um método que já é definido em sua superclasse. O método na subclasse deve ter a mesma assinatura (nome, parâmetros e tipo de retorno) do método na superclasse. Isso permite que a subclasse forneça seu próprio comportamento para o método herdado.

Por exemplo:
```java
class Animal {
	void emitirSom() {
		System.out.println("Som de animal");     
	}
}  

class Cachorro extends Animal {
	@Override 
	void emitirSom() {
		System.out.println("Latido");     
	}
}
```

Neste exemplo, o método `emitirSom` é sobrescrito na classe `Cachorro` para fornecer um comportamento específico (latido) diferente do comportamento geral da superclasse (`Animal`).
### A palavra `super`

A palavra-chave `super` é usada em Java para se referir à superclasse imediata da classe atual. Ela é comumente usada em dois contextos principais:
#### Keyword `super` em Métodos

Quando você sobrescreve um método na subclasse e deseja chamar a implementação do método da superclasse, você usa `super`. Isso é útil quando você quer estender a funcionalidade do método herdado, em vez de substituí-lo completamente.
``` java
class Animal {
	void emitirSom() {
		System.out.println("Som de animal");
	}
}

class Cachorro extends Animal {
	@Override     
	void emitirSom() {
		super.emitirSom(); // Chama o método da superclasse 
		System.out.println("Latido");     
	}
}
```

Neste caso, `super.emitirSom()` chama a versão do método da superclasse antes de adicionar a funcionalidade específica da subclasse.

#### Keyword `super` em Construtores

A palavra `super` também é usada para chamar o construtor da superclasse. Isso deve ser feito na primeira linha do construtor da subclasse. É útil quando a superclasse possui um construtor que inicializa certos campos ou executa alguma lógica necessária antes de continuar com a inicialização da subclasse.

```java
class Animal { 
	String nome;     
	
	Animal(String nome) {  
		this.nome = nome;     
		System.out.println("Animal criado: " + nome); 
	}
}  

class Cachorro extends Animal {  
	Cachorro(String nome) { 
		super(nome); // Chama o construtor da superclasse    
		System.out.println("Cachorro criado: " + nome);    
	} 
}
```
Aqui, `super(nome)` chama o construtor da classe `Animal` e inicializa o campo `nome` antes de continuar a inicialização na classe `Cachorro`.

Esses conceitos são essenciais para entender como a herança e a reutilização de código funcionam em Java, permitindo que você crie hierarquias de classes mais flexíveis e reutilizáveis.