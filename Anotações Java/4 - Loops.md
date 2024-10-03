Loops em Java são estruturas que permitem a repetição de um bloco de código várias vezes, até que uma condição específica seja atendida. Eles são fundamentais para automatizar tarefas repetitivas e para processar conjuntos de dados de forma eficiente.
### For

O `for` loop em Java é uma estrutura de repetição usada quando se conhece antecipadamente o número de vezes que um bloco de código precisa ser executado. 

**Exemplo**:
``` java
for (int i = 0; i < 5; i++) {
	System.out.println(i);
} 
```

### While

O `while` loop em Java é uma estrutura de repetição que executa um bloco de código enquanto uma condição especificada for verdadeira.

**Exemplo**:
``` java
int j = 0;
while (j < 5) {
	System.out.println(j);
	j++;
} 
```

### Do-While

O `do-while` loop em Java é uma estrutura de repetição que garante que um bloco de código seja executado pelo menos uma vez, independentemente da condição. 

**Exemplo**:
```java
int k = 0;
do {
	System.out.println(k);
	k++;
} while (k < 5); 
```

### Controle de Loop - Break

O comando `break` em Java é usado para sair imediatamente de um loop, seja ele `for`, `while`, `do-while`, ou até mesmo de uma estrutura `switch`. Quando o `break` é executado, o controle do programa é transferido para a primeira linha de código após o loop, ignorando quaisquer iterações restantes.

**Exemplo**:
```java
for (int i = 0; i < 10; i++) {
	 if (i == 5) {
		 break; // Sai do loop quando i é igual a 5
	 }
	 System.out.println(i);
} 
```

### Controle de Loop - Continue

O comando `continue` em Java é usado dentro de loops (`for`, `while`, `do-while`) para pular o restante do código no bloco de loop atual e passar para a próxima iteração do loop. 

**Exemplo**:
``` java
for (int j = 0; j < 10; j++) {
	if (j == 5) {
		continue; // Pula a iteração quando j é igual a 5
	}
	System.out.println(j);
} 
```
