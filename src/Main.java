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
                        "3. Tablet\n" +
                        "Seleccione una opción:"
        );

        // Si el usuario hace clic en Cancelar, regresar al menú principal
        if (tipo == null) {
            return;
        }

        String fabricante = JOptionPane.showInputDialog("Ingrese el fabricante:");
        if (fabricante == null) {
            return; // Si el usuario hace clic en Cancelar, regresar al menú principal
        }

        String modelo = JOptionPane.showInputDialog("Ingrese el modelo:");
        if (modelo == null) {
            return; // Si el usuario hace clic en Cancelar, regresar al menú principal
        }

        String microprocesador = JOptionPane.showInputDialog("Ingrese el microprocesador:");
        if (microprocesador == null) {
            return; // Si el usuario hace clic en Cancelar, regresar al menú principal
        }

        String memoria = JOptionPane.showInputDialog("Ingrese la memoria RAM:");
        if (memoria == null) {
            return; // Si el usuario hace clic en Cancelar, regresar al menú principal
        }

        String capacidadHardDisk = JOptionPane.showInputDialog("Ingrese la capacidad del disco duro:");
        if (capacidadHardDisk == null) {
            return; // Si el usuario hace clic en Cancelar, regresar al menú principal
        }

        switch (tipo) {
            case "1":
                String tarjetaGrafica = JOptionPane.showInputDialog("Ingrese la tarjeta gráfica:");
                if (tarjetaGrafica == null) {
                    return; // Si el usuario hace clic en Cancelar, regresar al menú principal
                }

                String tamañoTorre = JOptionPane.showInputDialog("Ingrese el tamaño de la torre:");
                if (tamañoTorre == null) {
                    return; // Si el usuario hace clic en Cancelar, regresar al menú principal
                }

                Desktops desktop = new Desktops(fabricante, modelo, microprocesador, memoria, capacidadHardDisk, tarjetaGrafica, tamañoTorre);
                desktop.registrarEquipo();
                break;

            case "2":
                String pulgadasPantalla = JOptionPane.showInputDialog("Ingrese las pulgadas de la pantalla:");
                if (pulgadasPantalla == null) {
                    return; // Si el usuario hace clic en Cancelar, regresar al menú principal
                }

                String peso = JOptionPane.showInputDialog("Ingrese el peso:");
                if (peso == null) {
                    return; // Si el usuario hace clic en Cancelar, regresar al menú principal
                }

                Laptops laptop = new Laptops(fabricante, modelo, microprocesador, memoria, capacidadHardDisk, pulgadasPantalla, peso);
                laptop.registrarEquipo();
                break;

            case "3":
                String tamañoPantalla = JOptionPane.showInputDialog("Ingrese el tamaño diagonal de la pantalla:");
                if (tamañoPantalla == null) {
                    return; // Si el usuario hace clic en Cancelar, regresar al menú principal
                }

                String tipoPantalla = JOptionPane.showInputDialog("¿La pantalla es capacitiva o resistiva?");
                if (tipoPantalla == null) {
                    return; // Si el usuario hace clic en Cancelar, regresar al menú principal
                }

                String memoriaNAND = JOptionPane.showInputDialog("Ingrese el tamaño de la memoria NAND:");
                if (memoriaNAND == null) {
                    return; // Si el usuario hace clic en Cancelar, regresar al menú principal
                }

                String sistemaOperativo = JOptionPane.showInputDialog("Ingrese el sistema operativo:");
                if (sistemaOperativo == null) {
                    return; // Si el usuario hace clic en Cancelar, regresar al menú principal
                }

                Tablets tablet = new Tablets(fabricante, modelo, microprocesador, tamañoPantalla, tipoPantalla, memoriaNAND, sistemaOperativo);
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

        // Si el usuario hace clic en Cancelar, regresar al menú principal
        if (tipo == null) {
            return;
        }

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
