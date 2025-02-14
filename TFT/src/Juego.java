import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Juego {

    private List<String> equipo1 = new ArrayList<>(List.of(
            "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"));
    private List<String> equipo2 = new ArrayList<>(List.of(
            "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"));
    private boolean turnoJugador1;

    Scanner scanner = new Scanner(System.in);

    /*
    LISTAS DE 11 CEROS
    METEMOS LOS STRINGS DE DATOS (NOMBRE APELLIDO (MEDIA) )
     */

    public Juego(boolean turnoJugador1) {
        this.turnoJugador1 = turnoJugador1;
    }

    public void jugar() {
        // Pedimos nombres a los usuarios
        System.out.print("Ingrese el nombre del jugador 1: ");
        String jugador1 = scanner.nextLine();
        System.out.print("Ingrese el nombre del jugador 2: ");
        String jugador2 = scanner.nextLine();

        // Sorteo, lanzamiento de moneda
        System.out.println("Sorteo de moneda...");
        Random rand = new Random();
        int moneda = rand.nextInt(2);
        if (moneda == 0) {
            turnoJugador1 = true;
            System.out.println("Comienza: " + jugador1);
        } else {
            turnoJugador1 = false;
            System.out.println("Comienza: " + jugador2);
        }

        // Opciones jugadores
        int opcionUsuario1;
        int opcionUsuario2;

        JuegoService juego = new JuegoService();
        for (int i = 0; i < 10; i++) {// Simulamos 10 giros de ruleta

            String paisSorteado = juego.girarRuleta();  // Pais sorteado
            System.out.println("País seleccionado: " + paisSorteado);

            // Obtenemos jugadores por nacionalidad y lo agregamos a una lista
            List<String> jugadoresDelPais = juego.obtenerJugadoresPorNacionalidad(paisSorteado);
            System.out.println("lista de jugadores: ");

            for (int j = 0; j < jugadoresDelPais.size(); j++) {
                System.out.println(j+1 + ". " + jugadoresDelPais.get(j));
            }

            // Determinar qué jugador elige
            if (turnoJugador1) {

                // Do-While OpcionJugador1, restriccion de valores válidos
                do {
                    System.out.print(jugador1 + ", elige un jugador ingresando el número correspondiente: ");
                    opcionUsuario1 = scanner.nextInt();
                } while (opcionUsuario1 < 1 || opcionUsuario1 > 11);

                // Do-While OpcionJugador2, restriccion de valores válidos y diferente elección al jug1
                do {
                    System.out.print(jugador2 + ", elige un jugador ingresando el número correspondiente: ");
                    opcionUsuario2 = scanner.nextInt();
                } while (opcionUsuario1 == opcionUsuario2 || opcionUsuario2 < 1 || opcionUsuario2 > 11);

            } else {
                // Do-While OpcionJugador2, restriccion de valores válidos
                do {
                    System.out.print(jugador2 + ", elige un jugador ingresando el número correspondiente: ");
                    opcionUsuario2 = scanner.nextInt();
                } while (opcionUsuario2 < 1 || opcionUsuario2 > 11);

                // Do-While OpcionJugador1, restriccion de valores válidos y diferente elección al jug2
                do {
                    System.out.print(jugador1 + ", elige un jugador ingresando el número correspondiente: ");
                    opcionUsuario1 = scanner.nextInt();
                } while (opcionUsuario2 == opcionUsuario1 || opcionUsuario1 < 1 || opcionUsuario1 > 11);
            }

            equipo1.add(opcionUsuario1 - 1, jugadoresDelPais.get(opcionUsuario1 - 1));
            equipo2.add(opcionUsuario2 - 1, jugadoresDelPais.get(opcionUsuario2 - 1));

            turnoJugador1 = !turnoJugador1;

            System.out.println("-----------------------");
        }
    }


    /*
    llamar a la ruleta, obtenemos pais
    obtenerJugadores, retorna lista
    mostramos la lista a los usuarios
    seleccionar jugadores
    restringir jugadores elegidos y posiciones
    msotrar los equipos
    calcular medias
    obtener ganador
     */


}
