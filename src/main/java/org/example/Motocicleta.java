package org.example;

public class Motocicleta extends Vehiculo{
    private int cilindraje;

    public Motocicleta (){}

    public Motocicleta (String placa, String marca, String modelo, int anio, double precioBase,
                        int cilindraje){
        super ( placa, marca, modelo, anio, precioBase);
        this.cilindraje =cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        if (cilindraje > 0) {
            this.cilindraje = cilindraje;
        } else {
            System.out.println("Error: el cilindraje debe ser mayor a 0.");
        }

    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "cilindraje=" + cilindraje +
                '}';
    }

}
