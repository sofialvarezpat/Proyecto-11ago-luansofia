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
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "cilindraje=" + cilindraje +
                '}';
    }

}
