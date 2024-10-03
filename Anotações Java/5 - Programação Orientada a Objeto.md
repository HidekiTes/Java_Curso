### Classes e Objetos
#### Classes

- **Definição**: Uma classe é um molde ou uma estrutura que define as propriedades (atributos) e comportamentos (métodos) que os objetos criados a partir dela terão.
- **Atributos**: Representam as características de uma classe. São variáveis que armazenam o estado de um objeto.
- **Métodos**: São funções definidas dentro de uma classe que descrevem os comportamentos que os objetos dessa classe podem executar.
#### Objetos

- **Definição**: Um objeto é uma instância de uma classe, ou seja, é a concretização de uma classe em um elemento específico com atributos definidos e comportamentos que podem ser executados.
- **Criação**: Objetos são criados usando a palavra-chave `new`, seguida pelo nome da classe.

``` java
public class Carro {
    String marca;
    String modelo;
    
    void acelerar() {
        System.out.println("O carro está acelerando.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Criação de um objeto da classe Carro
        Carro meuCarro = new Carro();
        
        // Atribuindo valores aos atributos do objeto
        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        
        // Exibindo informações do carro
        System.out.println("Marca: " + meuCarro.marca);
        System.out.println("Modelo: " + meuCarro.modelo);
        
        // Chamando o método acelerar
        meuCarro.acelerar();
    }
}
```
### Construtores

Construtores são métodos especiais em uma classe que são chamados automaticamente quando um objeto da classe é criado. 
Eles têm o mesmo nome da classe e não têm um tipo de retorno (nem mesmo `void`). Os construtores são usados para inicializar objetos, ou seja, definir o estado inicial de um objeto ao atribuir valores aos seus atributos.
#### Tipos de Construtores em Java

**Construtor Padrão**:
- Se você não definir nenhum construtor, o Java fornece automaticamente um construtor padrão sem parâmetros que não faz nada explicitamente.
**Construtor com Parâmetros**:
- Permite que você inicialize os atributos do objeto no momento da criação, passando valores como argumentos.

``` java
public class Carro {
    String marca;
    String modelo;
    
    // Construtor com parâmetros
    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    void acelerar() {
        System.out.println("O carro está acelerando.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Criação de um objeto da classe Carro usando o construtor com parâmetros
        Carro meuCarro = new Carro("Toyota", "Corolla");
        
        // Exibindo informações do carro
        System.out.println("Marca: " + meuCarro.marca);
        System.out.println("Modelo: " + meuCarro.modelo);
        
        // Chamando o método acelerar
        meuCarro.acelerar();
    }
}
```
### Pacotes Java

Os pacotes em Java são fundamentais para organizar o código, evitar conflitos de nomes, reutilizar código e controlar o acesso a classes e métodos. Vamos detalhar cada um desses aspectos:
#### Organização

- **Conceito**: Pacotes ajudam a estruturar e organizar o código em diferentes módulos, agrupando classes relacionadas em uma hierarquia lógica.
- **Benefício**: Mantém o código mais legível e gerenciável, especialmente em projetos grandes.
#### Prevenção de Conflitos de Nomes

- **Conceito**: Pacotes evitam que classes com o mesmo nome entrem em conflito. Como cada pacote tem um espaço de nomes (namespace) separado, duas classes com o mesmo nome podem coexistir em pacotes diferentes.
- **Benefício**: Permite o uso de bibliotecas externas e internas sem preocupação com duplicação de nomes.=
#### Reutilização de Código

- **Conceito**: Pacotes permitem agrupar e distribuir conjuntos de classes e interfaces que podem ser reutilizados em outros projetos.
- **Benefício**: Facilita a modularização e reutilização de código. Bibliotecas Java (como `java.util`, `java.io`, etc.) são exemplos de pacotes que fornecem funcionalidades reutilizáveis.
#### Controle de Acesso

- **Conceito**: Pacotes trabalham com modificadores de acesso (`public`, `protected`, `default`, `private`) para controlar a visibilidade de classes e métodos, permitindo que apenas certas partes do código sejam acessíveis de fora do pacote.
- **Benefício**: Garante encapsulamento e proteção de dados, limitando o acesso direto a membros de uma classe conforme necessário.
#### Código

```css
src/
│
└── com/
    └── meuprojeto/
        ├── automoveis/
        │   ├── Carro.java
        │   └── Motor.java
        └── util/
            └── Utilidades.java
└── com/
    └── outroprojeto/
        └── transportes/
            └── Veiculo.java
└── Main.java
```

