package utm.edu.ec.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utm.edu.ec.pedidos.entity.Producto;

public interface IProductoRepository extends JpaRepository<Producto, Integer>, ProductoRepository {
}
