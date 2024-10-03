Os controles de fluxo em Java são estruturas que determinam a ordem em que as instruções de um programa são executadas, permitindo a criação de lógica condicional e repetitiva. As principais estruturas incluem `if-else` para decisões baseadas em condições, `switch` para múltiplas escolhas, e loops como `for`, `while`, e `do-while` para repetição de blocos de código. Essas ferramentas são essenciais para criar programas dinâmicos que respondem de forma inteligente a diferentes cenários e entradas.

### If-Else

A estrutura `if-else` é uma das formas mais comuns de controlar o fluxo de um programa com base em condições. Ela permite que você execute diferentes blocos de código dependendo de uma condição avaliada como verdadeira (`true`) ou falsa (`false`).

**Exemplo**:
``` java
int a = 10;

if (a > 5) {
 System.out.println("a é maior que 5");
} else {
 System.out.println("a é menor ou igual a 5");
} 
```

### Instanceof

O operador `instanceof` em Java verifica se um objeto pertence a uma classe específica ou sua subclasse, retornando `true` ou `false`. Ele é útil para garantir que o tipo de um objeto é o esperado antes de realizar operações, ajudando a evitar erros em tempo de execução.

``` java
Object obj = "Hello";
if (obj instanceof String) { 
	System.out.println(obj); // Saída: Hello 
}
```

### Switch

O `switch` em Java é uma estrutura de controle de fluxo usada para executar diferentes blocos de código com base no valor de uma expressão. Ele compara o valor da expressão com uma série de casos (`case`) e executa o código correspondente. Se nenhum caso corresponder, o bloco `default` (opcional) é executado.

**Exemplo 1**:
``` java
int day = 3;
switch (day) {
 case 1 -> System.out.println("Segunda");
 case 2 -> System.out.println("Terca");
 case 3 -> System.out.println("Quarta");
 // ...
 default -> System.out.println("Desconhecido");
} 
```

**Exemplo 2**: 
``` java
String dia = "Ter.";
String tipoDeDia = switch (dia) {
	 case "Seg.", "Ter.", "Qua.", "Qui.", "Sex." -> "Dia util";
	 case "Sabado", "Domingo" -> "Fim de semana";
	 default -> "Desconhecido";
};
System.out.println(tipoDeDia); // Dia util
```

### Switch (Legacy)

Em versões antigas do Java, até a versão 6, o `switch` só suportava tipos primitivos como `int`, `char`, `byte`, e `short`, além de seus equivalentes `enum`. Isso limitava seu uso a valores numéricos e de caracteres simples. A partir do Java 7, o `switch` foi expandido para suportar também `String`, permitindo mais flexibilidade ao desenvolver com essa estrutura.

``` java
int diaDaSemana = 3; // 1 representa segunda, 2 terça, etc.
switch (diaDaSemana) {
case 1:
System.out.println("Seg.");
break;
case 2:
System.out.println("Ter.");
break;
case 3:
System.out.println("Qua.");
break;
case 4:
System.out.println("Qui.");
break;
case 5:
System.out.println("Sex.");
break;
default:
System.out.println("Dia desconhecido");
break;
}
```
