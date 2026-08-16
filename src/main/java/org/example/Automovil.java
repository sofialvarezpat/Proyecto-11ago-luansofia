package org.example;

public class Automovil extends Vehiculo {
    private int numeroPuertas;
    private String tipoCombustible;

    public Automovil() {
    }

    public Automovil(String placa, String marca, String modelo, int anio, double precioBase,
                     int numeroPuertas, String tipoCombustible) {
        super(placa, marca, modelo, anio, precioBase);
        this.setNumeroPuertas(numeroPuertas);
        this.setTipoCombustible(tipoCombustible);
    }

    public int getNumeroPuertas() {
        return this.numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        if (numeroPuertas >= 2 && numeroPuertas <= 5) {
            this.numeroPuertas = numeroPuertas;
        } else {
            System.out.println("Error: el número de puertas debe estar entre 2 y 5.");
        }
    }

    public String getTipoCombustible() {
        return this.tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        if (tipoCombustible != null &&
                (tipoCombustible.equalsIgnoreCase("Gasolina") ||
                        tipoCombustible.equalsIgnoreCase("Diésel") ||
                        tipoCombustible.equalsIgnoreCase("Eléctrico"))) {
            this.tipoCombustible = tipoCombustible;
        } else {
            System.out.println("Error: el tipo de combustible debe ser 'Gasolina', 'Diésel' o 'Eléctrico'.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo: Automóvil | Puertas: " + this.numeroPuertas + " | Combustible: " + this.tipoCombustible;
    }


    @Override
    public double calcularPrecioFinal() {
        double impuesto = 0.08;
        if (this.tipoCombustible != null && this.tipoCombustible.equalsIgnoreCase("Eléctrico")) {
            impuesto = 0.04; // Incentivo ambiental del 4%
        }
        return this.getPreciobase() + (this.getPreciobase() * impuesto);
    }
}