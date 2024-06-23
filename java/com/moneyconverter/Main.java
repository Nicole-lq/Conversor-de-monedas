package com.moneyconverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Estás utilizando el conversor de monedas. ¿Qué cambios deseas hacer hoy?");
            System.out.println(); // Salto de línea
            System.out.println("1. Convertir peso chileno [CLP] a dólares [USD]");
            System.out.println("2. Convertir dólares [USD] a pesos chilenos [CLP]");
            System.out.println("3. Convertir peso chileno[CLP] a won surcoreano [KRW]");
            System.out.println("4. Convertir won surcoreano [KRW] a peso chileno [CLP]");
            System.out.println("5. Salir");
            System.out.println(); // Salto de línea
            System.out.print("Selecciona una opción (1-5): ");
            System.out.println(); // Salto de línea
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    convertirMoneda(scanner, "CLP", "USD");
                    break;
                case 2:
                    convertirMoneda(scanner, "USD", "CLP");
                    break;
                case 3:
                    convertirMoneda(scanner, "CLP", "KRW");
                    break;
                case 4:
                    convertirMoneda(scanner, "KRW", "CLP");
                    break;
                case 5:
                    System.out.println("Saliendo del programa. Gracias por tu preferencia");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona un número del 1 al 5.");
                    System.out.println(); // Salto de línea
            }
        } while (opcion != 5);
    }

    private static void convertirMoneda(Scanner scanner, String deMoneda, String aMoneda) {
        System.out.printf("Ingrese cantidad en %s: ", deMoneda);
        System.out.println(); // Salto de línea
        double cantidad = scanner.nextDouble();

        try {
            double tasa = TasaCambioAPI.obtenerTasaCambio(deMoneda, aMoneda);
            double cantidadConvertida = ConvertidorMoneda.convertir(cantidad, tasa);
            System.out.printf("%.2f %s son %.2f %s%n ", cantidad, deMoneda, cantidadConvertida, aMoneda);
            System.out.println(); // Salto de línea
        } catch (Exception e) {
            System.out.println("Error al obtener la tasa de cambio: " + e.getMessage());
            System.out.println(); // Salto de línea
        }
    }
}
