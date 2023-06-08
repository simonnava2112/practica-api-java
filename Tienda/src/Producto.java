public abstract class Producto implements ProductoElectronico {

    private String marca;

    private String modelo;

    private double precio;

    public Producto(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public void mostrarInformacion() {
        System.out.printf("%s %s\n", getMarca(), getModelo());
    }

    @Override
    public void calcularPrecio() {
        System.out.printf("Precio: $%.2f\n", getPrecio());
    }
}
