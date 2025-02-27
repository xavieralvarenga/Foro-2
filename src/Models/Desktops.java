package Models;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

// Subclase Desktops
public class Desktops extends Equipo {
    protected String tarjetaGrafica;
    protected String tamañoTorre;
    // Arreglo para registrar y mostrar los desktops
    public static ArrayList<Desktops> arrayDesktops = new ArrayList<>();

    public Desktops(String fabricante, String modelo, String microprocesador, String memoria, String capacidadHardDisk, String tarjetaGrafica, String tamañoTorre) {
        super(fabricante, modelo, microprocesador, memoria, capacidadHardDisk);
        this.tarjetaGrafica = tarjetaGrafica;
        this.tamañoTorre = tamañoTorre;
    }

    @Override
    public void registrarEquipo() {
        arrayDesktops.add(this);
        JOptionPane.showMessageDialog(null, "Desktop registrado exitosamente.");
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
        model.addColumn("Tarjeta Gráfica");
        model.addColumn("Tamaño Torre");

        // Llenar la tabla con los datos
        for (Desktops desktop : arrayDesktops) {
            model.addRow(new Object[]{
                    desktop.fabricante,
                    desktop.modelo,
                    desktop.microprocesador,
                    desktop.memoria,
                    desktop.capacidadHardDisk,
                    desktop.tarjetaGrafica,
                    desktop.tamañoTorre
            });
        }

        // Crear la tabla y mostrarla
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        JOptionPane.showMessageDialog(null, scrollPane, "Lista de Desktops", JOptionPane.PLAIN_MESSAGE);
    }
}
