package search;
import factory.AerolineaFactory;
import factory.ITransportFactory;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
import model.Vuelo;

public class BuscadorVuelos implements IBuscador {
    private final List<Vuelo> catalogoVuelos;
    public BuscadorVuelos(List<ITransportFactory> factories) {
        this.catalogoVuelos = new ArrayList<>();
        cargarCatalogo(factories);
    }
    public BuscadorVuelos() {
        this.catalogoVuelos = new ArrayList<>();
        List<ITransportFactory> factories = Arrays.asList(
            new AerolineaFactory("LATAM"),
            new AerolineaFactory("AVIANCA"),
            new AerolineaFactory("COPA")
        );
        cargarCatalogo(factories);
        configurarVuelosEjemplo();
    }
    private void cargarCatalogo(List<ITransportFactory> factories) {
        for (ITransportFactory factory : factories) {
            Vuelo vuelo = factory.crearVuelo();
            catalogoVuelos.add(vuelo);
        }
    }
    private void configurarVuelosEjemplo() {
        LocalDateTime base = LocalDateTime.now();

        catalogoVuelos.get(0).setIdVuelo("LA101");
        catalogoVuelos.get(0).setOrigen("GYE");
        catalogoVuelos.get(0).setDestino("UIO");
        catalogoVuelos.get(0).setHorario(base.plusDays(3).withHour(8).withMinute(0));

        catalogoVuelos.get(1).setIdVuelo("AV202");
        catalogoVuelos.get(1).setOrigen("GYE");
        catalogoVuelos.get(1).setDestino("BOG");
        catalogoVuelos.get(1).setHorario(base.plusDays(5).withHour(14).withMinute(30));

        catalogoVuelos.get(2).setIdVuelo("CM303");
        catalogoVuelos.get(2).setOrigen("UIO");
        catalogoVuelos.get(2).setDestino("MIA");
        catalogoVuelos.get(2).setHorario(base.plusDays(7).withHour(22).withMinute(15));
    }

    @Override
    public List<Vuelo> buscar(String criterio) {
        return catalogoVuelos.stream()
                .filter(v -> v.getOrigen().equalsIgnoreCase(criterio)
                          || v.getDestino().equalsIgnoreCase(criterio))
                .filter(Vuelo::getDisponibilidad)
                .collect(Collectors.toList());
    }

    @Override
    public List<Vuelo> filtrar(Map<String, Object> filtros) {
        List<Vuelo> resultado = new ArrayList<>(catalogoVuelos);

        if (filtros.containsKey("aerolinea")) {
            resultado = filtrarPorAerolinea((String) filtros.get("aerolinea"));
        }
        if (filtros.containsKey("desde") && filtros.containsKey("hasta")) {
            final List<Vuelo> base = resultado;
            resultado = filtrarPorHorario(
                (LocalDateTime) filtros.get("desde"),
                (LocalDateTime) filtros.get("hasta")
            ).stream()
             .filter(base::contains)
             .collect(Collectors.toList());
        }
        return resultado;
    }
    public List<Vuelo> filtrarPorAerolinea(String aerolinea) {
        return catalogoVuelos.stream()
                .filter(v -> v.getAerolinea().equalsIgnoreCase(aerolinea))
                .filter(Vuelo::getDisponibilidad)
                .collect(Collectors.toList());
    }

    public List<Vuelo> filtrarPorHorario(LocalDateTime desde, LocalDateTime hasta) {
        return catalogoVuelos.stream()
                .filter(v -> v.getHorario() != null
                          && !v.getHorario().isBefore(desde)
                          && !v.getHorario().isAfter(hasta))
                .filter(Vuelo::getDisponibilidad)
                .collect(Collectors.toList());
    }
    public List<Vuelo> getCatalogo() {
        return Collections.unmodifiableList(catalogoVuelos);
    }
}
