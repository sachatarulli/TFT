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
/*
se piden los nombres, se sortea el jugador que comienza primero a elegir, y se instancia
juegoservice
 */
    public void jugar() {
        pedirNombres();
        sortearTurno();
        JuegoService juegoService = new JuegoService();
/*
se gira la ruleta 11 veces para ir obteniendo en cada turno la nacionalidad de los jugadores
con la nacionalidad filtramos de la lista de jugadores los que coincidan con la misma
 */
        for (int i = 0; i < 11; i++) {
            String paisSorteado = juegoService.girarRuleta();
            List<String> jugadoresDelPais = juegoService.obtenerJugadoresPorNacionalidad(paisSorteado);

            System.out.println("País seleccionado: " + paisSorteado);
            mostrarJugadores(jugadoresDelPais);
//usamos el metodo seleccionar jugador
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
/*
se les pide a los jugadores los nombres
 */
    private void pedirNombres() {
        System.out.print("Ingrese el nombre del jugador 1: ");
        jugador1 = scanner.nextLine();
        System.out.print("Ingrese el nombre del jugador 2: ");
        jugador2 = scanner.nextLine();
    }
/*
se sortea el turno con un random para ver quien arranca a elegir primero
 */
    private void sortearTurno() {
        Random random = new Random();
        int sorteo = random.nextInt(2);
        if (sorteo == 0) {
            turnoJugador1 = true;
        } else {
            turnoJugador1 = false;
        }
    }
/*
se muestran los jugadores disponibles para elegir + la opcion 12 de agregar un jugador
propio que no este en la lista
 */
    private void mostrarJugadores(List<String> jugadores) {
        System.out.println("⚽⚽     Lista de jugadores    ⚽⚽");
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println((i + 1) + ". " + jugadores.get(i));
        }
        System.out.println("12. Selección de un jugador particular");
        System.out.println("--------------------------------------");
    }
/*
se validan que las opciones elegidas sean correctas
se valida que los 2 jugadores no puedan elegir el mismo jugador
se valida que el jugador elegido tenga lugar en la alineacion , es decir que no este ocupada
la posicion.

 */
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
/*
se verifica que la entrada por teclado sea un numero valido dependiendo del caso,
por eso utilizamos de patametros min y max
 */
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
/*
impresion por pantalla del equipo elegido parcial y las posiciones que faltan elegir
 */
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
/*
Impresion por pantalla del equipo en formato "Plantilla"
 */
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
/*
votacion entre ambos jugadores para ver quien gana el juego
se elige jugador por jugador en un versus entre mismas posiciones
se va sumando en un contador cada vez que ambos votos coinciden,
si no coindicen se comparan las medias y ahi se determina el ganador del punto
al finalizar el que mas puntos tenga gana el juego
 */
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
/*
Ingresar un nuevo jugador por teclado con una media aleatoria entre 85 y 95
 */
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
