package model;
import java.time.LocalDateTime;
import java.util.List;

public abstract class Vuelo {
    private String idVuelo;
    private String origen;
    private String destino;
    private LocalDateTime horario;
    private String aerolinea;
    public abstract boolean getDisponibilidad();
    public abstract List<ClaseAsiento> getClasesDisponibles();
    public String getIdVuelo(){ 
        return idVuelo; 
    }
    public void setIdVuelo(String id){ 
        this.idVuelo = id; 
    }
    public String getOrigen(){ 
        return origen; 
    }
    public void setOrigen(String origen){ 
        this.origen = origen; 
    }
    public String getDestino(){ 
        return destino; 
    }
    public void setDestino(String destino){ 
        this.destino = destino; 
    }
    public LocalDateTime getHorario(){ 
        return horario; 
    }
    public void setHorario(LocalDateTime h){ 
        this.horario = h; 
    }
    public String getAerolinea(){ 
        return aerolinea; 
    }
    public void setAerolinea(String aerolinea){ 
        this.aerolinea = aerolinea; 
    }

    @Override
    public String toString() {
        return String.format("Vuelo[%s] %s -> %s | %s | %s",
                idVuelo, origen, destino, aerolinea, horario);
    }
}
