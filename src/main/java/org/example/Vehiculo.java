package org.example;

public abstract class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int anio;
    private double preciobase;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String marca, String modelo, int anio, double preciobase) {
        this.setPlaca(placa);
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAnio(anio);
        this.setPreciobase(preciobase);
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        if (placa != null && !placa.trim().isEmpty()) {
            this.placa = placa;
        } else {
            System.out.println("Error: la placa no puede estar vacía.");
        }
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        if (marca != null && !marca.trim().isEmpty()) {
            this.marca = marca;
        } else {
            System.out.println("Error: la marca no puede estar vacía.");
        }
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null && !modelo.trim().isEmpty()) {
            this.modelo = modelo;
        } else {
            System.out.println("Error: el modelo no puede estar vacío.");
        }
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        int anioActual = java.time.Year.now().getValue();
        if (anio >= 1990 && anio <= anioActual) {
            this.anio = anio;
        } else {
            System.out.println("Error: el año debe estar entre 1990 y " + anioActual + ".");
        }
    }

    public double getPreciobase() {
        return this.preciobase;
    }

    public void setPreciobase(double preciobase) {
        if (preciobase > 0) {
            this.preciobase = preciobase;
        } else {
            System.out.println("Error: el precio base debe ser mayor a 0.");
        }
    }

    @Override
    public String toString() {
        return "Placa: " + this.placa + " | Marca: " + this.marca + " | Modelo: " + this.modelo + " | Año: " + this.anio;
    }


    public abstract double calcularPrecioFinal();

    public String mostrarFicha() {
        return this.toString();
    }
}