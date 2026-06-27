import java.util.ArrayList;
import java.time.LocalDate;

public class Vuelos {

    private String idVuelo;
    private LocalDate horario;
    private ArrayList<Pasajero> list_pasajeros;

    public Vuelos(String idVuelo, LocalDate horario, ArrayList<Pasajero> list_pasajeros ){
        this.idVuelo = idVuelo;
        this.horario = horario;
        this.list_pasajeros = new ArrayList<>();
    }

    public void agregarpasajero(Usuario usuario, String idVuelo, String asiento){
        Pasajero pasajero = new Pasajero(usuario, asiento);
        this.list_pasajeros.add(pasajero);
    }

    public String getidV(){
        return idVuelo;
    }

    public ArrayList<Pasajero> list_pasarejos(){
        return list_pasajeros;
    }

    public void setHorario(int año, int mes, int dia){
        this.horario = LocalDate.of(año, mes, dia);
    }

    public LocalDate gethorario(){
        return horario;
    }
}
