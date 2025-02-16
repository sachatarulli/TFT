import java.util.Scanner;

import java.util.Scanner;

public class PRUEBAS {

    public static void main(String[] args) {
        PRUEBAS.menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        boolean entradaValida;

        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("⚽ ⚽                      Fútbol Ruleta: ¡Armá tu Dream Team!                ⚽ ⚽");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("                                      1. Jugar ⚽                                   ");
        System.out.println("                            2. Información del proyecto ⚽                          ");
        System.out.println("                                      3. Salir  ⚽                                  ");
        System.out.println("------------------------------------------------------------------------------------");

        do {
            entradaValida = false;
            System.out.print("⚽ Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine().trim());
                if (opcion >= 1 && opcion <= 3) {
                    entradaValida = true;
                } else {
                    System.out.println("❌ Por favor, ingrese un número entre 1 y 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("❌ Entrada no válida. Por favor, ingrese un número válido.");
            }
        } while (!entradaValida);

        switch (opcion) {
            case 1:
                Juego juego = new Juego(true);
                juego.jugar();
                juego.mostrarEquiposFinales();
                juego.votacion();
                break;
            case 2:
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("⚽⚽                         ¡Bienvenido al Futbol Ruleta!                      ⚽⚽");
                System.out.println("------------------------------------------------------------------------------------");
                System.out.println("      Acá vas a armar tu Dream Team, con los mejores jugadores de la historia.      ");
                System.out.println("Pero ojo, no es solo elegir cracks... ¡También vas a tener que demostrar estrategia!");
                System.out.println("              Te vas a enfrentar a otro jugador y solo uno va a ganar.              ");
                System.out.println("     ¿Estás listo para armar un equipazo y ver si sos el que más sabe de fútbol?    ");
                System.out.println("                                    ⚽¡A jugar!⚽                                   ");
                System.out.println("------------------------------------------------------------------------------------");
                menu();
                break;
            case 3:
                System.out.println("⚽ Fin del juego ⚽");
                break;
        }
    }
}



