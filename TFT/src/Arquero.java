public class Arquero extends Jugador{
    private int reflejos;
    private int agilidad;
    private int juegoAereo;

    public Arquero(String nombre, String apellido, String nacionalidad, int reflejos, int agilidad, int juegoAereo) {
        super(nombre, apellido, nacionalidad);
        this.reflejos = reflejos;
        this.agilidad = agilidad;
        this.juegoAereo = juegoAereo;
    }

    public int getReflejos() {
        return reflejos;
    }

    public void setReflejos(int reflejos) {
        this.reflejos = reflejos;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getJuegoAereo() {
        return juegoAereo;
    }

    public void setJuegoAereo(int juegoAereo) {
        this.juegoAereo = juegoAereo;
    }

    @Override
    public int calcularMedia() {
        return  (int)Math.round((this.agilidad + this.juegoAereo + this.reflejos)/3.0);
    }
}
