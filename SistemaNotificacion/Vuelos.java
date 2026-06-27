import java.util.ArrayList;

public class Vuelos {

    private String idVuelo;
    private ArrayList<Pasajero> list_pasajeros;

    public Vuelos(String idVuelo, ArrayList<Pasajero> list_pasajeros ){
        this.idVuelo = idVuelo;
        this.list_pasajeros = new ArrayList<>();
    }

    public String getidV(){
        return idVuelo;
    }

    public ArrayList<Pasajero> list_pasarejos(){
        return list_pasajeros;
    }
}
