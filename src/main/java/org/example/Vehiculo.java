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
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPreciobase() {
        return preciobase;
    }

    public void setPreciobase(double preciobase) {
        this.preciobase = preciobase;
    }
}
