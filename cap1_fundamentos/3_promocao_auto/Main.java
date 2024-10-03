public class Main {
    public static void main(String[] args){
        // 1. byte, short e char são promovidos para int quando usados em uma expressão
        // byte a = 10;
        // int b = a + 5; // a é promovido para int antes do cálculo
        
        // 2. Se um operado é long, o outro é promovido para long
        int a = 10;
        long b = 15L;
        long c = a + b; // a é promovido para long antes do cálculo

        // 3. Se um operando é float, o outro é promovido para float
        // int a = 10;
        // float b = 1.5f;
        // float c = a * b; // a é promovido para float antes do cálculo

        // 4. Se um operando é double o outro é promovido para double
        // int a = 10;
        // double b = 1.5;
        // double c = a * b ; // a é promovido para double antes do cálculo
        
        System.out.println("Valor de c = " + c);
    }
}
