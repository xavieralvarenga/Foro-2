package Models;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

// Subclase Tablets
public class Tablets extends Equipo {
    protected String tamañoPantalla; // Tamaño diagonal de pantalla
    protected String tipoPantalla;   // Capacitiva o Resistiva
    protected String memoriaNAND;    // Tamaño de memoria NAND
    protected String sistemaOperativo; // Sistema Operativo
    // Arreglo para registrar y mostrar los tablets
    public static ArrayList<Tablets> arrayTablets = new ArrayList<>();

    public Tablets(String fabricante, String modelo, String microprocesador, String tamañoPantalla, String tipoPantalla, String memoriaNAND, String sistemaOperativo) {
        super(fabricante, modelo, microprocesador, "", ""); // Memoria y capacidad de disco duro no aplican
        this.tamañoPantalla = tamañoPantalla;
        this.tipoPantalla = tipoPantalla;
        this.memoriaNAND = memoriaNAND;
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public void registrarEquipo() {
        arrayTablets.add(this);
        JOptionPane.showMessageDialog(null, "Tablet registrado exitosamente.");
    }

    @Override
    public void verEquipos() {
        // Crear el modelo de la tabla
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Fabricante");
        model.addColumn("Modelo");
        model.addColumn("Microprocesador");
        model.addColumn("Tamaño Pantalla");
        model.addColumn("Tipo Pantalla");
        model.addColumn("Memoria NAND");
        model.addColumn("Sistema Operativo");

        // Llenar la tabla con los datos
        for (Tablets tablet : arrayTablets) {
            model.addRow(new Object[]{
                    tablet.fabricante,
                    tablet.modelo,
                    tablet.microprocesador,
                    tablet.tamañoPantalla,
                    tablet.tipoPantalla,
                    tablet.memoriaNAND,
                    tablet.sistemaOperativo
            });
        }

        // Crear la tabla y mostrarla
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        JOptionPane.showMessageDialog(null, scrollPane, "Lista de Tablets", JOptionPane.PLAIN_MESSAGE);
    }
}
