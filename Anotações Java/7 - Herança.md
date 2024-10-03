### Códigos
---
```java
// 1_heranca_java
	class Animal {
		public void comer() {
			System.out.println("O animal come");
		}
	}
	
	class Cachorro extends Animal {
		public void latir() {
			System.out.println("O cachorro late");
		}
	}
	
	public class TestHeranca {
		public static void main(String[] args) {
		Cachorro dog = new Cachorro ();
	
		dog.latir()
		dog.comer();
		}
	}
```

```java
// 2_overriding
	class Animal {
		public void fazerSom(int i, String s) {
			System.out.println("O animal faz um som");
		}
	}
	
	class Cachorro extends Animal {
		public void fazerSom(int i, String s) {
			System.out.println("O cachorro late");
		}
	}
	
	public class TestHeranca {
		public static void main(String[] args) {
			Cachorro dog = new Cachorro ();
	
			dog.fazerSom(1, "");
		}
	}
```

```java
// 3_super_keyword_methods
	class Animal {
		public String nome;
		public void fazerSom() {
			System.out.println("O animal faz um som");
		}
	}
	
	class Cachorro extends Animal {
		public void fazerSom() {
			super.fazerSom();
			System.out.println("O cachorro late");
		}
	}
	
	public class TestHeranca {
		public static void main(String[] args) {
			Cachorro dog = new Cachorro ();
			dog.nome = "Rex";
			System.out.println("O nome do animal: " + dog.nome);
	
			dog.fazerSom();
		}
	}
```

```java
// 4_super_keyword_construtores
	class Animal {
		String nome;
		Animal(String nome) {
			this.nome = nome;
		}
	}

	class Cachorro extends Animal {
		String raca;
		Cachorro(String nome, String raca) {
			super(nome); // Chama o construtor da superclasse Animal
			this.raca = raca;
		}
	}
	
	public class TestSuper {
		public static void main(String[] args) {
			Cachorro dog = new Cachorro ("Rex","Labrador");
			System.out.println("O nome do animal: " + dog.nome);
			System.out.println("Raça do cachorro: " + dog.raca);
		}
	}
```
---
