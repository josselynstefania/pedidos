package utm.edu.ec.pedidos.service;

import utm.edu.ec.pedidos.entity.Cliente;
import utm.edu.ec.pedidos.entity.Empleado;
import java.util.List;

public interface IEmpleadoService {
    void saveEmpleado(Empleado empleado);
    List<Empleado> findByCodem(String codem);
    void deleteEmpleado(String codem);
    List<Empleado> finAll();
}
