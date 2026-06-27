package SistemaIncidencias;

public class GestorIncidencia {

    public void resolverIncidencia(Incidencia incidencia) {
        incidencia.setEstado("Resulta");
    }

    private void escalarIncidencia(Incidencia incidencia) {
        incidencia.setEstado("Escalada");
        incidencia.getProveedor().tramitarEscalado(incidencia);
    }
}
