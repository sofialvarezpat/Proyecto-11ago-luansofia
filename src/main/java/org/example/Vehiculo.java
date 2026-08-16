package org.example;

public abstract class Vehiculo {
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int anio;
    protected double preciobase;


    public Vehiculo() {
    }

    public Vehiculo(String Placa, String Marca, String Modelo, int Anio, double preciobase) {//esto es para editar
        this.placa = Placa;
        this.marca = Marca;
        this.modelo = Modelo;
        this.anio = Anio;
        this.preciobase = preciobase;

    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa != null && !placa.trim().isEmpty()) {
            this.placa = placa;
        } else {
            System.out.println("Error: la placa no puede estar vacía.");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null && !marca.trim().isEmpty()) {
            this.marca = marca;
        } else {
            System.out.println("Error: la marca no puede estar vacía.");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null && !modelo.trim().isEmpty()) {
            this.modelo = modelo;
        } else {
            System.out.println("Error: el modelo no puede estar vacío.");
        }
    }

    public int getAnio() {
        return anio;
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
        return preciobase;
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
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", preciobase=" + preciobase +
                '}';
    }
}
