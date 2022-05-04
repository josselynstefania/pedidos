package utm.edu.ec.pedidos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utm.edu.ec.pedidos.entity.Empleado;
import utm.edu.ec.pedidos.repository.EmpleadoRepository;
import utm.edu.ec.pedidos.repository.IEmpleadoRepository;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EmpleadoService implements IEmpleadoService{

    @Autowired
    IEmpleadoRepository empleadoRepository;

    @Override
    public void saveEmpleado(Empleado empleado) {
        empleadoRepository.save(empleado);
    }

    @Override
    public List<Empleado> findByCodem(String codem) {
        return empleadoRepository.findByCodem(codem);
    }

    @Override
    public void deleteEmpleado(String codem) {
        List<Empleado> empleado = empleadoRepository.findByCodem(codem);
        empleado.forEach(x -> {empleadoRepository.deleteAll();
        });
    }

    @Override
    public List<Empleado> finAll() {
        return empleadoRepository.findAll();
    }
}
