import java.util.ArrayList;
public class TorneoV{
    //Atributos
    private ArrayList<Libero> listaLiberos;
    private ArrayList<Opuesto> listaOpuestos;
    private ArrayList<Pasador> listaPasadores;

    //Constructor
    public TorneoV() {
        listaLiberos = new ArrayList<Libero>();
        listaOpuestos = new ArrayList<Opuesto>();
        listaPasadores = new ArrayList<Pasador>();
    }

    /** 
     * @param tipo
     * @param recibos
     * @param ataques
     * @param bloqueosE
     * @param bloqueosF
     * @param pases
     * @param fintas
     * @param nombre
     * @param pais
     * @param errores
     * @param aces
     * @param servicios
     */
    public void agregarJugador(int tipo, int recibos,int ataques, int bloqueosE, int bloqueosF, int pases, int fintas, String nombre, String pais, int errores, int aces, int servicios){
        switch (tipo){
            //Libero
            case 0:{ 
                Libero jugLibero = new Libero(recibos, nombre, pais, errores, aces, servicios);
                listaLiberos.add(jugLibero);
                break;
            }
            //Opuesto/Auxiliar
            case 1:{
                Opuesto jugOpuesto = new Opuesto(ataques, bloqueosE, bloqueosF, nombre, pais, errores, aces, servicios);
                listaOpuestos.add(jugOpuesto);
                break;
            }
            //Pasador
            case 2:{
                Pasador jugPasador = new Pasador(pases, fintas, nombre, pais, errores, aces, servicios);
                listaPasadores.add(jugPasador);
                break;
            }
        }
    }

    
    /** 
     * @return String
     */
    public String pasadoresBuenos(){
        String resultado = "";
        resultado = "\n----------\n";
        for (Pasador jugPasador : listaPasadores){
            if(jugPasador.pases1()>80){
                resultado = resultado + jugPasador.toString() + "\n";
            } 
        }
        return resultado;
    }

    
    /** 
     * @return String
     * Muestra los mejores líberos en el torneo
     */
    public String mejoresLiberos(){
        String resultado = "";
        resultado = "\n----------\n";
        for (Libero jugLibero : listaLiberos){
            resultado = resultado + jugLibero.toString() + "\n";
        }
        return resultado;
    }

    
    /** 
     * @return String
     * Muestra los jugadores inscritos en el torneo
     */
    public String obtenerJugadores(){
        String resultado = "";
        resultado = "LÍBEROS\n---------------\n";
        for (Libero jugLibero : listaLiberos){
            resultado = resultado + jugLibero.toString()+"\n";
        }
        resultado = resultado + "OPUESTOS/AUXILIARES\n---------------\n";
        for (Opuesto jugOpuesto : listaOpuestos){
            resultado = resultado + jugOpuesto.toString()+"\n";
        }
        resultado = resultado + "PASADORES\n---------------\n";
        for (Pasador jugPasador : listaPasadores){
            resultado = resultado + jugPasador.toString()+"\n";
        } 
        return resultado;
    }
}