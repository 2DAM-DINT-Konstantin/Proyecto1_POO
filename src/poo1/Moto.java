package poo1;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String color, int cilindrada) {
        super(marca, color);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String mostrarInfo() {
        return "Tipo: Moto\n" +
               super.mostrarInfo() +
               "\nCilindrada: " + cilindrada + " cc";
    }
}
