package SistemaIncidencias;

public class CreadorAerolinea extends CreadorProveedor {

    @Override
    protected ProveedorTransporte crearProveedor(String nombre) {
        return new Aerolinea(nombre);
    }

}
