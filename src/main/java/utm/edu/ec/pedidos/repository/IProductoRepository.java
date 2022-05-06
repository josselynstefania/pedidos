package utm.edu.ec.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utm.edu.ec.pedidos.entity.Producto;

import java.util.UUID;

public interface IProductoRepository extends JpaRepository<Producto, UUID>, ProductoRepository {
}
