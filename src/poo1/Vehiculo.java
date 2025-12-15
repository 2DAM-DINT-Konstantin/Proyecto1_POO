package poo1;

public class Vehiculo {
    private String marca;
    private String color;

    public Vehiculo() {}

    public Vehiculo(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    // Getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String mostrarInfo() {
        return "Marca: " + marca + "\nColor: " + color;
    }
}
