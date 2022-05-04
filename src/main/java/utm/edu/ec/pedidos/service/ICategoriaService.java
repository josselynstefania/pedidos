package utm.edu.ec.pedidos.service;

import utm.edu.ec.pedidos.entity.Categoria;
import java.util.List;

public interface ICategoriaService {
    void saveCategoria(Categoria categoria);
    List<Categoria> findByCodcat(String codcat);
    void deleteCategoria(String codcat);
}
