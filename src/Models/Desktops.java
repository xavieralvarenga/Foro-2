package Models;

import java.util.ArrayList;

public class Desktops extends Equipo{
    protected String tarjetaGrafica;
    protected String tamañoTorre;
    //Arreglo para registrar y mostrar los desktops
    ArrayList<String> arrayDesktops = new ArrayList<>();

    public Desktops(String fabricante, String modelo, String microprocesador, String memoria, String capacidadHardDisk, String tarjetaGrafica, String tamañoTorre){
        super(fabricante, modelo, microprocesador, memoria, capacidadHardDisk);
        this.tarjetaGrafica = tarjetaGrafica;
        this.tamañoTorre = tamañoTorre;
    }

    @Override
    public void registrarEquipo() {

    }

    @Override
    public void verEquipos() {

    }
}
