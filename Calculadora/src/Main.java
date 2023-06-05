import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, result;

        System.out.print("Ingrese a: ");
        a = scanner.nextDouble();
        System.out.print("Ingrese b: ");
        b = scanner.nextDouble();

        // Mostrar el menú en consola
        System.out.println("\nSeleccione una opción del menú:");
        System.out.println("\t1. Sumar.\n\t2. Restar.\n\t3. Multiplicar.\n\t4. Dividir.");

        // Capturar la opción ingresada por el usuario
        byte option = scanner.nextByte();

        // Evalular la opción ingresada y calcular el resultado correspondiente
        if(option == 1) {
            result = a + b;
            System.out.println(a + " + " + b + " = " + result);
        } else if(option == 2) {
            result = a - b;
            System.out.println(a + " - " + b + " = " + result);
        } else if(option == 3) {
            result = a * b;
            System.out.println(a + " * " + b + " = " + result);
        } else if(option == 4) {
            result = a / b;
            System.out.println(a + " / " + b + " = " + result);
        }
    }
}