package model;
import java.util.List;
import java.util.UUID;
import search.IBuscador;

public class Pasajero {

    private final String idPasajero;
    private String nombre;
    private String email;
    private String telefono;

    public Pasajero(String nombre, String email, String telefono) {
        this.idPasajero = UUID.randomUUID().toString().substring(0, 6).toUpperCase();
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    @SuppressWarnings("unchecked")
    public List<Vuelo> buscarVuelos(IBuscador buscador, String criterio) {
        return (List<Vuelo>) buscador.buscar(criterio);
    }

    public String getIdPasajero(){ 
        return idPasajero; 
    }
    public String getNombre(){ 
        return nombre; 
    }
    public void setNombre(String nombre){ 
        this.nombre = nombre; 
    }
    public String getEmail(){ 
        return email; 
    }
    public void setEmail(String email){ 
        this.email = email; 
    }
    public String getTelefono(){ 
        return telefono; 
    }
    public void setTelefono(String telefono) { 
        this.telefono = telefono; 
    }

    @Override
    public String toString() {
        return String.format("Pasajero[%s] %s <%s>", idPasajero, nombre, email);
    }
}
