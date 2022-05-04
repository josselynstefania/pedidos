package utm.edu.ec.pedidos.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import utm.edu.ec.pedidos.entity.Ordenes;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class OrdenRepositoryTest {

    @Autowired
    IOrdenRepository ordenRepository;

    @Test
    public void shouldGetOrden(){
        Ordenes ordenesToSave = new Ordenes();
        ordenesToSave.setCodor("A001");
        ordenesToSave.setDateorden("24-05-22");
        ordenesToSave.setDescuento("0.5%");

        ordenRepository.save(ordenesToSave);

        //List<Empleado> empleadoSaved = empleadoRepository.findByCodem(empleadoToSave.getCodem());
        //Assertions.assertEquals(empleadoSaved.get().getName(),empleadoToSave.getName(), "Alumno creado correctamente");

        List<Ordenes> listOrdenes = ordenRepository.findByCodor("A001");
        Assertions.assertFalse(listOrdenes.isEmpty(), "Should return some elements");
    }
}
