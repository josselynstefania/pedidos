package utm.edu.ec.pedidos.service;

import utm.edu.ec.pedidos.entity.Ordenes;
import java.util.List;

public interface IOrdenService {
    void saveOrden(Ordenes ordenes);
    List<Ordenes> findByCodor(String codor);
    void deleteOrden(String codor);
    List<Ordenes> finAll();
    Ordenes updateOrden(Ordenes ordenes);
}
