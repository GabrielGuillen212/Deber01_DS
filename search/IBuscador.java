package search;
import java.util.List;
import java.util.Map;

public interface IBuscador {
    List<?> buscar(String criterio);
    List<?> filtrar(Map<String, Object> filtros);
}
