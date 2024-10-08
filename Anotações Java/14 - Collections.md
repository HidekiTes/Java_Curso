**Collections** em Java são estruturas de dados que permitem agrupar e manipular vários elementos de forma eficiente e flexível. O **Collections Framework** fornece um conjunto de interfaces, classes e algoritmos para trabalhar com diferentes tipos de coleções, facilitando operações como adicionar, remover, pesquisar e ordenar elementos.
##### Agrupar varios elementos

O principal objetivo das coleções é **agrupar** vários elementos em uma única estrutura que pode ser manipulada. Esses elementos podem ser objetos de qualquer tipo e as coleções permitem armazenar, recuperar e iterar sobre esses objetos.
##### Manipulação

O **Collections Framework** fornece métodos padronizados para manipular esses grupos de elementos, como **adicionar, remover, pesquisar** e **classificar**, tornando o código mais consistente e fácil de entender.
##### Collections Framework

O **Collections Framework** em Java é uma biblioteca padronizada que fornece implementações de estruturas de dados e algoritmos para gerenciar coleções de objetos. Ele inclui interfaces como `List`, `Set`, `Map` e suas implementações, como `ArrayList`, `HashSet`, e `HashMap`.
##### Arrays versus Collections

- **Arrays**: Estruturas de tamanho fixo que armazenam elementos do mesmo tipo. Eles são rápidos e eficientes, mas limitados em termos de flexibilidade, pois não permitem redimensionamento dinâmico.
- **Collections**: Estruturas dinâmicas e flexíveis que podem crescer ou encolher conforme necessário. Elas suportam uma ampla variedade de operações e são mais adequadas para situações em que o tamanho dos dados pode mudar.
### Hierarquia de Interfaces de Coleções
##### A interface `Collection`

A interface **`Collection`** é a base da hierarquia de coleções no **Java Collections Framework**. Ela define um conjunto de métodos padrão que todas as coleções devem implementar, permitindo operações básicas como adicionar, remover, pesquisar e iterar sobre elementos. `Collection` é a **superinterface** das principais interfaces de coleções em Java, como `List`, `Set` e `Queue`.
##### Ela define `add`,`remove`,`clear`,`size`,`isEmpty`,`contains`,etc.

A interface `Collection` é a raiz da hierarquia de coleções no **Java Collections Framework**. Ela define métodos básicos para manipular coleções, como:

- `add(E e)`: Adiciona um elemento à coleção.
- `remove(Object o)`: Remove um elemento específico.
- `clear()`: Limpa todos os elementos da coleção.
- `size()`: Retorna o número de elementos na coleção.
- `isEmpty()`: Verifica se a coleção está vazia.
- `contains(Object o)`: Verifica se um elemento está presente na coleção.
##### Subinterfaces de `Collection`. Exemplos: Set List, Map

A interface `Collection` possui várias **subinterfaces**, cada uma com características específicas:

- **`Set`**: Uma coleção que não permite duplicatas.
- **`List`**: Uma coleção ordenada que permite duplicatas e acesso por índice.
- **`Map`**: Uma coleção que mapeia chaves únicas a valores, semelhante a um dicionário.
##### Implementações classes `HashSet`,`ArrayList`,`HashMap` e outras

O **Collections Framework** oferece diversas implementações para as interfaces:

- **`HashSet`**: Implementação da interface `Set` que não permite duplicatas e não garante a ordem dos elementos.
- **`ArrayList`**: Implementação da interface `List` que permite elementos duplicados e acesso rápido por índice.
- **`HashMap`**: Implementação da interface `Map` que armazena pares chave-valor e não garante a ordem de inserção.
### `Set` Interface

O `Set` é uma **coleção** que **não permite duplicatas**. Ele é usado quando é necessário garantir que cada elemento seja único.
- **Package**: `java.util.Set`
- **Importação**: `import java.util.Set;`

```java
Set<String> nomes = new HashSet<>(); 
nomes.add("Alice"); 
nomes.add("Bob"); 
nomes.add("Alice"); // Não será adicionado, pois "Alice" já está presente`
```
### `List` Interface

O `List` é uma **coleção ordenada** que permite **elementos duplicados** e acesso por **índice**. Ele é útil quando a ordem dos elementos é importante ou quando é necessário acessar elementos por sua posição.
- **Package**: `java.util.List`
- **Importação**: `import java.util.List;`

```java
List<String> nomes = new ArrayList<>();
nomes.add("Alice");
nomes.add("Bob");
nomes.add("Alice"); // Permitido, pois "List" permite duplicatas
```
### `Map` Interface

O `Map` é uma **coleção** que mapeia **chaves únicas** a **valores**. Ele funciona como um dicionário, onde cada chave está associada a um valor específico. As **chaves** devem ser únicas, mas os **valores** podem se repetir.
- **Package**: `java.util.Map`
- **Importação**: `import java.util.Map;`

O `Map` oferece métodos específicos para manipular pares chave-valor:

- `put(K key, V value)`: Adiciona um par chave-valor ao mapa.
- `get(Object key)`: Retorna o valor associado a uma chave específica.
- `remove(Object key)`: Remove a entrada associada à chave especificada.

```java
Map<String, Integer> idades = new HashMap<>();
idades.put("Alice", 25);
idades.put("Bob", 30);
idades.put("Alice", 26); // Atualiza o valor associado à chave "Alice"
```

O **Collections Framework** é uma parte fundamental do Java, oferecendo uma maneira flexível e eficiente de trabalhar com grupos de elementos, suportando operações comuns e garantindo a segurança e integridade dos dados.





























