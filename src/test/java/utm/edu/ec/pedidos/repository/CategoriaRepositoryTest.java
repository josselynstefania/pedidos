package utm.edu.ec.pedidos.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import utm.edu.ec.pedidos.entity.Categoria;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CategoriaRepositoryTest {

    @Autowired
    ICategoriaRepository categoriaRepository;

    @Test
    public void shouldGetCategoria(){
        Categoria categoriaToSave = new Categoria();
        categoriaToSave.setCodcat("101A");
        categoriaToSave.setCategory("Lacteos");

        categoriaRepository.save(categoriaToSave);

        //List<Empleado> empleadoSaved = empleadoRepository.findByCodem(empleadoToSave.getCodem());
        //Assertions.assertEquals(empleadoSaved.get().getName(),empleadoToSave.getName(), "Alumno creado correctamente");

        List<Categoria> listCategoria = categoriaRepository.findByCodcat("101A");
        Assertions.assertFalse(listCategoria.isEmpty(), "Should return some elements");
    }
}
