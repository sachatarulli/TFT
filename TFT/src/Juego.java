import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Juego {
    /*
    LISTAS DE 11 CEROS
    METEMOS LOS STRINGS DE DATOS (NOMBRE APELLIDO (MEDIA) )
     */
    private List<String> equipo1 = new ArrayList<>(List.of(
            "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"));
    private List<String> equipo2 = new ArrayList<>(List.of(
            "0", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0"));
    private boolean turnoJugador1;

    private String jugador1;

    private String jugador2;

    Scanner scanner = new Scanner(System.in);

    public Juego(boolean turnoJugador1) {
        this.turnoJugador1 = turnoJugador1;
    }

    public void jugar() {
        pedirNombres();
        sortearTurno();
        JuegoService juegoService = new JuegoService();

        for (int i = 0; i < 11; i++) {
            String paisSorteado = juegoService.girarRuleta();
            List<String> jugadoresDelPais = juegoService.obtenerJugadoresPorNacionalidad(paisSorteado);

            System.out.println("País seleccionado: " + paisSorteado);
            mostrarJugadores(jugadoresDelPais);

            if (turnoJugador1) {
                seleccionarJugador(jugador1, equipo1, equipo2, jugadoresDelPais);
                seleccionarJugador(jugador2, equipo2, equipo1, jugadoresDelPais);
            } else {
                seleccionarJugador(jugador2, equipo2, equipo1, jugadoresDelPais);
                seleccionarJugador(jugador1, equipo1, equipo2, jugadoresDelPais);
            }

            turnoJugador1 = !turnoJugador1;
            System.out.println("-------------------------------------------------------------------------");
        }
    }

    private void pedirNombres() {
        System.out.print("Ingrese el nombre del jugador 1: ");
        jugador1 = scanner.nextLine();
        System.out.print("Ingrese el nombre del jugador 2: ");
        jugador2 = scanner.nextLine();
    }

    private void sortearTurno() {
        Random random = new Random();
        int sorteo = random.nextInt(2);
        if (sorteo == 0) {
            turnoJugador1 = true;
        } else {
            turnoJugador1 = false;
        }
    }

    private void mostrarJugadores(List<String> jugadores) {
        System.out.println("⚽⚽     Lista de jugadores    ⚽⚽");
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println((i + 1) + ". " + jugadores.get(i));
        }
        System.out.println("12. Selección de un jugador particular");
        System.out.println("--------------------------------------");
    }

    private void seleccionarJugador(String jugador, List<String> equipoPropio, List<String> equipoRival, List<String> jugadoresDelPais) {
        int opcion;
        boolean entradaValida;

        do {
            opcion = validarEntrada(jugador + ", elegí un jugador ingresando el número correspondiente: ", 1, 12);
            entradaValida = true;

            if (opcion == 12) {
                int posicion;
                do {
                    posicion = validarEntrada("Ingrese la posición: ", 1, 11);
                } while (!equipoPropio.get(posicion - 1).equals("0"));

                equipoPropio.set(posicion - 1, obtenerJugador());
            } else if (!equipoPropio.get(opcion - 1).equals("0")) {
                System.out.println("❌ Posición ya elegida. Ingrese otra.");
                entradaValida = false;
            } else if (equipoRival.contains(jugadoresDelPais.get(opcion - 1))) {
                System.out.println("❌ Jugador ya elegido por el otro jugador.");
                entradaValida = false;
            } else {
                equipoPropio.set(opcion - 1, jugadoresDelPais.get(opcion - 1));
            }

        } while (!entradaValida);

        mostrarEquipo(equipoPropio);
    }

    private int validarEntrada(String mensaje, int min, int max) {
        int entrada;
        while (true) {
            System.out.print(mensaje);
            try {
                entrada = Integer.parseInt(scanner.nextLine().trim());
                if (entrada >= min && entrada <= max) {
                    return entrada;
                }
                System.out.println("❌ Opción fuera de rango. Intente nuevamente.");
            } catch (NumberFormatException e) {
                System.out.println("❌ Entrada no válida. Ingrese un número entre " + min + " y " + max + ".");
            }
        }
    }

    public void mostrarEquipo(List<String> equipo) {
        System.out.print("[");
        for (int i = 0; i < equipo.size(); i++) {
            if (equipo.get(i).equals("0")) {
                System.out.print("- {" + (i + 1) + "} -");
            }else {
                System.out.print("- " + equipo.get(i) + " -");
            }
        }
        System.out.println("]");
        System.out.println();
    }

    public void mostrarEquiposFinales() {
        System.out.println("⚽⚽                        Equipo de " + jugador1 + "                        ⚽⚽");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("                           " + equipo1.get(0));
        System.out.println();
        System.out.println("        " + equipo1.get(1) + "   " + equipo1.get(2) + "   " + equipo1.get(3));
        System.out.println();
        System.out.println(" " + equipo1.get(4) + "   " + equipo1.get(5) + "   " + equipo1.get(6) + "   " + equipo1.get(7));
        System.out.println();
        System.out.println("        " + equipo1.get(8) + "   " + equipo1.get(9) + "   " + equipo1.get(10));
        System.out.println();
        System.out.println("⚽⚽                        Equipo de " + jugador2 + "                        ⚽⚽");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("                           " + equipo2.get(0));
        System.out.println();
        System.out.println("        " + equipo2.get(1) + "   " + equipo2.get(2) + "   " + equipo2.get(3));
        System.out.println();
        System.out.println(" " + equipo2.get(4) + "   " + equipo2.get(5) + "   " + equipo2.get(6) + "   " + equipo2.get(7));
        System.out.println();
        System.out.println("        " + equipo2.get(8) + "   " + equipo2.get(9) + "   " + equipo2.get(10));

    }

    public void votacion() {
        int sumaEquipo1 = 0;
        int sumaEquipo2 = 0;
        int opcionJug1;
        int opcionJug2;

        System.out.println("\n--------------------------------- Inicio de votación --------------------------------");
        for (int i = 0; i < equipo1.size(); i++) {
            System.out.println("1. " + equipo1.get(i) + " vs " + "2. " + equipo2.get(i));

            // Se usa validarEntrada en vez de scanner.nextInt()
            opcionJug1 = validarEntrada(jugador1 + ", elegí el mejor jugador (1 o 2): ", 1, 2);
            opcionJug2 = validarEntrada(jugador2 + ", elegí el mejor jugador (1 o 2): ", 1, 2);

            if (opcionJug1 == opcionJug2) {
                if (opcionJug1 == 1) {
                    sumaEquipo1++;
                } else {
                    sumaEquipo2++;
                }
            } else {
                // Extraemos la media de cada jugador con replaceAll
                int mediaJug1 = Integer.parseInt(equipo1.get(i).replaceAll("[^0-9]", ""));
                int mediaJug2 = Integer.parseInt(equipo2.get(i).replaceAll("[^0-9]", ""));

                if (mediaJug1 > mediaJug2) {
                    sumaEquipo1++;
                } else if (mediaJug1 < mediaJug2) {
                    sumaEquipo2++;
                } else {
                    sumaEquipo1++;
                    sumaEquipo2++;
                }
            }
            System.out.println();
        }

        System.out.println("--------- Puntos obtenidos ---------");
        System.out.println(jugador1 + ": " + sumaEquipo1 + "pts");
        System.out.println(jugador2 + ": " + sumaEquipo2 + "pts");

        if (sumaEquipo1 == sumaEquipo2) {
            System.out.println("Empate");
        } else if (sumaEquipo1 > sumaEquipo2) {
            System.out.println("Ganó " + jugador1);
        } else {
            System.out.println("Ganó " + jugador2);
        }
    }

    private String obtenerJugador() {
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese apellido: ");
        String apellido = scanner.nextLine();
        Random random = new Random();
        int media = 85 + random.nextInt(11); // 11 porque 95 - 85 + 1 = 11
        String datos = String.format("%s %s (%d)", nombre, apellido, media);
        return datos;
    }

}
