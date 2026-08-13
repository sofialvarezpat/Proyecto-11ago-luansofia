package org.example;

public class Automovil extends Vehiculo {

    private int numeroPuertas;
    private String tipoCombustible;

    public Automovil() {
        super();
    }

    public Automovil(String placa, String marca, String modelo, int anio, double precioBase,
                     int numeroPuertas, String tipoCombustible) {
        super(placa, marca, modelo, anio, precioBase);
        setNumeroPuertas(numeroPuertas);
        setTipoCombustible(tipoCombustible);
    }


    @Override
    public double calcularPrecioFinal() {
        double porcentajeImpuesto = 0.08; // 8% por defecto[cite: 1]

        if ("Eléctrico".equalsIgnoreCase(this.tipoCombustible)) {
            porcentajeImpuesto = 0.04; // 4% si es eléctrico[cite: 1]
        }

        return getPrecioBase() + (getPrecioBase() * porcentajeImpuesto);
    }

    // --- SOBRESCRITURA DE MOSTRAR FICHA ---

    @Override
    public String mostrarFicha() {
        return super.mostrarFicha() +
                String.format("%nTipo: Automóvil | Puertas: %d | Combustible: %s",
                        this.numeroPuertas, this.tipoCombustible);
    }

    // --- GETTERS Y SETTERS CON VALIDACIONES (Encapsulamiento) ---

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        if (numeroPuertas >= 2 && numeroPuertas <= 5) {
            this.numeroPuertas = numeroPuertas;
        } else {
            System.out.println("Error: El número de puertas debe estar entre 2 y 5.");
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
            System.out.println("Error: El tipo de combustible debe ser Gasolina, Diésel o Eléctrico.");
        }
    }
}