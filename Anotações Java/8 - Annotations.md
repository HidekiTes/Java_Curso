**Annotations** (anotações) são um recurso do Java usado para adicionar **metadados** ao código. Eles fornecem informações adicionais que podem ser usadas pelo compilador, ferramentas de desenvolvimento, bibliotecas ou frameworks. As anotações não alteram diretamente o comportamento do código, mas ajudam a configurá-lo e documentá-lo, além de facilitar a integração com ferramentas externas.
#### Adicionar Metadados

Anotações permitem adicionar metadados às partes do código, como classes, métodos, variáveis e parâmetros. Esses metadados podem ser utilizados em tempo de compilação, tempo de execução ou até por ferramentas externas.
#### Fornecem Informações

As anotações fornecem informações que ajudam desenvolvedores e ferramentas a entender melhor o propósito de partes específicas do código, facilitando a documentação e o desenvolvimento.
#### Ferramentas de Compilação

Anotações são amplamente usadas em ferramentas de compilação para verificar, processar ou até gerar código com base nos metadados fornecidos. Por exemplo, a anotação `@Override` ajuda o compilador a verificar se um método realmente sobrescreve um método da superclasse.
#### Bibliotecas e Frameworks

Bibliotecas e frameworks utilizam anotações para configurar comportamentos e mapeamentos, como em frameworks de injeção de dependência (por exemplo, `@Autowired` no Spring) ou frameworks de persistência (por exemplo, `@Entity` no JPA).
#### Partes do Código

As anotações podem ser aplicadas a várias partes do código, como:

- **Classes**: `@Deprecated`
- **Métodos**: `@Override`
- **Campos**: `@Autowired`
- **Parâmetros**: `@RequestParam`
### Overriding Annotation

A **Overriding Annotation** em Java é representada pela anotação `@Override`. Ela é usada para indicar que um método em uma subclasse está sobrescrevendo um método com a mesma assinatura que existe na superclasse. Seu principal objetivo é ajudar o compilador a verificar se a sobrescrita está correta, evitando erros acidentais, como erros de digitação no nome do método ou incompatibilidade nos parâmetros.
#### Anotações Predefinidas

Java possui várias anotações predefinidas que fornecem informações úteis ao compilador ou a ferramentas externas. As duas principais são `@Override` e `@Deprecated`.
#### @Override

A anotação `@Override` é usada para indicar que um método está sobrescrevendo um método de sua superclasse. Ela serve como uma verificação adicional pelo compilador, garantindo que você realmente está sobrescrevendo um método existente e evitando erros como diferenças sutis nos nomes dos métodos.

Exemplo:

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

Se você cometer um erro no nome do método ao tentar sobrescrevê-lo, o compilador gerará um erro, ajudando a evitar bugs.
#### @Deprecated Annotation

A **Deprecated Annotation** em Java é representada pela anotação `@Deprecated`. Ela é usada para marcar classes, métodos, campos ou outros elementos do código que estão obsoletos e não devem mais ser usados. Quando um elemento é marcado como `@Deprecated`, significa que ele pode ser removido ou substituído em versões futuras, e os desenvolvedores devem procurar alternativas mais atuais.

```java
@Deprecated 
void metodoAntigo() {     
	System.out.println("Este método está obsoleto."); 
}
```

É uma prática comum acompanhar a anotação `@Deprecated` com um **JavaDoc** explicando o motivo da depreciação e sugerindo uma alternativa:

```java
/**  
* @deprecated Use o metodoNovo() em vez deste.  
*/ 

@Deprecated 
void metodoAntigo() { 
	System.out.println("Este método está obsoleto."); 
}
```

Assim, os desenvolvedores são orientados a evitar o uso de código obsoleto e a adotar as melhores práticas ou funcionalidades mais atualizadas.
### Xlint

`Xlint` é uma opção do compilador do Java que emite avisos adicionais para certas situações que podem ser potencialmente problemáticas no código. Por exemplo, se você usar métodos ou classes anotadas como `@Deprecated` ou não tratar corretamente tipos genéricos, o compilador pode gerar avisos quando `Xlint` está habilitado.
### Supress Warning Annotation

A anotação `@SuppressWarnings` é usada para suprimir avisos do compilador. Você pode aplicá-la a métodos, classes ou variáveis específicas para indicar que certos avisos devem ser ignorados. Ela é útil quando você entende o contexto e os riscos envolvidos, mas não deseja que o compilador continue gerando alertas.

```java
@SuppressWarnings("deprecation") 
void usarMetodoAntigo() { 
	metodoAntigo(); // Usa um método que está marcado como @Deprecated 
}
```

No exemplo, o aviso gerado por `metodoAntigo` será suprimido devido ao uso de `@SuppressWarnings("deprecation")`.

As anotações são uma parte essencial do desenvolvimento moderno em Java, ajudando a integrar o código com ferramentas, frameworks e bibliotecas, além de melhorar a clareza e a documentação do código.
