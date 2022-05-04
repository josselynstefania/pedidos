package utm.edu.ec.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utm.edu.ec.pedidos.entity.Proveedor;

public interface IProveedorRepository extends JpaRepository<Proveedor, Integer>, ProveedorRepository{
}
