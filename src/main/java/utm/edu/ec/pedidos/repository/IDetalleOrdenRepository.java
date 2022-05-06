package utm.edu.ec.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utm.edu.ec.pedidos.entity.DetalleOrden;

import java.util.UUID;

public interface IDetalleOrdenRepository extends JpaRepository<DetalleOrden, UUID>, DetalleOrdenRepository{
}
