public class Defensor extends Jugador{
    private int marca;
    private int barrida;
    private int fuerza;


    public Defensor(String nombre, String apellido, String nacionalidad, int marca, int barrida, int fuerza) {
        super(nombre, apellido, nacionalidad);
        this.marca = marca;
        this.barrida = barrida;
        this.fuerza = fuerza;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getBarrida() {
        return barrida;
    }

    public void setBarrida(int barrida) {
        this.barrida = barrida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public int calcularMedia() {
        return  (int)Math.round((this.barrida+ this.fuerza + this.marca)/3.0);

    }
}
