import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese el precio para calcular su valor con IVA: ");
        double numero = reader.nextDouble();
        System.out.println("El precio con IVA es: " + precioConIva(numero));
    }

    public static double precioConIva(double precio){
        return precio + precio * .21;
    }
}