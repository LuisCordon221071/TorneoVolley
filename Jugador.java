public class Jugador{
    //Atributos
    protected String nombre;
    protected String pais;
    protected int errores;
    protected int aces;
    protected int servicios;

    //Constructor
    public Jugador() {
        nombre = "";
        pais = "";
        errores = 0;
        aces = 0;
        servicios = 0;
    }

    public Jugador(String nombre, String pais, int errores, int aces, int servicios) {
        this.nombre = nombre;
        this.pais = pais;
        this.errores = errores;
        this.aces = aces;
        this.servicios = servicios;
    }

    
    /** 
     * @return String
     */
    //Getters & Setters

    public String getNombre() {
        return this.nombre;
    }

    
    /** 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /** 
     * @return String
     */
    public String getPais() {
        return this.pais;
    }

    
    /** 
     * @param pais
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    
    /** 
     * @return int
     */
    public int getErrores() {
        return this.errores;
    }

    
    /** 
     * @param errores
     */
    public void setErrores(int errores) {
        this.errores = errores;
    }

    
    /** 
     * @return int
     */
    public int getAces() {
        return this.aces;
    }

    
    /** 
     * @param aces
     */
    public void setAces(int aces) {
        this.aces = aces;
    }

    
    /** 
     * @return int
     */
    public int getServicios() {
        return this.servicios;
    }

    
    /** 
     * @param servicios
     */
    public void setServicios(int servicios) {
        this.servicios = servicios;
    }

    
    /** 
     * @return String
     */
    //ToString
    @Override
    public String toString() {
        return
            "Nombre: " + getNombre() + "\n" +
            "País: " + getPais() + "\n" +
            "Errores: " + getErrores() + "\n" +
            "Aces: " + getAces() + "\n" +
            "Servicios: " + getServicios() + "\n";
    }
}