package utm.edu.ec.pedidos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utm.edu.ec.pedidos.entity.DetalleOrden;
import utm.edu.ec.pedidos.repository.IDetalleOrdenRepository;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class DetalleOrdenService implements IDetalleOrdenServide {

    @Autowired
    IDetalleOrdenRepository detalleOrdenRepository;

    @Override
    public void saveDetalleOrden(DetalleOrden detalleOrden) {
        detalleOrdenRepository.save(detalleOrden);
    }

    @Override
    public List<DetalleOrden> findByCordet(String cordet) {
        return detalleOrdenRepository.findByCordet(cordet);
    }

    @Override
    public void deleteCategoria(String cordet) {
        List<DetalleOrden> detalleOrden = detalleOrdenRepository.findByCordet(cordet);
        detalleOrden.forEach(x -> {detalleOrdenRepository.deleteAll();
        });
    }

    @Override
    public List<DetalleOrden> finAll() {
        return detalleOrdenRepository.findAll();
    }

    @Override
    public DetalleOrden updateDetalleOrden(DetalleOrden detalleOrden) {
        return detalleOrdenRepository.save(detalleOrden);
    }
}
