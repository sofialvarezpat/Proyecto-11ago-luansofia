package org.example;

public class CamionCarga extends Vehiculo {

    private double capacidadToneladas;

    public CamionCarga() {
        super();
    }

    public CamionCarga(String placa, String marca, String modelo, int anio, double precioBase, double capacidadToneladas) {
        super(placa, marca, modelo, anio, precioBase);
        setCapacidadToneladas(capacidadToneladas);
    }

    // --- IMPLEMENTACIÓN DEL MÉTODO ABSTRACTO (Polimorfismo) ---

    @Override
    public double calcularPrecioFinal() {
        double impuestoBase = getPrecioBase() * 0.05; // 5% de impuesto
        double recargoPorCapacidad = this.capacidadToneladas * 500000.0; // $500.000 por tonelada

        return getPrecioBase() + impuestoBase + recargoPorCapacidad;
    }

    // --- SOBRESCRITURA DE MOSTRAR FICHA ---

    @Override
    public String mostrarFicha() {
        return super.mostrarFicha() +
                "\nTipo: Camión de carga | Capacidad: " + this.capacidadToneladas + " ton";
    }



    public double getCapacidadToneladas() {
        return capacidadToneladas;
    }

    public void setCapacidadToneladas(double capacidadToneladas) {
        if (capacidadToneladas > 0) {
            this.capacidadToneladas = capacidadToneladas;
        } else {
            System.out.println("Error: La capacidad en toneladas debe ser mayor a 0.");
        }
    }
}