package factory;
import model.Vuelo;
import model.VueloEconomico;

public class AerolineaFactory implements ITransportFactory {

    private final String nombreAerolinea;

    public AerolineaFactory(String nombreAerolinea) {
        this.nombreAerolinea = nombreAerolinea;
    }

    @Override
    public Vuelo crearVuelo() {
        VueloEconomico vuelo = new VueloEconomico();
        vuelo.setAerolinea(nombreAerolinea);
        vuelo.setTarifaBase(150.0);
        return vuelo;
    }

    public String getNombreAerolinea() { return nombreAerolinea; }
}
