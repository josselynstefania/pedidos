package utm.edu.ec.pedidos.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import utm.edu.ec.pedidos.entity.Empleado;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class EmpleadoRepositoryTest {

    @Autowired
    IEmpleadoRepository empleadoRepository;

    @Test
    public void shouldGetEmpleado(){
        Empleado empleadoToSave = new Empleado();
        empleadoToSave.setCodem("001A");
        empleadoToSave.setName("Andrea");
        empleadoToSave.setLastname("Rojas");
        empleadoToSave.setAddress("Portoviejo");
        empleadoToSave.setFechanaci("05-12-11");
        empleadoToSave.setGender("Femenino");

        empleadoRepository.save(empleadoToSave);

        //List<Empleado> empleadoSaved = empleadoRepository.findByCodem(empleadoToSave.getCodem());
        //Assertions.assertEquals(empleadoSaved.get().getName(),empleadoToSave.getName(), "Alumno creado correctamente");

        List<Empleado> listEmpleados = empleadoRepository.findByCodem("001A");
        Assertions.assertFalse(listEmpleados.isEmpty(), "Should return some elements");
    }
}
