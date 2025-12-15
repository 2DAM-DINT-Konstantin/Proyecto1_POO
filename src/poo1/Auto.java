package poo1;

public class Auto extends Vehiculo {
    private String tipoCombustible;

    public Auto(String marca, String color, String tipoCombustible) {
        super(marca, color);
        this.tipoCombustible = tipoCombustible;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String mostrarInfo() {
        return "Tipo: Auto\n" +
               super.mostrarInfo() +
               "\nTipo Combustible: " + tipoCombustible +
                "Tercer commit";
              
    }
    

            
           
}
