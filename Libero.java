public class Libero extends Jugador{
    //Atributo
    private int recibos;
    
    //Constructor
    public Libero() {
        super();
        recibos = 0;
    }

    public Libero(int recibos, String nombre, String pais, int errores, int aces, int servicios) {
        super(nombre, pais, errores, aces, servicios);
        this.recibos = recibos;
    }

    
    /** 
     * @return int
     */
    //Getters & Setters

    public int getRecibos() {
        return this.recibos;
    }

    
    /** 
     * @param recibos
     */
    public void setRecibos(int recibos) {
        this.recibos = recibos;
    }

    
    /** 
     * @return float
     * Calcula la efectividad de los líberos
     */
    //Mejores Líberos
    public float mejor1(){
        float mejor2 = recibos - errores;
        float mejor3 = mejor2*100;
        float mejor4 = recibos + errores;
        float mejor5 = mejor3/mejor4;
        float mejor6 = aces*100;
        float mejor7 = mejor6/servicios;
        float mejor8 = mejor5+mejor7;
        return mejor8;
    }

    
    /** 
     * @return String
     */
    //ToString
    @Override
    public String toString() {
        String resultado = super.toString();
        resultado = resultado + "Recibos: " + getRecibos() + "\n";
        return resultado;
    }
}