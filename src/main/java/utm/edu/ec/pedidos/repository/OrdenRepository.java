package utm.edu.ec.pedidos.repository;

import utm.edu.ec.pedidos.entity.Ordenes;
import java.util.List;

public interface OrdenRepository {
    List<Ordenes> findByCodor(String codor);
}
