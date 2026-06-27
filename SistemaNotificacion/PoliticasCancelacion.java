public class PoliticasCancelacion {

    private String idPolitica;
    private String descripcion;

    public PoliticasCancelacion(String idPolitica, String descripcion){
        this.idPolitica = idPolitica;
        this.descripcion = descripcion;
    }

    public String getdescripcion(){
        return descripcion;
    }

    public String getidP(){
        return idPolitica;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
}
