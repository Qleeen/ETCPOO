public class IndiceFueraRango {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[3]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: El índice está fuera del rango del arreglo.");
        }
    }
}
