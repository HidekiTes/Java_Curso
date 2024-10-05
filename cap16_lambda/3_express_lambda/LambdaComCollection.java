import java.util.Arrays;
import java.util.*;

public class LambdaComCollection {
	public static void main(String[] args) {
		List<Integer> listaDeNumeros = Arrays.asList(1,2,3,4,5,100);
		List<Integer> numerosPares = new ArrayList<>();
		
		listaDeNumeros.forEach((numero) -> {
			if (numero % 2 == 0) {
				numerosPares.add(numero);
			}
		} );
		
		System.out.println("Numeros pares: " + numerosPares);
	}
}