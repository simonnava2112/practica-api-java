public class Laptop extends Producto {

    private String cpu;

    public Laptop(String marca, String modelo, double precio, String cpu) {
        super(marca, modelo, precio);
        this.cpu = cpu;
    }

    @Override
    public void mostrarInformacion() {
        System.out.printf("%s %s CPU: %s\n", getMarca(), getModelo(), cpu);
    }
}
