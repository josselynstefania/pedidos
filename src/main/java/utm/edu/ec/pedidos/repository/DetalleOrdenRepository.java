package utm.edu.ec.pedidos.repository;

import utm.edu.ec.pedidos.entity.DetalleOrden;
import java.util.List;

public interface DetalleOrdenRepository {
    List<DetalleOrden> findByCordet(String cordet);
}