##### 1 - ```com/meuprojeto/automoveis/Carro.java```
``` java
package com.meuprojeto.automoveis;

import com.meuprojeto.util.Utilidades;

public class Carro {
    // Atributos da classe
    private String marca;
    private String modelo;
    private Motor motor; // Classe Motor tem acesso padrão, visível apenas dentro do pacote

    // Construtor
    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor();
    }

    // Método público
    public void ligar() {
        motor.ligarMotor();
        Utilidades.imprimirMensagem("Carro " + marca + " " + modelo + " ligado.");
    }
}
```
##### 2 - ```com/meuprojeto/automoveis/Motor.java```
``` java
package com.meuprojeto.automoveis;

// Classe com acesso padrão, visível apenas dentro do pacote com.meuprojeto.automoveis
class Motor {
    // Método com acesso padrão
    void ligarMotor() {
        System.out.println("Motor ligado.");
    }
}
```
##### 3 - ```com/meuprojeto/util/Utilidades.java```
``` java
package com.meuprojeto.util;

public class Utilidades {
    // Método público e estático que pode ser reutilizado em qualquer pacote
    public static void imprimirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
```
##### 4 - ```com/outroprojeto/transportes/Veiculo.java```
``` java
package com.outroprojeto.transportes;

public class Veiculo {
    private String tipo;

    // Construtor
    public Veiculo(String tipo) {
        this.tipo = tipo;
    }

    // Método público
    public void mostrarTipo() {
        System.out.println("Tipo de veículo: " + tipo);
    }
}
```
##### 5 - ```Main.java```
``` java
import com.meuprojeto.automoveis.Carro;
import com.outroprojeto.transportes.Veiculo;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Carro no pacote com.meuprojeto.automoveis
        Carro meuCarro = new Carro("Toyota", "Corolla");
        meuCarro.ligar(); // Usando método da classe Carro

        // Criando um objeto da classe Veiculo no pacote com.outroprojeto.transportes
        Veiculo meuVeiculo = new Veiculo("Bicicleta");
        meuVeiculo.mostrarTipo(); // Usando método da classe Veiculo
    }
}
```

### Modificadores de Acesso

Os modificadores de acesso em Java controlam a visibilidade e o escopo de classes, métodos, construtores e variáveis. Eles definem como os diferentes componentes do código podem ser acessados dentro de um pacote ou de outros pacotes.
#### Public

- **Definição**: Um membro marcado como `public` é acessível de qualquer lugar, ou seja, de qualquer classe ou pacote.
- **Uso**: É utilizado quando se deseja que uma classe, método ou variável seja amplamente acessível.

``` java
public class ExemploPublico {
    public String nome;

    public void exibirNome() {
        System.out.println("Nome: " + nome);
    }
}
```
#### Private

- **Definição**: Um membro marcado como `private` só pode ser acessado dentro da própria classe onde é definido.
- **Uso**: É usado para encapsular dados e comportamentos, protegendo-os de acessos externos, incluindo subclasses.

``` java
public class ExemploPrivado {
    private String senha;

    public void setSenha(String senha) {
        this.senha = senha;
    }

    private void exibirSenha() {
        System.out.println("Senha: " + senha);
    }
}
```
#### Protected

- **Definição**: Um membro marcado como `protected` é acessível dentro do mesmo pacote e também em subclasses, mesmo que estejam em pacotes diferentes.
- **Uso**: É utilizado principalmente para permitir que subclasses acessem membros da classe base, enquanto ainda se oferece um nível de encapsulamento em relação ao resto do programa.

``` java
public class ExemploProtegido {
    protected String cor;

    protected void exibirCor() {
        System.out.println("Cor: " + cor);
    }
}

class SubClasse extends ExemploProtegido {
    public void mudarCor(String novaCor) {
        this.cor = novaCor;
    }
}
```
#### Default 

- **Definição**: Quando nenhum modificador de acesso é especificado, o acesso é considerado **default** (ou package-private). Isso significa que o membro é acessível apenas dentro do mesmo pacote.
- **Uso**: É útil para ocultar a implementação fora do pacote, mas permitindo o compartilhamento entre classes dentro do mesmo pacote.

``` java
class ExemploPadrao {
    String modelo; // Acesso default

    void exibirModelo() {
        System.out.println("Modelo: " + modelo);
    }
}
```
#### Comparação Rápida

| Modificador | Acesso Dentro da Classe | Acesso no Mesmo Pacote | Acesso em Subclasses | Acesso em Outros Pacotes |
| ----------- | ----------------------- | ---------------------- | -------------------- | ------------------------ |
| `public`    | Sim                     | Sim                    | Sim                  | Sim                      |
| `private`   | Sim                     | Não                    | Não                  | Não                      |
| `protected` | Sim                     | Sim                    | Sim                  | Não                      |
| `default`   | Sim                     | Sim                    | Não                  | Não                      |

Esses modificadores de acesso são fundamentais para o encapsulamento e o design de classes, permitindo que você controle com precisão quem pode acessar ou modificar certos aspectos do seu código.
### Declaração de Métodos

