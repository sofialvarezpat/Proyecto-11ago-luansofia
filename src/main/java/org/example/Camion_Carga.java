package org.example;

public class Camion_Carga extends Vehiculo{
    private double capacidadToneladas;

    public Camion_Carga (){}

    public Camion_Carga(String placa, String marca, String modelo, int anio, double precioBase,
                       double capacidadToneladas) {
        super(placa, marca, modelo, anio, precioBase);
        this.capacidadToneladas =capacidadToneladas;
    }

    public double getCapacidadToneladas() {
        return capacidadToneladas;
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
        return "Camion_Carga{" +
                "capacidadToneladas=" + capacidadToneladas +
                '}';
    }
}
