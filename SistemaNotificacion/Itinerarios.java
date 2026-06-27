import java.util.ArrayList;


public class Itinerarios {
    
    private ArrayList<Vuelos> List_Vuelos;

    public Itinerarios(ArrayList<Vuelos> List_Vuelos){
        this.List_Vuelos = new ArrayList<>();
    }

    public ArrayList<Vuelos> getItinerario(){
        return List_Vuelos;
    }

    public void agregarVuelo(Vuelos vuelo){
        List_Vuelos.add(vuelo);
    }

    public void removerVuelo(Vuelos vuelo){
        List_Vuelos.remove(vuelo);
    }
}
