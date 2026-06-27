public class Administrador {

    private String idAdmin;
    private String nombre;
    private SistemaNotificacion sistema;

    public Administrador(String idAdmin, String nombre, SistemaNotificacion sistema){
        this.idAdmin = idAdmin;
        this.nombre = nombre;
        this.sistema = sistema;
    }

    public void notificar(String appnotificacion, String mensaje){
        
    }
}
