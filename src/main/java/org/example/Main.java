package org.example;


import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void agregarVehiculo(List<Vehiculo> inventario, Vehiculo v) {
        if (v != null) {
            inventario.add(v);
        }
    }

    public static void listarInventario(List<Vehiculo> inventario) {
        System.out.println("=== INVENTARIO AUTOMOTION S.A.S. ===\n");
        for (Vehiculo v : inventario) {
            System.out.println(v.mostrarFicha());
            System.out.println("Precio final: " + v.calcularPrecioFinal());
        }
    }

    public static double calcularValorTotalInventario(List<Vehiculo> inventario) {
        double total = 0;
        for (Vehiculo v : inventario) {
            total += v.calcularPrecioFinal();
        }
        return total;
    }

    public static Vehiculo buscarPorPlaca(List<Vehiculo> inventario, String placa) {
        for (Vehiculo v : inventario) {
            if (v.getPlaca().equalsIgnoreCase(placa)) {
                return v;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        List<Vehiculo> inventario = new ArrayList<>();

        Vehiculo auto1 = new Automovil("ABC123", "Mazda", "3", 2022, 35000000, 4, "Gasolina");
        Vehiculo auto2 = new Automovil("XYZ456", "Tesla", "Model 3", 2023, 60000000, 4, "Eléctrico");

        Vehiculo moto1 = new Motocicleta("MT789", "Yamaha", "MT-07", 2023, 27500000, 689);
        Vehiculo moto2 = new Motocicleta("NK321", "Kawasaki", "Ninja 400", 2022, 20000000, 399);

        Vehiculo camion1 = new Camion_Carga("CAM456", "Kenworth", "T800", 2021, 150000000, 12.0);
        Vehiculo camion2 = new Camion_Carga("CAM789", "Scania", "R500", 2020, 180000000, 8.5);

        agregarVehiculo(inventario, auto1);
        agregarVehiculo(inventario, auto2);
        agregarVehiculo(inventario, moto1);
        agregarVehiculo(inventario, moto2);
        agregarVehiculo(inventario, camion1);
        agregarVehiculo(inventario, camion2);

        listarInventario(inventario);
        double total = calcularValorTotalInventario(inventario);
        System.out.println("=== VALOR TOTAL DEL INVENTARIO: " + total + " ===\n");

        String placaBuscar = "MT789";
        Vehiculo encontrado = buscarPorPlaca(inventario, placaBuscar);
        if (encontrado != null) {
            System.out.println("--- Vehículo encontrado ---");
            System.out.println(encontrado.mostrarFicha());
            System.out.println("Precio final: " + encontrado.calcularPrecioFinal());
        } else {
            System.out.println("No se encontró vehículo con placa " + placaBuscar);
        }

        System.out.println("\n--- Prueba de validación ---");
        System.out.println("Intentando crear un vehículo con datos inválidos:");
        Vehiculo invalido = new Automovil("", "Toyota", "Corolla", 1800, -5000, 6, "Hidrógeno");
        System.out.println("Fin de la prueba.");
    }
}