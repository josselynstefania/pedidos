package utm.edu.ec.pedidos.repository;

import utm.edu.ec.pedidos.entity.Producto;
import java.util.List;

public interface ProductoRepository {
    List<Producto> findByCodpro(String codpro);
}
