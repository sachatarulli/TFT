public class Delantero extends Jugador {
    private int definicion;
    private int regate;
    private int velocidad;

    public Delantero(String nombre, String apellido, String nacionalidad, int definicion, int regate, int velocidad) {
        super(nombre, apellido, nacionalidad);
        this.definicion = definicion;
        this.regate = regate;
        this.velocidad = velocidad;
    }

    public int getDefinicion() {
        return definicion;
    }

    public void setDefinicion(int definicion) {
        this.definicion = definicion;
    }

    public int getRegate() {
        return regate;
    }

    public void setRegate(int regate) {
        this.regate = regate;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public int calcularMedia() {
        int media = (int)Math.round((this.definicion+ this.regate + this.velocidad)/3.0);
        return super.calcularMedia();
    }
}
