``` java
// 1_variaveis_final
class ExemploFinal {
	// Definição de Constante - Uso de final
	final int CODIGO_FIXO = 10;
	
	// Método final
	final void meuMetodo(){
		System.out.println("Este é um método final.");
	}
}

public class TestFinalKeyword {
	public static void main(String[] args) {
		ExemploFinal.textFinal = new ExemploFinal();
		System.out.println("Valor da constante: " + testFinal.CODIGO_FIXO);
		testFinal.meuMetodo();
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