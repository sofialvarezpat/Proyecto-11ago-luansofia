package org.example;

public class Camion_Carga extends Vehiculo {
    private double capacidadToneladas;

    public Camion_Carga() {}

    public Camion_Carga(String placa, String marca, String modelo, int anio, double precioBase,
                        double capacidadToneladas) {
        super(placa, marca, modelo, anio, precioBase);
        this.setCapacidadToneladas(capacidadToneladas);
    }

    public double getCapacidadToneladas() {
        return this.capacidadToneladas;
    }

    public void setCapacidadToneladas(double capacidadToneladas) {
        if (capacidadToneladas > 0) {
            this.capacidadToneladas = capacidadToneladas;
        } else {
            System.out.println("Error: la capacidad en toneladas debe ser mayor a 0.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo: Camión de carga | Capacidad: " + this.capacidadToneladas + " ton";
    }


    @Override
    public double calcularPrecioFinal() {
        double impuesto = 0.05;
        double recargoPorTonelada = this.capacidadToneladas * 500000.0;
        return this.getPreciobase() + (this.getPreciobase() * impuesto) + recargoPorTonelada;
    }
}