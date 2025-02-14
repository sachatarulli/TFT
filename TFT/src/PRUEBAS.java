import java.util.Scanner;

public class PRUEBAS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JuegoService juego = new JuegoService();

        for (int i = 0; i < 10; i++) { // Simulamos 10 giros de ruleta
            System.out.println("País seleccionado: " + juego.girarRuleta());
            System.out.println("Jugador1 elige: ");
            String jugador1 = scanner.nextLine();
            System.out.println("Jugador2 elige: ");
            String jugador2 = scanner.nextLine();
            System.out.println("-----------------------");
        }
    }
}
