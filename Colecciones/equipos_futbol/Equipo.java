package presencial;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList <Jugador> jugadores;

    public Equipo (String nombre){
        this.nombre=nombre;
        jugadores=new ArrayList<>();
    }

    public void addJugador(Jugador j){
        jugadores.add(j);
    }

    public void mostrarJugadoresTitulares(){
        //mostrar la info de jugadores titulares
        //ordenar
        jugadores.sort(null);
        for (Jugador jug:jugadores){
            if (jug.isTitular()){
                System.out.println(jug.toString());
            }
        }

    }

    public int getCantidadJugadoresLesionados(){
        int cont=0;
        for (Jugador jug:jugadores) {
            if(jug.isTitular() && jug.isLesionado()){
                cont ++;
            }
        }
        return cont;
    }

}
