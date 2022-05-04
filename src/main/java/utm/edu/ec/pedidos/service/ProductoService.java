package utm.edu.ec.pedidos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utm.edu.ec.pedidos.entity.Producto;
import utm.edu.ec.pedidos.repository.IProductoRepository;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductoService implements IProductoService {

    @Autowired
    IProductoRepository productoRepository;

    @Override
    public void saveProducto(Producto producto) {
        productoRepository.save(producto);
    }

    @Override
    public List<Producto> findByCodpro(String codpro) {
        return productoRepository.findByCodpro(codpro);
    }

    @Override
    public void deleteProducto(String codpro) {
        List<Producto> producto=productoRepository.findByCodpro(codpro);
        producto.forEach(x->{productoRepository.deleteAll();
        });
    }

    @Override
    public List<Producto> finAll() {
        return productoRepository.findAll();
    }
}

