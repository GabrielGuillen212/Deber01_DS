package model;
import java.util.Arrays;
import java.util.List;

public class VueloEconomico extends Vuelo {
    private double tarifaBase;
    public VueloEconomico() {
        this.tarifaBase = 0.0;
    }

    @Override
    public boolean getDisponibilidad() {
        return true;
    }

    @Override
    public List<ClaseAsiento> getClasesDisponibles() {
        return Arrays.asList(ClaseAsiento.ECONOMICA, ClaseAsiento.EJECUTIVA);
    }

    public double getTarifaBase()              { return tarifaBase; }
    public void   setTarifaBase(double tarifa) { this.tarifaBase = tarifa; }
}
