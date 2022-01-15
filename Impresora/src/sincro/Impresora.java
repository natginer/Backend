package sincro;

import java.util.Date;

public abstract class Impresora {
    private String modelo;
    private String tipoConexiin;
    private Date fechaFabricacion;
    private int hojasDisponibles;
    private double porcentajeTinta;

    public boolean tienePapel(){
        return hojasDisponibles>=1;
    }
    public boolean necesitaTinta(){
        return porcentajeTinta<5;
    }
    public abstract String imprimir();

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConexiin() {
        return tipoConexiin;
    }

    public void setTipoConexiin(String tipoConexiin) {
        this.tipoConexiin = tipoConexiin;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public int getHojasDisponibles() {
        return hojasDisponibles;
    }

    public void setHojasDisponibles(int hojasDisponibles) {
        this.hojasDisponibles = hojasDisponibles;
    }

    public double getPorcentajeTinta() {
        return porcentajeTinta;
    }

    public void setPorcentajeTinta(double porcentajeTinta) {
        this.porcentajeTinta = porcentajeTinta;
    }
}
