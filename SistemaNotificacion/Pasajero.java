public class Pasajero {

    private Usuario usuario;
    private String asiento;

    public Pasajero(Usuario usuario, String asiento){
        this.usuario = usuario;
        this.asiento = asiento;
    }

    public String getasiento(){
        return asiento;
    }
}
