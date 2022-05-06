package utm.edu.ec.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utm.edu.ec.pedidos.entity.Ordenes;

import java.util.UUID;

public interface IOrdenRepository extends JpaRepository<Ordenes, UUID>, OrdenRepository{
}
