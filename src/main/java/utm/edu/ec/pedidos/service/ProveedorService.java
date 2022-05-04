package utm.edu.ec.pedidos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utm.edu.ec.pedidos.entity.Proveedor;
import utm.edu.ec.pedidos.repository.IProveedorRepository;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProveedorService implements IProveedorService {

    @Autowired
    IProveedorRepository proveedorRepository;

    @Override
    public void saveProveedor(Proveedor proveedor) {
        proveedorRepository.save(proveedor);
    }

    @Override
    public List<Proveedor> findByCodprov(String codprov) {
        return proveedorRepository.findByCodprov(codprov);
    }

    @Override
    public void deleteProveedor(String codprov) {
        List<Proveedor> proveedor = proveedorRepository.findByCodprov(codprov);
        proveedor.forEach(x -> {proveedorRepository.deleteAll();
        });
    }

    @Override
    public List<Proveedor> finAll() {
        return proveedorRepository.findAll();
    }
}