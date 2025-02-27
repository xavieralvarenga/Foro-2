package Models;

import Models.Equipo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Laptops extends Equipo {
    protected String pulgadasPantalla;
    protected String peso;
    // Arreglo para registrar y mostrar los laptops
    public static ArrayList<Laptops> arrayLaptops = new ArrayList<>();

    public Laptops(String fabricante, String modelo, String microprocesador, String memoria, String capacidadHardDisk, String pulgadasPantalla, String peso) {
        super(fabricante, modelo, microprocesador, memoria, capacidadHardDisk);
        this.pulgadasPantalla = pulgadasPantalla;
        this.peso = peso;
    }

    @Override
    public void registrarEquipo() {
        arrayLaptops.add(this);
        JOptionPane.showMessageDialog(null, "Laptop registrado exitosamente.");
    }

    @Override
    public void verEquipos() {
        // Crear el modelo de la tabla
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Fabricante");
        model.addColumn("Modelo");
        model.addColumn("Microprocesador");
        model.addColumn("Memoria");
        model.addColumn("Disco Duro");
        model.addColumn("Pulgadas Pantalla");
        model.addColumn("Peso");

        // Llenar la tabla con los datos
        for (Laptops laptop : arrayLaptops) {
            model.addRow(new Object[]{
                    laptop.fabricante,
                    laptop.modelo,
                    laptop.microprocesador,
                    laptop.memoria,
                    laptop.capacidadHardDisk,
                    laptop.pulgadasPantalla,
                    laptop.peso
            });
        }

        // Crear la tabla y mostrarla
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        JOptionPane.showMessageDialog(null, scrollPane, "Lista de Laptops", JOptionPane.PLAIN_MESSAGE);
    }
}
