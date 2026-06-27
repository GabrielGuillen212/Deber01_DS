public class AppMensaje implements SistemaNotificacion {
    public void notificar(String usuario, String mensaje){
        System.out.print(mensaje + " fue enviado a" + usuario);
    }
}
