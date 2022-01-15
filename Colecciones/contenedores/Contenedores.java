package mesas;

import presencial.Jugador;

public class Contenedores implements Comparable <Contenedores>{
    private int nroIdentificador;
    private String pais;
    private boolean transportaMaterialesPeligrosos;


    public Contenedores(int nroIdentificador, String pais, boolean transportaMaterialesPeligrosos) {
        this.nroIdentificador = nroIdentificador;
        this.pais = pais;
        this.transportaMaterialesPeligrosos = transportaMaterialesPeligrosos;
    }

    public int getNroIdentificador() {
        return nroIdentificador;
    }

    public void setNroIdentificador(int nroIdentificador) {
        this.nroIdentificador = nroIdentificador;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isTransportaMaterialesPeligrosos() {
        return transportaMaterialesPeligrosos;
    }

    public void setTransportaMaterialesPeligrosos(boolean transportaMaterialesPeligrosos) {
        this.transportaMaterialesPeligrosos = transportaMaterialesPeligrosos;
    }

    @Override
    public int compareTo (Contenedores o){
        int resp =0;
        if (nroIdentificador >o.nroIdentificador){
            resp=1;
        }
        if (nroIdentificador<o.nroIdentificador){
            resp=-1;
        }
        return resp;
    }

    @Override
    public String toString(){
        return "Nro: " + nroIdentificador;
    }
}
