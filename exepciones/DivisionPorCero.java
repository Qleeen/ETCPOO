public class DivisionPorCero {
    public static void main(String[] args) {
        try {
            int numerador = 10;
            int denominador = 0;
            int resultado = numerador / denominador; 
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) { // Usamos el catch para capturar la excepción de división por cero
            System.out.println("Error: No se puede dividir por cero.");
        }
    }
}
