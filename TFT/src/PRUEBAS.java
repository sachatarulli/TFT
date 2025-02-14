import java.util.Scanner;

public class PRUEBAS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Plantilla plantilla = new Plantilla();
        plantilla.agregarJugadores();

        Juego juego = new Juego(true);
        juego.jugar();
    }
}
