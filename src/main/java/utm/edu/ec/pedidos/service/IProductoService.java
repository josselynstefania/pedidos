package utm.edu.ec.pedidos.service;

import utm.edu.ec.pedidos.entity.Ordenes;
import utm.edu.ec.pedidos.entity.Producto;
import java.util.List;

public interface IProductoService {
    void saveProducto(Producto producto);
    List<Producto> findByCodpro(String codpro);
    void deleteProducto(String codpro);
    List<Producto> finAll();
}
