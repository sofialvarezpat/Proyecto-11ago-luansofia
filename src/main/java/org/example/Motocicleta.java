package org.example;

public class Motocicleta extends Vehiculo {

    private int cilindraje;

    public Motocicleta() {
        super();
    }

    public Motocicleta(String placa, String marca, String modelo, int anio, double precioBase, int cilindraje) {
        super(placa, marca, modelo, anio, precioBase);
        setCilindraje(cilindraje);
    }

    @Override
    public double calcularPrecioFinal() {
        double porcentajeImpuesto = 0.03; // 3% de impuesto base

        // Si supera los 500 c.c. se suma un recargo del 2%
        if (this.cilindraje > 500) {
            porcentajeImpuesto += 0.02; // Sube al 5% total
        }

        return getPrecioBase() + (getPrecioBase() * porcentajeImpuesto);
    }

    // --- SOBRESCRITURA DE MOSTRAR FICHA ---

    @Override
    public String mostrarFicha() {
        return super.mostrarFicha() +
                "\nTipo: Motocicleta | Cilindraje: " + this.cilindraje + " c.c.";
    }

    // --- GETTERS Y SETTERS CON VALIDACIÓN ---

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        if (cilindraje > 0) {
            this.cilindraje = cilindraje;
        } else {
            System.out.println("Error: El cilindraje debe ser un valor positivo.");
        }
    }
}
