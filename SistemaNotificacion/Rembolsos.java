public class Rembolsos {

    private String idRembolso;
    private Double monto;
    private String estado;

    public Rembolsos(String idRembolso, Double monto, String estado){
        this.idRembolso = idRembolso;
        this.monto = monto;
        this.estado = estado;
    }

    public String getidR(){
        return idRembolso;
    }

    public Double getmonto(){
        return monto;
    }

    public String getestado(){
        return estado;
    }

    public void setmonto(Double monto){
        this.monto = monto;
    }

    public void setestado(String estado){
        this.estado = estado;
    }
}
