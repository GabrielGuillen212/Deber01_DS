package SistemaIncidencias;

public class Aerolinea implements ProveedorTransporte{
    private String nombre;

    
    public Aerolinea(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public String getNombre() {
        return nombre;
    }

    @Override 
    public void tramitarEscalado(Incidencia inc) {
        System.out.println("Escalando a servicio al cliente");
    }

}
