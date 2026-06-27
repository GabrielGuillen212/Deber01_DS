public class Usuario {

    private String idUsuario;
    private String email;

    public Usuario(String idUsuario, String email){
        this.idUsuario = idUsuario;
        this.email = email;
    }

    public void revisarMensaje(){
        System.out.print("Se muestran los mensajes");
    }
    public String getid(){
        return idUsuario;
    }
    public String getemail(){
        return email;
    }
}
