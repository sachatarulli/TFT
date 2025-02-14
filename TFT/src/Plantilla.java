import java.util.ArrayList;
import java.util.List;

public class Plantilla {
    private List<Jugador> jugadores;

    public Plantilla() {
    }

    public Plantilla(List<Jugador> jugadores) {
        this.jugadores = new ArrayList<Jugador>();
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void agregarJugadores() {
        /*
        Se instancian jugadores de tipo Jugador pero son de Arquero, Defensor, etc. debido al polimorfismo.
         */
        Jugador arqueroArg1 = new Arquero("Pato","Fillol","Argentina",90,90,90);
        this.jugadores.add(arqueroArg1);
        Jugador arqueroArg2 = new Arquero("Dibu","Martinez","Argentina",90,90,90);
        this.jugadores.add(arqueroArg2);
    }
}
