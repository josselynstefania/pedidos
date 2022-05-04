package utm.edu.ec.pedidos.service;

import utm.edu.ec.pedidos.entity.DetalleOrden;
import java.util.List;

public interface IDetalleOrdenServide {
    void saveDetalleOrden(DetalleOrden detalleOrden);
    List<DetalleOrden> findByCordet(String cordet);
    void deleteCategoria(String cordet);
}
