package utm.edu.ec.pedidos.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import utm.edu.ec.pedidos.entity.DetalleOrden;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class DetalleOrdenRepositoryTest {
    @Autowired
    IDetalleOrdenRepository detalleOrdenRepository;

    @Test
    public void shouldGetDetalleOrden(){
        DetalleOrden detalleOrdenToSave = new DetalleOrden();
        detalleOrdenToSave.setCordet("DO51");
        detalleOrdenToSave.setCantidad("100");

        detalleOrdenRepository.save(detalleOrdenToSave);

        //List<DetalleOrden> DetalleOrdenSaved = detalleOrdenRepository.findByCordet(detalleOrdenToSave.getCordet();
        //Assertions.assertEquals(DetalleOrdenSaved.get().getCantidad(),detalleOrdenToSave.getCantidad(), "Detalle Orden creada correctamente");

        List<DetalleOrden> listDetalleOrden = detalleOrdenRepository.findByCordet("DO51");
        Assertions.assertFalse(listDetalleOrden.isEmpty(), "Should return some elements");
    }



}
