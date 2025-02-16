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
        // Pedimos nombres a los usuarios
        System.out.print("Ingrese el nombre del jugador 1: ");
        jugador1 = scanner.nextLine();
        System.out.print("Ingrese el nombre del jugador 2: ");
        jugador2 = scanner.nextLine();

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
        for (int i = 0; i < 11; i++) {// Simulamos 11 giros de ruleta

            String paisSorteado = juego.girarRuleta();  // Pais sorteado
            System.out.println("País seleccionado: " + paisSorteado);

            // Obtenemos jugadores por nacionalidad y lo agregamos a una lista
            List<String> jugadoresDelPais = juego.obtenerJugadoresPorNacionalidad(paisSorteado);
            System.out.println("--------- Lista de jugadores --------- ");

            for (int j = 0; j < jugadoresDelPais.size(); j++) {
                System.out.println(j+1 + ". " + jugadoresDelPais.get(j));
            }
            System.out.println("12. Selección de un jugador particular");
            System.out.println("--------------------------------------");

            // Determinar qué jugador elige
            if (turnoJugador1) {
                do {
                    System.out.print(jugador1 + ", elige un jugador ingresando el número correspondiente: ");
                    opcionUsuario1 = scanner.nextInt();

                    if (opcionUsuario1 == 12) {
                        int posicion;
                        do {
                            System.out.print("Ingrese la posición: ");
                            posicion = scanner.nextInt();
                        } while (!equipo1.get(posicion - 1).equals("0"));
                        scanner.nextLine(); // salto de linea
                        equipo1.set(posicion - 1, obtenerJugador());
                        System.out.println(equipo1);
                        continue;
                    }

                    if (opcionUsuario1 < 1 || opcionUsuario1 > 11) {
                        System.out.println("Opción no válida.");
                    } else if (equipo1.get(opcionUsuario1 - 1).equals("0")) {
                        equipo1.set(opcionUsuario1 - 1, jugadoresDelPais.get(opcionUsuario1 - 1));
                        System.out.println(equipo1);
                    } else {
                        System.out.println("Posición ya elegida. Ingrese otra.");
                        opcionUsuario1 = 0;
                    }
                } while (opcionUsuario1 < 1 || opcionUsuario1 > 12);

                do {
                    System.out.print(jugador2 + ", elige un jugador ingresando el número correspondiente: ");
                    opcionUsuario2 = scanner.nextInt();

                    if (opcionUsuario2 == 12) {
                        int posicion;
                        do {
                            System.out.print("Ingrese la posición: ");
                            posicion = scanner.nextInt();
                        } while (!equipo2.get(posicion - 1).equals("0"));
                        scanner.nextLine(); // salto de linea
                        equipo2.set(posicion - 1, obtenerJugador());
                        System.out.println(equipo2);
                        continue;
                    }

                    if (opcionUsuario2 < 1 || opcionUsuario2 > 11) {
                        System.out.println("Opcion no válida.");
                    } else if (opcionUsuario1 == opcionUsuario2) {
                        System.out.println("Jugador ya elegido por " + jugador1);
                    } else {
                        if (equipo2.get(opcionUsuario2 - 1).equals("0")) {
                            equipo2.set(opcionUsuario2 - 1, jugadoresDelPais.get(opcionUsuario2 - 1));
                            System.out.println(equipo2);
                        } else {
                            System.out.println("Posición ya elegida.");
                            opcionUsuario2 = 0;
                        }
                    }
                } while (opcionUsuario1 == opcionUsuario2 || opcionUsuario2 < 1 || opcionUsuario2 > 12);
            } else {
                do {
                    System.out.print(jugador2 + ", elige un jugador ingresando el número correspondiente: ");
                    opcionUsuario2 = scanner.nextInt();

                    if (opcionUsuario2 == 12) {
                        int posicion;
                        do {
                            System.out.print("Ingrese la posición: ");
                            posicion = scanner.nextInt();
                        } while (!equipo2.get(posicion - 1).equals("0"));
                        scanner.nextLine(); // salto de linea
                        equipo2.set(posicion - 1, obtenerJugador());
                        System.out.println(equipo2);
                        continue;
                    }

                    if (opcionUsuario2 < 1 || opcionUsuario2 > 11) {
                        System.out.println("Opción no válida.");
                    } else if (equipo2.get(opcionUsuario2 - 1).equals("0")) {
                        equipo2.set(opcionUsuario2 - 1, jugadoresDelPais.get(opcionUsuario2 - 1));
                        System.out.println(equipo2);
                    } else {
                        System.out.println("Posición ya elegida. Ingrese otra.");
                        opcionUsuario2 = 0;
                    }
                } while (opcionUsuario2 < 1 || opcionUsuario2 > 12);

                do {
                    System.out.print(jugador1 + ", elige un jugador ingresando el número correspondiente: ");
                    opcionUsuario1 = scanner.nextInt();

                    if (opcionUsuario1 == 12) {
                        int posicion;
                        do {
                            System.out.print("Ingrese la posición: ");
                            posicion = scanner.nextInt();
                        } while (!equipo1.get(posicion - 1).equals("0"));
                        scanner.nextLine(); // salto de linea
                        equipo1.set(posicion - 1, obtenerJugador());
                        System.out.println(equipo1);
                        continue;
                    }

                    if (opcionUsuario1 < 1 || opcionUsuario1 > 11) {
                        System.out.println("Opcion no válida.");
                    } else if (opcionUsuario1 == opcionUsuario2) {
                        System.out.println("Jugador ya elegido por " + jugador2);
                    } else {
                        if (equipo1.get(opcionUsuario1 - 1).equals("0")) {
                            equipo1.set(opcionUsuario1 - 1, jugadoresDelPais.get(opcionUsuario1 - 1));
                            System.out.println(equipo1);
                        } else {
                            System.out.println("Posición ya elegida.");
                            opcionUsuario1 = 0;
                        }
                    }
                } while (opcionUsuario2 == opcionUsuario1 || opcionUsuario1 < 1 || opcionUsuario1 > 12);
            }

            turnoJugador1 = !turnoJugador1;
            System.out.println("-------------------------------------------------------------------------");
        }
    }

    public void votacion() {
        int sumaEquipo1 = 0;
        int sumaEquipo2 = 0;
        int opcionJug1;
        int opcionJug2;

        System.out.println("\n------- Inicio de votación -------");
        for (int i = 0; i < equipo1.size(); i++) {
            System.out.println("1." + equipo1.get(i) + " vs " + "2." + equipo2.get(i));
            opcionJug1 = obtenerOpcionValida(jugador1);
            opcionJug2 = obtenerOpcionValida(jugador2);

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

    private int obtenerOpcionValida(String jugador) {
        while (true) {
            try {
                System.out.print(jugador + ", elige qué jugador es mejor (1 o 2): ");
                int opcion = Integer.parseInt(scanner.nextLine().trim());

                if (opcion == 1 || opcion == 2) {
                    return opcion;
                } else {
                    System.out.println("Entrada inválida. Debes ingresar 1 o 2.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Debes ingresar un número.");
            }
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
