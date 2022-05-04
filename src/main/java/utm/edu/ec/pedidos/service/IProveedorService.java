package utm.edu.ec.pedidos.service;

import utm.edu.ec.pedidos.entity.Ordenes;
import utm.edu.ec.pedidos.entity.Proveedor;
import java.util.List;

public interface IProveedorService {
    void saveProveedor(Proveedor proveedor);
    List<Proveedor> findByCodprov(String codprov);
    void deleteProveedor(String codprov);
    List<Proveedor> finAll();
}
