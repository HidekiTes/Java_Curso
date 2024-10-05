import java.util.Arrays;
import java.util.List;

public class LambdaComCollection {
	public static void main(String[] args) {
	List<Integer> listaDeNumeros = Arrays.asList(1,2,3,4,5);

	listaDeNumeros.forEach((numero) -> System.out.println(numero));
	}
}