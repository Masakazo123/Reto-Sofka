package dominio;

import java.io.Serializable;

public class NoTripulada extends Nave implements Serializable{
    
    private int empuje;
    
    public NoTripulada(String pais, String modelo, boolean condicionesOptimas) {
        super(pais,modelo,condicionesOptimas);
    }

    public int getEmpuje() {
        return empuje;
    }

    public void setEmpuje(int empuje) {
        this.empuje = empuje;
    }

    @Override
    public String toString() {
        return "Nave no tripulada - "+super.toString();
    }
    
    
    
    public String[] toArray(){
        String[] fila = {
            "No tripulada",
            super.getModelo(),
            super.getPais(),
            super.getCondicionesOptimas()};
        return fila;
    }

    @Override
    public String prepararParaLanzamiento() {
        return "Limpiando paneles solares...";
    }

    
}
