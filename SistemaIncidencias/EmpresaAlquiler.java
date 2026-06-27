package SistemaIncidencias;

public class EmpresaAlquiler implements ProveedorTransporte {
    private String nombre;

    
    public EmpresaAlquiler(String nombre) {
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
