package utm.edu.ec.pedidos.repository;

import utm.edu.ec.pedidos.entity.Empleado;
import java.util.List;

public interface EmpleadoRepository {
    List<Empleado> findByCodem(String codem);
}
