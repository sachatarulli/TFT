public class Mediocampista extends Jugador{
    private int pase;
    private int resistencia;
    private int vision;

    public Mediocampista(String nombre, String apellido, String nacionalidad, int pase, int resistencia, int vision) {
        super(nombre, apellido, nacionalidad);
        this.pase = pase;
        this.resistencia = resistencia;
        this.vision = vision;
    }

    public int getPase() {
        return pase;
    }
    public void setPase(int pase) {
        this.pase = pase;
    }
    public int getResistencia() {
        return resistencia;
    }
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
    public int getVision() {
        return vision;
    }
    public void setVision(int vision) {
        this.vision = vision;
    }

    @Override
    public int calcularMedia() {
        return  (int)Math.round((this.resistencia+ this.pase + this.vision)/3.0);
    }
}
