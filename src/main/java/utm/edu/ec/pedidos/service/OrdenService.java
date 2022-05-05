package utm.edu.ec.pedidos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utm.edu.ec.pedidos.entity.Ordenes;
import utm.edu.ec.pedidos.repository.IOrdenRepository;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class OrdenService implements IOrdenService {

    @Autowired
    IOrdenRepository ordenRepository;

    @Override
    public void saveOrden(Ordenes ordenes) {
        ordenRepository.save(ordenes);
    }

    @Override
    public List<Ordenes> findByCodor(String codor) {
        return ordenRepository.findByCodor(codor);
    }

    @Override
    public void deleteOrden(String codor) {
        List<Ordenes> ordenes = ordenRepository.findByCodor(codor);
        ordenes.forEach(x -> {ordenRepository.deleteAll();
        });
    }

    @Override
    public List<Ordenes> finAll() {
        return ordenRepository.findAll();
    }

    @Override
    public Ordenes updateOrden(Ordenes ordenes) {
        return ordenRepository.save(ordenes);
    }
}