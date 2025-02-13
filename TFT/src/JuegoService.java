import java.util.ArrayList;
import java.util.List;

public class JuegoService {

    /*
    Como se usa el constructor sin parámetros, automáticamente llama a agregarJugador() y agrega jugadores a la lista.
     */
    DBJugadores db = new DBJugadores();

    // Obtener la lista de jugadores
    List<Jugador> listaJugadores = db.getJugadores();

    public List<String> obtenerJugadores(String nacionalidad) {
        List<String> seleccion = new ArrayList<>();

        for (Jugador jugador: listaJugadores) {
            if (jugador.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
                // fomart para no usar concatenación
                String datos = String.format("%s %s (%d)", jugador.getNombre(), jugador.getApellido(), jugador.calcularMedia());
                seleccion.add(datos);
            }
        }
        return seleccion;
    }
}
