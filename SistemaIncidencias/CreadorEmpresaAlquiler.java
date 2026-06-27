package SistemaIncidencias;

public class CreadorEmpresaAlquiler  extends CreadorProveedor{

    @Override
    protected ProveedorTransporte crearProveedor(String nombre) {
        return new EmpresaAlquiler(nombre);
    }

}
