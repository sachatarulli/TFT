import java.util.ArrayList;
import java.util.List;

public class Plantilla {
    private List<Jugador> jugadores;


    public Plantilla(List<Jugador> jugadores) {
        this.jugadores = new ArrayList<>(jugadores);
    }

    public Plantilla() {
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }


    public void agregarJugadores() {
        /*
        Se instancian jugadores de tipo Jugador pero son de Arquero, Defensor, etc. debido al polimorfismo.
         */
        // Arquero
        Jugador arqueroArg1 = new Arquero("Pato", "Fillol", "Argentina", 90, 90, 90);
        this.jugadores.add(arqueroArg1);
        // Defensores
        Jugador defensorArg1 = new Defensor("Ratón", "Ayala", "Argentina", 90, 90, 90);
        this.jugadores.add(defensorArg1);

        Jugador defensorArg2 = new Defensor("Pupi", "Zanetti", "Argentina", 90, 90, 90);
        this.jugadores.add(defensorArg2);

        Jugador defensorArg3 = new Defensor("Daniel", "Passarella", "Argentina", 90, 90, 90);
        this.jugadores.add(defensorArg3);

        // Mediocampistas
        Jugador mediocampistaArg1 = new Mediocampista("Fernando", "Redondo", "Argentina", 90, 90, 90);
        this.jugadores.add(mediocampistaArg1);

        Jugador mediocampistaArg2 = new Mediocampista("Diego", "Maradona", "Argentina", 99, 99, 99);
        this.jugadores.add(mediocampistaArg2);

        Jugador mediocampistaArg3 = new Mediocampista("Juan Román", "Riquelme", "Argentina", 90, 90, 90);
        this.jugadores.add(mediocampistaArg3);

        Jugador mediocampistaArg4 = new Mediocampista("Javier", "Mascherano", "Argentina", 90, 90, 90);
        this.jugadores.add(mediocampistaArg4);

        // Delanteros
        Jugador delanteroArg1 = new Delantero("Gabriel", "Batistuta", "Argentina", 95, 95, 95);
        this.jugadores.add(delanteroArg1);

        Jugador delanteroArg2 = new Delantero("Lionel", "Messi", "Argentina", 99, 99, 99);
        this.jugadores.add(delanteroArg2);

        Jugador delanteroArg3 = new Delantero("Mario", "Kempes", "Argentina", 90, 90, 90);
        this.jugadores.add(delanteroArg3);

        // Arquero
        Jugador arqueroBra = new Arquero("Claudio", "Taffarel", "Brasil", 90, 90, 90);
        this.jugadores.add(arqueroBra);

        // Defensores
        Jugador defensorBra1 = new Defensor("Cafu", "Marcos", "Brasil", 90, 90, 90);
        this.jugadores.add(defensorBra1);

        Jugador defensorBra2 = new Defensor("Roberto", "Carlos", "Brasil", 95, 95, 95);
        this.jugadores.add(defensorBra2);

        Jugador defensorBra3 = new Defensor("Lucio", "Ferreira", "Brasil", 90, 90, 90);
        this.jugadores.add(defensorBra3);

        // Mediocampistas
        Jugador mediocampistaBra1 = new Mediocampista("Dunga", "Carlos", "Brasil", 90, 90, 90);
        this.jugadores.add(mediocampistaBra1);

        Jugador mediocampistaBra2 = new Mediocampista("Zico", "Arthur", "Brasil", 95, 95, 95);
        this.jugadores.add(mediocampistaBra2);

        Jugador mediocampistaBra3 = new Mediocampista("Rivaldo", "Vitor", "Brasil", 90, 90, 90);
        this.jugadores.add(mediocampistaBra3);

        Jugador mediocampistaBra4 = new Mediocampista("Kaká", "Ricardo", "Brasil", 90, 90, 90);
        this.jugadores.add(mediocampistaBra4);

        // Delanteros
        Jugador delanteroBra1 = new Delantero("Pelé", "Edson", "Brasil", 99, 99, 99);
        this.jugadores.add(delanteroBra1);

        Jugador delanteroBra2 = new Delantero("Ronaldo", "Nazário", "Brasil", 99, 99, 99);
        this.jugadores.add(delanteroBra2);

        Jugador delanteroBra3 = new Delantero("Romário", "de Souza", "Brasil", 95, 95, 95);
        this.jugadores.add(delanteroBra3);

        // Arquero
        Jugador arqueroAle = new Arquero("Manuel", "Neuer", "Alemania", 95, 95, 95);
        this.jugadores.add(arqueroAle);

        // Defensores
        Jugador defensorAle1 = new Defensor("Franz", "Beckenbauer", "Alemania", 99, 99, 99);
        this.jugadores.add(defensorAle1);

        Jugador defensorAle2 = new Defensor("Philipp", "Lahm", "Alemania", 90, 90, 90);
        this.jugadores.add(defensorAle2);

        Jugador defensorAle3 = new Defensor("Berti", "Vogts", "Alemania", 90, 90, 90);
        this.jugadores.add(defensorAle3);

        // Mediocampistas
        Jugador mediocampistaAle1 = new Mediocampista("Lothar", "Matthäus", "Alemania", 95, 95, 95);
        this.jugadores.add(mediocampistaAle1);

        Jugador mediocampistaAle2 = new Mediocampista("Michael", "Ballack", "Alemania", 90, 90, 90);
        this.jugadores.add(mediocampistaAle2);

        Jugador mediocampistaAle3 = new Mediocampista("Toni", "Kroos", "Alemania", 90, 90, 90);
        this.jugadores.add(mediocampistaAle3);

        Jugador mediocampistaAle4 = new Mediocampista("Bastian", "Schweinsteiger", "Alemania", 90, 90, 90);
        this.jugadores.add(mediocampistaAle4);

        // Delanteros
        Jugador delanteroAle1 = new Delantero("Gerd", "Müller", "Alemania", 99, 99, 99);
        this.jugadores.add(delanteroAle1);

        Jugador delanteroAle2 = new Delantero("Miroslav", "Klose", "Alemania", 95, 95, 95);
        this.jugadores.add(delanteroAle2);

        Jugador delanteroAle3 = new Delantero("Rudi", "Völler", "Alemania", 90, 90, 90);
        this.jugadores.add(delanteroAle3);

        // Arquero
        Jugador arqueroIta = new Arquero("Gianluigi", "Buffon", "Italia", 95, 95, 95);
        this.jugadores.add(arqueroIta);

        // Defensores
        Jugador defensorIta1 = new Defensor("Paolo", "Maldini", "Italia", 99, 99, 99);
        this.jugadores.add(defensorIta1);

        Jugador defensorIta2 = new Defensor("Franco", "Baresi", "Italia", 95, 95, 95);
        this.jugadores.add(defensorIta2);

        Jugador defensorIta3 = new Defensor("Fabio", "Cannavaro", "Italia", 95, 95, 95);
        this.jugadores.add(defensorIta3);

        // Mediocampistas
        Jugador mediocampistaIta1 = new Mediocampista("Andrea", "Pirlo", "Italia", 95, 95, 95);
        this.jugadores.add(mediocampistaIta1);

        Jugador mediocampistaIta2 = new Mediocampista("Daniele", "De Rossi", "Italia", 90, 90, 90);
        this.jugadores.add(mediocampistaIta2);

        Jugador mediocampistaIta3 = new Mediocampista("Gennaro", "Gattuso", "Italia", 90, 90, 90);
        this.jugadores.add(mediocampistaIta3);

        Jugador mediocampistaIta4 = new Mediocampista("Roberto", "Baggio", "Italia", 99, 99, 99);
        this.jugadores.add(mediocampistaIta4);

        // Delanteros
        Jugador delanteroIta1 = new Delantero("Alessandro", "Del Piero", "Italia", 95, 95, 95);
        this.jugadores.add(delanteroIta1);

        Jugador delanteroIta2 = new Delantero("Francesco", "Totti", "Italia", 95, 95, 95);
        this.jugadores.add(delanteroIta2);

        Jugador delanteroIta3 = new Delantero("Christian", "Vieri", "Italia", 90, 90, 90);
        this.jugadores.add(delanteroIta3);

        // Arquero
        Jugador arqueroFra = new Arquero("Fabien", "Barthez", "Francia", 90, 90, 90);
        this.jugadores.add(arqueroFra);

        // Defensores
        Jugador defensorFra1 = new Defensor("Laurent", "Blanc", "Francia", 95, 95, 95);
        this.jugadores.add(defensorFra1);

        Jugador defensorFra2 = new Defensor("Lilian", "Thuram", "Francia", 95, 95, 95);
        this.jugadores.add(defensorFra2);

        Jugador defensorFra3 = new Defensor("Marcel", "Desailly", "Francia", 95, 95, 95);
        this.jugadores.add(defensorFra3);

        // Mediocampistas
        Jugador mediocampistaFra1 = new Mediocampista("Patrick", "Vieira", "Francia", 95, 95, 95);
        this.jugadores.add(mediocampistaFra1);

        Jugador mediocampistaFra2 = new Mediocampista("Michel", "Platini", "Francia", 99, 99, 99);
        this.jugadores.add(mediocampistaFra2);

        Jugador mediocampistaFra3 = new Mediocampista("Zinedine", "Zidane", "Francia", 99, 99, 99);
        this.jugadores.add(mediocampistaFra3);

        Jugador mediocampistaFra4 = new Mediocampista("Didier", "Deschamps", "Francia", 90, 90, 90);
        this.jugadores.add(mediocampistaFra4);

        // Delanteros
        Jugador delanteroFra1 = new Delantero("Thierry", "Henry", "Francia", 99, 99, 99);
        this.jugadores.add(delanteroFra1);

        Jugador delanteroFra2 = new Delantero("Just", "Fontaine", "Francia", 99, 99, 99);
        this.jugadores.add(delanteroFra2);

        Jugador delanteroFra3 = new Delantero("Kylian", "Mbappé", "Francia", 99, 99, 99);
        this.jugadores.add(delanteroFra3);

        // Arquero
        Jugador arqueroIng = new Arquero("Gordon", "Banks", "Inglaterra", 95, 95, 95);
        this.jugadores.add(arqueroIng);

        // Defensores
        Jugador defensorIng1 = new Defensor("Bobby", "Moore", "Inglaterra", 99, 99, 99);
        this.jugadores.add(defensorIng1);

        Jugador defensorIng2 = new Defensor("John", "Terry", "Inglaterra", 95, 95, 95);
        this.jugadores.add(defensorIng2);

        Jugador defensorIng3 = new Defensor("Rio", "Ferdinand", "Inglaterra", 95, 95, 95);
        this.jugadores.add(defensorIng3);

        // Mediocampistas
        Jugador mediocampistaIng1 = new Mediocampista("Frank", "Lampard", "Inglaterra", 95, 95, 95);
        this.jugadores.add(mediocampistaIng1);

        Jugador mediocampistaIng2 = new Mediocampista("Steven", "Gerrard", "Inglaterra", 95, 95, 95);
        this.jugadores.add(mediocampistaIng2);

        Jugador mediocampistaIng3 = new Mediocampista("David", "Beckham", "Inglaterra", 95, 95, 95);
        this.jugadores.add(mediocampistaIng3);

        Jugador mediocampistaIng4 = new Mediocampista("Paul", "Scholes", "Inglaterra", 90, 90, 90);
        this.jugadores.add(mediocampistaIng4);

        // Delanteros
        Jugador delanteroIng1 = new Delantero("Wayne", "Rooney", "Inglaterra", 95, 95, 95);
        this.jugadores.add(delanteroIng1);

        Jugador delanteroIng2 = new Delantero("Alan", "Shearer", "Inglaterra", 95, 95, 95);
        this.jugadores.add(delanteroIng2);

        Jugador delanteroIng3 = new Delantero("Harry", "Kane", "Inglaterra", 95, 95, 95);
        this.jugadores.add(delanteroIng3);

        // Arquero
        Jugador arqueroUru = new Arquero("Fernando", "Muslera", "Uruguay", 90, 90, 90);
        this.jugadores.add(arqueroUru);

        // Defensores
        Jugador defensorUru1 = new Defensor("José", "Nasazzi", "Uruguay", 99, 99, 99);
        this.jugadores.add(defensorUru1);

        Jugador defensorUru2 = new Defensor("Diego", "Lugano", "Uruguay", 95, 95, 95);
        this.jugadores.add(defensorUru2);

        Jugador defensorUru3 = new Defensor("Paolo", "Montero", "Uruguay", 95, 95, 95);
        this.jugadores.add(defensorUru3);

        // Mediocampistas
        Jugador mediocampistaUru1 = new Mediocampista("Obdulio", "Varela", "Uruguay", 99, 99, 99);
        this.jugadores.add(mediocampistaUru1);

        Jugador mediocampistaUru2 = new Mediocampista("Diego", "Forlán", "Uruguay", 99, 99, 99);
        this.jugadores.add(mediocampistaUru2);

        Jugador mediocampistaUru3 = new Mediocampista("Enzo", "Francescoli", "Uruguay", 99, 99, 99);
        this.jugadores.add(mediocampistaUru3);

        Jugador mediocampistaUru4 = new Mediocampista("Egidio", "Arévalo Ríos", "Uruguay", 90, 90, 90);
        this.jugadores.add(mediocampistaUru4);

        // Delanteros
        Jugador delanteroUru1 = new Delantero("Luis", "Suárez", "Uruguay", 99, 99, 99);
        this.jugadores.add(delanteroUru1);

        Jugador delanteroUru2 = new Delantero("Edinson", "Cavani", "Uruguay", 95, 95, 95);
        this.jugadores.add(delanteroUru2);

        Jugador delanteroUru3 = new Delantero("Héctor", "Scarone", "Uruguay", 95, 95, 95);
        this.jugadores.add(delanteroUru3);

        // Arquero
        Jugador arqueroPor = new Arquero("Vítor", "Baía", "Portugal", 90, 90, 90);
        this.jugadores.add(arqueroPor);

        // Defensores
        Jugador defensorPor1 = new Defensor("Ricardo", "Carvalho", "Portugal", 95, 95, 95);
        this.jugadores.add(defensorPor1);

        Jugador defensorPor2 = new Defensor("Pepe", "Ferreira", "Portugal", 95, 95, 95);
        this.jugadores.add(defensorPor2);

        Jugador defensorPor3 = new Defensor("Fernando", "Couto", "Portugal", 95, 95, 95);
        this.jugadores.add(defensorPor3);

        // Mediocampistas
        Jugador mediocampistaPor1 = new Mediocampista("Deco", "De Souza","Portugal", 95, 95, 95);
        this.jugadores.add(mediocampistaPor1);

        Jugador mediocampistaPor2 = new Mediocampista("Rui", "Costa", "Portugal", 95, 95, 95);
        this.jugadores.add(mediocampistaPor2);

        Jugador mediocampistaPor3 = new Mediocampista("Bruno", "Fernandes", "Portugal", 95, 95, 95);
        this.jugadores.add(mediocampistaPor3);

        Jugador mediocampistaPor4 = new Mediocampista("João", "Moutinho", "Portugal", 90, 90, 90);
        this.jugadores.add(mediocampistaPor4);

        // Delanteros
        Jugador delanteroPor1 = new Delantero("Cristiano", "Ronaldo", "Portugal", 99, 99, 99);
        this.jugadores.add(delanteroPor1);

        Jugador delanteroPor2 = new Delantero("Eusébio", "Da Silva","Portugal", 99, 99, 99);
        this.jugadores.add(delanteroPor2);

        Jugador delanteroPor3 = new Delantero("Luís", "Figo", "Portugal", 99, 99, 99);
        this.jugadores.add(delanteroPor3);

        // Arquero
        Jugador arqueroEsp = new Arquero("Iker", "Casillas", "España", 99, 99, 99);
        this.jugadores.add(arqueroEsp);

        // Defensores
        Jugador defensorEsp1 = new Defensor("Carles", "Puyol", "España", 99, 99, 99);
        this.jugadores.add(defensorEsp1);

        Jugador defensorEsp2 = new Defensor("Sergio", "Ramos", "España", 95, 95, 95);
        this.jugadores.add(defensorEsp2);

        Jugador defensorEsp3 = new Defensor("Fernando", "Hierro", "España", 95, 95, 95);
        this.jugadores.add(defensorEsp3);

        // Mediocampistas
        Jugador mediocampistaEsp1 = new Mediocampista("Andrés", "Iniesta", "España", 99, 99, 99);
        this.jugadores.add(mediocampistaEsp1);

        Jugador mediocampistaEsp2 = new Mediocampista("Xavi", "Hernández", "España", 99, 99, 99);
        this.jugadores.add(mediocampistaEsp2);

        Jugador mediocampistaEsp3 = new Mediocampista("David", "Silva", "España", 95, 95, 95);
        this.jugadores.add(mediocampistaEsp3);

        Jugador mediocampistaEsp4 = new Mediocampista("Sergio", "Busquets", "España", 95, 95, 95);
        this.jugadores.add(mediocampistaEsp4);

        // Delanteros
        Jugador delanteroEsp1 = new Delantero("Raúl", "González", "España", 99, 99, 99);
        this.jugadores.add(delanteroEsp1);

        Jugador delanteroEsp2 = new Delantero("David", "Villa", "España", 99, 99, 99);
        this.jugadores.add(delanteroEsp2);

        Jugador delanteroEsp3 = new Delantero("Fernando", "Torres", "España", 95, 95, 95);
        this.jugadores.add(delanteroEsp3);

        // Arquero
        Jugador arqueroHol = new Arquero("Edwin", "van der Sar", "Holanda", 99, 99, 99);
        this.jugadores.add(arqueroHol);

        // Defensores
        Jugador defensorHol1 = new Defensor("Ronald", "Koeman", "Holanda", 99, 99, 99);
        this.jugadores.add(defensorHol1);

        Jugador defensorHol2 = new Defensor("Jaap", "Stam", "Holanda", 95, 95, 95);
        this.jugadores.add(defensorHol2);

        Jugador defensorHol3 = new Defensor("Frank", "de Boer", "Holanda", 95, 95, 95);
        this.jugadores.add(defensorHol3);

        // Mediocampistas
        Jugador mediocampistaHol1 = new Mediocampista("Johan", "Cruyff", "Holanda", 99, 99, 99);
        this.jugadores.add(mediocampistaHol1);

        Jugador mediocampistaHol2 = new Mediocampista("Ruud", "Gullit", "Holanda", 99, 99, 99);
        this.jugadores.add(mediocampistaHol2);

        Jugador mediocampistaHol3 = new Mediocampista("Frank", "Rijkaard", "Holanda", 95, 95, 95);
        this.jugadores.add(mediocampistaHol3);

        Jugador mediocampistaHol4 = new Mediocampista("Clarence", "Seedorf", "Holanda", 95, 95, 95);
        this.jugadores.add(mediocampistaHol4);

        // Delanteros
        Jugador delanteroHol1 = new Delantero("Marco", "van Basten", "Holanda", 99, 99, 99);
        this.jugadores.add(delanteroHol1);

        Jugador delanteroHol2 = new Delantero("Dennis", "Bergkamp", "Holanda", 99, 99, 99);
        this.jugadores.add(delanteroHol2);

        Jugador delanteroHol3 = new Delantero("Arjen", "Robben", "Holanda", 95, 95, 95);
        this.jugadores.add(delanteroHol3);

        // Arquero
        Jugador arqueroMundo = new Arquero("Lev", "Yashin", "Resto del mundo", 99, 99, 99);
        this.jugadores.add(arqueroMundo);

        // Defensores
        Jugador defensorMundo1 = new Defensor("Nemanja", "Vidić", "Serbia", 95, 95, 95);
        this.jugadores.add(defensorMundo1);

        Jugador defensorMundo2 = new Defensor("Gheorghe", "Popescu", "Rumania", 95, 95, 95);
        this.jugadores.add(defensorMundo2);

        Jugador defensorMundo3 = new Defensor("Héctor", "Chumpitaz", "Perú", 95, 95, 95);
        this.jugadores.add(defensorMundo3);

        // Mediocampistas
        Jugador mediocampistaMundo1 = new Mediocampista("George", "Best", "Irlanda del Norte", 99, 99, 99);
        this.jugadores.add(mediocampistaMundo1);

        Jugador mediocampistaMundo2 = new Mediocampista("Hidetoshi", "Nakata", "Japón", 95, 95, 95);
        this.jugadores.add(mediocampistaMundo2);

        Jugador mediocampistaMundo3 = new Mediocampista("Abedi", "Pelé", "Ghana", 95, 95, 95);
        this.jugadores.add(mediocampistaMundo3);

        Jugador mediocampistaMundo4 = new Mediocampista("Pavel", "Nedvěd", "República Checa", 99, 99, 99);
        this.jugadores.add(mediocampistaMundo4);

        // Delanteros
        Jugador delanteroMundo1 = new Delantero("Zlatan", "Ibrahimović", "Suecia", 99, 99, 99);
        this.jugadores.add(delanteroMundo1);

        Jugador delanteroMundo2 = new Delantero("Ferenc", "Puskás", "Hungría", 99, 99, 99);
        this.jugadores.add(delanteroMundo2);

        Jugador delanteroMundo3 = new Delantero("Samuel", "Eto'o", "Camerún", 99, 99, 99);
        this.jugadores.add(delanteroMundo3);

    }
}
