``` java
// 1_overriding_annotation
	class Animal {
		public void fazerSom() {
			System.out.println("O animal faz um som");
		}
	}
	
	class Cachorro extends Animal {
		@Override
		public void fazerSom() {
			System.out.println("O cachorro late");
		}
	}

	public class TestAnnotations {
		public static void main(String[] args) {
			Cachorro dog = new Cachorro();
			dog.fazerSom();
		}
	}
```

``` java
// 2_deprecated_annotation
	class informaRegras {
		@Deprecated
		public void mostrarRegrasParaAposentadoria() {
			System.out.println("Regras para a Aposentadoria");
		}

		public void mostrarNovasRegrasParaAposentadoria() {
			System.out.println("NOVAS Regras para a Aposentadoria");
		}
	}

	public class Previdencia {
		public static void main(String[] args) {
			InformaRegras regras = new InformaRegras();
	
			//Uso do método obsoleto (deprecated)
			regras.mostrarRegrasParaAposentadoria();
			//Uso do método novo
			regras.mostrarNovasRegrasParaAposentadoria();
		}
	}
```

``` java
// 3_Xlint
	class informaRegras {
		@Deprecated
		public void mostrarRegrasParaAposentadoria() {
			System.out.println("Regras para a Aposentadoria");
		}

		public void mostrarNovasRegrasParaAposentadoria() {
			System.out.println("NOVAS Regras para a Aposentadoria");
		}
	}

	public class Previdencia {
		public static void main(String[] args) {
			InformaRegras regras = new InformaRegras();
	
			//Uso do método obsoleto (deprecated)
			regras.mostrarRegrasParaAposentadoria();
			//Uso do método novo
			regras.mostrarNovasRegrasParaAposentadoria();
		}
	}
```

``` java
// 4_supress_warning
	class informaRegras {
		@Deprecated
		public void mostrarRegrasParaAposentadoria() {
			System.out.println("Regras para a Aposentadoria");
		}

		public void mostrarNovasRegrasParaAposentadoria() {
			System.out.println("NOVAS Regras para a Aposentadoria");
		}
	}

	public class Previdencia {
		
		@SupressWarnings("deprecation")
		public static void main(String[] args) {
		
			InformaRegras regras = new InformaRegras();
	
			//Uso do método obsoleto (deprecated)
			regras.mostrarRegrasParaAposentadoria();
			//Uso do método novo
			regras.mostrarNovasRegrasParaAposentadoria();
		}
	}
```

``` java
// 5_metodos_obsoletos_mesma_classe
	class informaRegras {
		@Deprecated
		public void mostrarRegrasParaAposentadoria() {
			System.out.println("Regras para a Aposentadoria");
		}

		public void mostrarNovasRegrasParaAposentadoria() {
			System.out.println("NOVAS Regras para a Aposentadoria");
		}

		public void chamarMetodoObsoletoNaMesmaClasse() {
			mostrarRegrasParaAposentadoria()
		}
	}

	public class TestDeprecated {

		public static void main(String[] args) {
		
			InformaRegras regras = new InformaRegras();

			regras.chamarMetodoObsoletoNaMesmaClasse();
		}
	}
```