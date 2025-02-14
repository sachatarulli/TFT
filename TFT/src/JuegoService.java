import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JuegoService {
    private List<String> paises = new ArrayList<>(List.of(
            "Argentina", "Brasil", "Alemania", "Italia",
            "Francia", "Inglaterra", "Uruguay", "Portugal", "España",
            "Holanda", "Resto del mundo"));

    /*
    Como se usa el constructor sin parámetros, automáticamente llama a agregarJugador() y agrega jugadores a la lista.
     */
    Plantilla p = new Plantilla();


    // Obtener la lista de jugadores
    List<Jugador> listaJugadores = p.getJugadores();

    public List<String> obtenerJugadoresPorNacionalidad(String nacionalidad) {
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

    private Random random = new Random();

    public String girarRuleta() {
        if (paises.isEmpty()) {
            return "No quedan más países en la ruleta.";
        }
        int index = random.nextInt(paises.size()); // Selecciona un índice aleatorio
        return paises.remove(index); // Remueve y devuelve el país seleccionado
    }

}
