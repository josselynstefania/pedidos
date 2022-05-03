package utm.edu.ec.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utm.edu.ec.pedidos.entity.Empleado;

public interface IEmpleadoRepository extends JpaRepository<Empleado, Integer>, EmpleadoRepository {
}
