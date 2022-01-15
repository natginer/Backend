package mesas;

import presencial.Jugador;

import java.util.ArrayList;

public class Puerto {
    private String nombre;
    private ArrayList <Contenedores> contenedores;

    public Puerto(String nombre) {
        this.nombre = nombre;
        contenedores = new ArrayList<>();
    }

    public void agregarContenedores (Contenedores cont){
        contenedores.add(cont);
    }

    public void mostrarContenedoresOrdenados() {
        contenedores.sort(null);
        for (Contenedores cont : contenedores) {
            System.out.println(cont.toString());
        }
    }

    public int cantContPeligrosos() {
        int contador=0;
          for (Contenedores cont: contenedores){
              if (cont.getPais().equals("Desconocido") && cont.isTransportaMaterialesPeligrosos()){
                  contador++;
              }
          }
          return contador;
        }

}
