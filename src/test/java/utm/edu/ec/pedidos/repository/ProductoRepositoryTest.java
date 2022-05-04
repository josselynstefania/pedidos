package utm.edu.ec.pedidos.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import utm.edu.ec.pedidos.entity.Producto;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ProductoRepositoryTest {

    @Autowired
    IProductoRepository productoRepository;

    @Test
    public void shouldGetProducto(){
        Producto productoToSave = new Producto();
        productoToSave.setCodpro("PR001");
        productoToSave.setDescripcion("Leche Semidescremada");
        productoToSave.setPreuni(1.5);
        productoToSave.setCantidad(15);

        productoRepository.save(productoToSave);

        //List<Empleado> empleadoSaved = empleadoRepository.findByCodem(empleadoToSave.getCodem());
        //Assertions.assertEquals(empleadoSaved.get().getName(),empleadoToSave.getName(), "Alumno creado correctamente");

        List<Producto> listProducto = productoRepository.findByCodpro("PR001");
        Assertions.assertFalse(listProducto.isEmpty(), "Should return some elements");
    }
}
