package Models;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

// Clase Base
public abstract class Equipo {
    protected String fabricante;
    protected String modelo;
    protected String microprocesador;
    protected String memoria;
    protected String capacidadHardDisk;

    public Equipo(String fabricante, String modelo, String microprocesador, String memoria, String capacidadHardDisk) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.microprocesador = microprocesador;
        this.memoria = memoria;
        this.capacidadHardDisk = capacidadHardDisk;
    }

    protected abstract void registrarEquipo();
    protected abstract void verEquipos();
}
