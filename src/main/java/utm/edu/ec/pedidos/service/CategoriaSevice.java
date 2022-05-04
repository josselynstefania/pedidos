package utm.edu.ec.pedidos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utm.edu.ec.pedidos.entity.Categoria;
import utm.edu.ec.pedidos.entity.Empleado;
import utm.edu.ec.pedidos.repository.ICategoriaRepository;
import utm.edu.ec.pedidos.repository.IEmpleadoRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CategoriaSevice implements ICategoriaService{

    @Autowired
    ICategoriaRepository categoriaRepository;

    @Override
    public void saveCategoria(Categoria categoria) {
        categoriaRepository.save(categoria);
    }

    @Override
    public List<Categoria> findByCodcat(String codcat) {
        return categoriaRepository.findByCodcat(codcat);
    }

    @Override
    public void deleteCategoria(String codcat) {
        List<Categoria> categoria = categoriaRepository.findByCodcat(codcat);
        categoria.forEach(x -> {categoriaRepository.deleteAll();
        });
    }

    @Override
    public List<Categoria> finAll() {
        return categoriaRepository.findAll();
    }
}
