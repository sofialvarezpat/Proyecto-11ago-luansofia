package org.example;

public class Motocicleta extends Vehiculo {
    private int cilindraje;

    public Motocicleta() {}

    public Motocicleta(String placa, String marca, String modelo, int anio, double precioBase,
                       int cilindraje) {
        super(placa, marca, modelo, anio, precioBase);
        this.setCilindraje(cilindraje);
    }

    public int getCilindraje() {
        return this.cilindraje;
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
        return super.toString() + " | Tipo: Motocicleta | Cilindraje: " + this.cilindraje + " c.c.";
    }


    @Override
    public double calcularPrecioFinal() {
        double impuesto = 0.03; // 3% de impuesto de matrícula
        if (this.cilindraje > 500) {
            impuesto += 0.02; // Recargo adicional del 2% por alto cilindraje
        }
        return this.getPreciobase() + (this.getPreciobase() * impuesto);
    }
}