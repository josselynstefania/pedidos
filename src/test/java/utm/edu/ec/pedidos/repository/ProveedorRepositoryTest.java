package utm.edu.ec.pedidos.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import utm.edu.ec.pedidos.entity.Producto;
import utm.edu.ec.pedidos.entity.Proveedor;

import javax.persistence.Column;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ProveedorRepositoryTest {

    @Autowired
    IProveedorRepository proveedorRepository;

    @Test
    public void shouldGetProveedor(){
        Proveedor proveedorToSave = new Proveedor();
        proveedorToSave.setCodprov("PV001");
        proveedorToSave.setName("Fabricio");
        proveedorToSave.setLastname("Anzules");
        proveedorToSave.setAddress("Guayaquil");
        proveedorToSave.setPhone("0984523647");

        proveedorRepository.save(proveedorToSave);

        //List<Empleado> empleadoSaved = empleadoRepository.findByCodem(empleadoToSave.getCodem());
        //Assertions.assertEquals(empleadoSaved.get().getName(),empleadoToSave.getName(), "Alumno creado correctamente");

        List<Proveedor> listProveedor = proveedorRepository.findByCodprov("PV001");
        Assertions.assertFalse(listProveedor.isEmpty(), "Should return some elements");
    }
}
