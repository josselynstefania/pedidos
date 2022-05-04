package utm.edu.ec.pedidos.repository;

import utm.edu.ec.pedidos.entity.Proveedor;
import java.util.List;

public interface ProveedorRepository {
    List<Proveedor> findByCodprov(String codprov);
}