A **declaração de métodos** em Java define um bloco de código que pode ser chamado para executar uma tarefa específica. Um método pode receber parâmetros, realizar uma operação e retornar um valor. A sintaxe de um método em Java envolve especificar o modificador de acesso, o tipo de retorno, o nome do método, os parâmetros (se houver) e o corpo do método.
#### Componentes da Declaração de um Método

##### Modificadores de Acesso (opcionais):
- Controlam quem pode acessar o método.
- Exemplos: `public`, `private`, `protected`, ou sem modificador (default).
##### Tipo de Retorno
- Indica o tipo de dado que o método retorna ao ser chamado. Pode ser um tipo primitivo (como `int`, `double`) ou uma classe (como `String`), ou `void` se o método não retornar nada.
##### Nome do Método
- Deve ser um identificador válido em Java e seguir a convenção de nomeação camelCase.
 - Exemplo: `calcularSoma`, `getNome`, `setIdade`.
##### Parâmetros (opcional):
- São as entradas para o método, definidos entre parênteses. Cada parâmetro deve ter um tipo e um nome.
- Exemplo: `(int num1, int num2)`.
##### Corpo do Método
- Bloco de código delimitado por chaves `{}` que contém as instruções que serão executadas quando o método for chamado.
#### Exemplos

##### 1. Método Sem Retorno (`void`)**
Este método não retorna nenhum valor, apenas executa uma ação.
```java
public void exibirMensagem() {
    System.out.println("Olá, mundo!");
}
```
##### 2. Método com Retorno de Valor
Este método retorna um valor do tipo `int`.
``` java
public int somar(int a, int b) {
    return a + b;
}
```
##### 3. Método com Parâmetros
Este método recebe dois parâmetros, `String nome` e `int idade`, e imprime uma mensagem.
```java
public void exibirInformacao(String nome, int idade) {
    System.out.println("Nome: " + nome + ", Idade: " + idade);
}
```
##### 4. Método com Retorno de Objeto
Este método retorna um objeto do tipo `String`.
``` java
public String obterNomeCompleto(String primeiroNome, String sobrenome) {
    return primeiroNome + " " + sobrenome;
}
```

### Passagem por Referência

Em Java, a **passagem de parâmetros para métodos** ocorre por valor, o que significa que quando você passa um argumento para um método, uma cópia do valor do argumento é feita e usada dentro do método. Essa abordagem se aplica tanto para tipos primitivos quanto para objetos. Vamos detalhar como isso funciona em ambos os casos.
#### Passagem por Valor em Tipos Primitivos

Quando você passa um tipo primitivo (como `int`, `float`, `char`, etc.) para um método, o valor real do argumento é copiado para o parâmetro do método. Qualquer alteração feita ao parâmetro dentro do método não afeta o argumento original.
```java
public class PassagemPorValorPrimitivo {
    
    public static void alterarValor(int num) {
        num = 20; // Tentativa de alterar o valor
    }

    public static void main(String[] args) {
        int numero = 10;
        alterarValor(numero);
        System.out.println("Valor de numero após chamar o método: " + numero);
    }
}
```

#### ### Passagem por Valor em Objetos

Quando um objeto é passado para um método, a referência do objeto é copiada. Isso significa que o método recebe uma cópia da referência que aponta para o mesmo objeto na memória. Alterar os atributos do objeto dentro do método afeta o objeto original, pois ambos (a variável original e o parâmetro do método) referenciam o mesmo objeto.

No entanto, se você alterar a referência dentro do método (ou seja, fazer o parâmetro apontar para um novo objeto), isso não afeta a referência original fora do método.
```java
public class PassagemPorValorObjeto {

    static class Carro {
        String modelo;
    }
    
    public static void alterarModelo(Carro c) {
        c.modelo = "Corolla"; // Altera o atributo do objeto
    }

    public static void criarNovoCarro(Carro c) {
        c = new Carro(); // Cria uma nova referência
        c.modelo = "Civic"; // Esta mudança não afeta o objeto original
    }

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Fusca";
        
        alterarModelo(meuCarro);
        System.out.println("Modelo após alterarModelo: " + meuCarro.modelo);
        
        criarNovoCarro(meuCarro);
        System.out.println("Modelo após criarNovoCarro: " + meuCarro.modelo);
    }
}
```

### ### Sobrecarga de Métodos (Overloading)

Java permite declarar vários métodos com o mesmo nome, desde que tenham assinaturas diferentes (diferentes tipos ou números de parâmetros). Isso é conhecido como sobrecarga de métodos.

```java
public class Calculadora {

    // Método para somar dois inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    // Sobrecarga: Método para somar três inteiros
    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    // Sobrecarga: Método para somar dois números de ponto flutuante
    public double somar(double a, double b) {
        return a + b;
    }
}
```

