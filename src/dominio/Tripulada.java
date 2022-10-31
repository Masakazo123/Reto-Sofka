package dominio;

import java.io.Serializable;

public class Tripulada extends Nave implements Serializable{

    private int capacidadPersonas;
    
    public Tripulada(int unaCapacidad, String pais, String modelo, boolean condicionesOptimas) {
        super(pais,modelo,condicionesOptimas);
        this.capacidadPersonas = unaCapacidad;
    }

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public void setCapacidadPersonas(int capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }

    @Override
    public String toString() {
        return super.toString() + "Tripulada{" + "capacidadPersonas=" + capacidadPersonas + '}';
    }
    
    
    
    public String[] toArray(){
        String[] fila = {
            "Tripulada",
            super.getModelo(),
            super.getPais(),
            super.getCondicionesOptimas()};
        return fila;
    }

    @Override
    public String prepararParaLanzamiento() {
        return "Cargando equipo de mantenimiento...";
    }

}
