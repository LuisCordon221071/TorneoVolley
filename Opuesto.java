public class Opuesto extends Jugador{
    //Atributos
    private int ataques;
    private int bloqueosE;
    private int bloqueosF;

    //Constructor
    public Opuesto() {
        super();
        ataques = 0;
        bloqueosE = 0;
        bloqueosF = 0;
    }

    public Opuesto(int ataques, int bloqueosE, int bloqueosF, String nombre, String pais, int errores, int aces, int servicios) {
        super(nombre, pais, errores, aces, servicios);
        this.ataques = ataques;
        this.bloqueosE = bloqueosE;
        this.bloqueosF = bloqueosF;
    }

    //Getters & Setters

    public int getAtaques() {
        return this.ataques;
    }

    public void setAtaques(int ataques) {
        this.ataques = ataques;
    }

    public int getBloqueosE() {
        return this.bloqueosE;
    }

    public void setBloqueosE(int bloqueosE) {
        this.bloqueosE = bloqueosE;
    }

    public int getBloqueosF() {
        return this.bloqueosF;
    }

    public void setBloqueosF(int bloqueosF) {
        this.bloqueosF = bloqueosF;
    }

    //ToString
    @Override
    public String toString() {
        String resultado = super.toString();
        resultado = resultado + "Ataques: " + getAtaques() + "\n" +
            "Bloqueos efectivos: " + getBloqueosE() + "\n" +
            "Bloqueos fallidos: " + getBloqueosF() + "\n";
        return resultado;
    }
}