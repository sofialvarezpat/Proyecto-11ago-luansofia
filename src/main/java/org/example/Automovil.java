package org.example;

public class Automovil  extends Vehiculo {
    private int numeroPuertas;
    private String tipoCombustible;

    public Automovil() {
    }

    public Automovil(String placa, String marca, String modelo, int anio, double precioBase,
                     int numeroPuertas, String tipoCombustible) {
        super(placa, marca, modelo, anio, precioBase);
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        if (numeroPuertas >= 2 && numeroPuertas <= 5) {
            this.numeroPuertas = numeroPuertas;
        } else {
            System.out.println("Error: el número de puertas debe estar entre 2 y 5.");
        }
    }

    public String getTipoCombustible() {
        return tipoCombustible;
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
        return "Automovil{" +
                "numeroPuertas=" + numeroPuertas +
                ", tipoCombustible='" + tipoCombustible + '\'' +
                '}';
    }


}
