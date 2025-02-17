import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Plantilla {
    private List<Jugador> jugadores;

    public Plantilla() {
        this.jugadores = new ArrayList<>();
        cargarDesdeCSV("jugadoresMejorado.csv");
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
/*
se importan los datos de los jugadores desde archivo.csv, guardamos cada campo en una
String[] separandolos por la coma, luego ponemos cada campo en una variable para
luego, cuando verificamos la posicion, creamos el objeto jugador con todas las variables.
 */
    public void cargarDesdeCSV(String archivo) {
        String linea;
        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            while ((linea = lector.readLine()) != null) {
                String[] datos = linea.split(",");
                String posicion = datos[0].trim();
                String nombre = datos[1].trim();
                String apellido = datos[2].trim();
                String nacionalidad = datos[3].trim();
                int atributo1 = Integer.parseInt(datos[4].trim());
                int atributo2 = Integer.parseInt(datos[5].trim());
                int atributo3 = Integer.parseInt(datos[6].trim());

                Jugador jugador = null;

                switch (posicion.toLowerCase()) {
                    case "arquero":
                        jugador = new Arquero(nombre, apellido, nacionalidad, atributo1, atributo2, atributo3);
                        break;
                    case "defensor":
                        jugador = new Defensor(nombre, apellido, nacionalidad, atributo1, atributo2, atributo3);
                        break;
                    case "mediocampista":
                        jugador = new Mediocampista(nombre, apellido, nacionalidad, atributo1, atributo2, atributo3);
                        break;
                    case "delantero":
                        jugador = new Delantero(nombre, apellido, nacionalidad, atributo1, atributo2, atributo3);
                        break;
                }

                jugadores.add(jugador);
            }
            /*
            no hace falta cerrar el archivo con finally porque utilizamos un "try-with-resources"
            es decir que el archivo se cierra solo cuando termina el try
             */
        } catch (IOException e) {
            System.out.println("Error al leer el archivo CSV: " + e.getMessage());
        }
    }
}
