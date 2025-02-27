import Models.Desktops;
import Models.Laptops;
import Models.Tablets;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        while (true) {
            String opcion = JOptionPane.showInputDialog(
                    "Menú Principal\n" +
                            "1. Registrar equipo\n" +
                            "2. Ver equipos\n" +
                            "3. Salir\n" +
                            "Seleccione una opción:"
            );

            switch (opcion) {
                case "1":
                    registrarEquipo();
                    break;
                case "2":
                    verEquipos();
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }

    private static void registrarEquipo() {
        String tipo = JOptionPane.showInputDialog(
                "Seleccione el tipo de equipo:\n" +
                        "1. Desktop\n" +
                        "2. Laptop\n" +
                        "3. Tablet"
        );

        String fabricante = JOptionPane.showInputDialog("Ingrese el fabricante:");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo:");
        String microprocesador = JOptionPane.showInputDialog("Ingrese el microprocesador:");
        String memoria = JOptionPane.showInputDialog("Ingrese la memoria:");
        String capacidadHardDisk = JOptionPane.showInputDialog("Ingrese la capacidad del disco duro:");

        switch (tipo) {
            case "1":
                String tarjetaGrafica = JOptionPane.showInputDialog("Ingrese la tarjeta gráfica:");
                String tamañoTorre = JOptionPane.showInputDialog("Ingrese el tamaño de la torre:");
                Desktops desktop = new Desktops(fabricante, modelo, microprocesador, memoria, capacidadHardDisk, tarjetaGrafica, tamañoTorre);
                desktop.registrarEquipo();
                break;
            case "2":
                String pulgadasPantalla = JOptionPane.showInputDialog("Ingrese las pulgadas de la pantalla:");
                String peso = JOptionPane.showInputDialog("Ingrese el peso:");
                Laptops laptop = new Laptops(fabricante, modelo, microprocesador, memoria, capacidadHardDisk, pulgadasPantalla, peso);
                laptop.registrarEquipo();
                break;
            case "3":
                String capacidadBateria = JOptionPane.showInputDialog("Ingrese la capacidad de la batería:");
                String sistemaOperativo = JOptionPane.showInputDialog("Ingrese el sistema operativo:");
                Tablets tablet = new Tablets(fabricante, modelo, microprocesador, memoria, capacidadHardDisk, capacidadBateria, sistemaOperativo);
                tablet.registrarEquipo();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Tipo de equipo no válido.");
        }
    }

    private static void verEquipos() {
        String tipo = JOptionPane.showInputDialog(
                "Seleccione el tipo de equipo a ver:\n" +
                        "1. Desktops\n" +
                        "2. Laptops\n" +
                        "3. Tablets"
        );

        switch (tipo) {
            case "1":
                if (Desktops.arrayDesktops.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay Desktops registrados.");
                } else {
                    new Desktops("", "", "", "", "", "", "").verEquipos();
                }
                break;
            case "2":
                if (Laptops.arrayLaptops.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay Laptops registrados.");
                } else {
                    new Laptops("", "", "", "", "", "", "").verEquipos();
                }
                break;
            case "3":
                if (Tablets.arrayTablets.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay Tablets registrados.");
                } else {
                    new Tablets("", "", "", "", "", "", "").verEquipos();
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Tipo de equipo no válido.");
        }
    }
}
