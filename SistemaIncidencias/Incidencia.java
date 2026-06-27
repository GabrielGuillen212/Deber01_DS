package SistemaIncidencias;

public class Incidencia {
    private String id;
    private String estado = "Por resolver";
    private ProveedorTransporte proveedor;
    
    public Incidencia(String id, ProveedorTransporte proveedor) {
        this.id = id;
        this.proveedor = proveedor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ProveedorTransporte getProveedor() {
        return proveedor;
    }

    public void setProveedor(ProveedorTransporte proveedor) {
        this.proveedor = proveedor;
    }

    
}
