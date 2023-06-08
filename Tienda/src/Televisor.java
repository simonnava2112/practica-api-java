public class Televisor extends Producto {

    private String definicion;

    public Televisor(String marca, String modelo, double precio, String definicion) {
        super(marca, modelo, precio);
        this.definicion = definicion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.printf("Televisor %s %s %s\n", getMarca(), getModelo(), definicion);
    }

    @Override
    public void calcularPrecio() {
        System.out.printf("Precio: $%.2f\n", getPrecio() * 1.15);
    }
}
