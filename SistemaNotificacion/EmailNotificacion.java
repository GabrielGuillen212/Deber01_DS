public class EmailNotificacion implements SistemaNotificacion {
    public void notificar(String correo, String mensaje){
        System.out.print( mensaje + " fue enviado a" + correo);
    }
}
