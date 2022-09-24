public class Pasador extends Jugador{
    //Atributos
    private int pases;
    private int fintas;

    //Constructor
    public Pasador() {
        super();
        pases = 0;
        fintas = 0;
    }

    public Pasador(int pases, int fintas, String nombre, String pais, int errores, int aces, int servicios) {
        super(nombre, pais, errores, aces, servicios);
        this.pases = pases;
        this.fintas = fintas;
    }

    
    /** 
     * @return int
     */
    
    /** 
     * @return int
     */
    //Getters & Setters

    
    /** 
     * @param pases
     */
    public int getPases() {
        return this.pases;
    }

    
    /** 
     * @return int
     */
    
    /** 
     * @param pases
     */
    
    /** 
     * @param fintas
     */
    public void setPases(int pases) {
        this.pases = pases;
    }

    
    /** 
     * @return float
     */
    
    /** 
     * @return int
     */
    public int getFintas() {
        return this.fintas;
    }

    
    /** 
     * @param fintas
     */
    
    /** 
     * @return String
     */
    public void setFintas(int fintas) {
        this.fintas = fintas;
    }

    
    /** 
     * @return float
     * Calcula la efectividad de los pasadores
     */
    //Efectividad
    public float pases1(){
        float pases2 = pases + fintas - errores;
        float pases3 = pases2*100;
        float pases4 = pases + fintas + errores;
        float pases5 = pases3/pases4;
        float pases6 = aces*100;
        float pases7 = pases6/servicios;
        float pases8 = pases5+pases7;
        return pases8; 
    }

    
    /** 
     * @return String
     */
    //ToString
    @Override
    public String toString() {
        String resultado = super.toString();
        resultado = resultado + "Pases: " + getPases() + "\n" +
            "Fintas: " + getFintas() + "\n";
        return resultado;
    }
}