// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Producto tele = new Televisor("Samsung", "A100", 100, "FULL_HD");

        tele.mostrarInformacion();
        tele.calcularPrecio();

        Producto laptop = new Laptop("Lenovo", "Thinkpad", 450000, "i5");
        laptop.mostrarInformacion();
        laptop.calcularPrecio();
    }
}