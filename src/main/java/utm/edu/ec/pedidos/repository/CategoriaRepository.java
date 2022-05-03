package utm.edu.ec.pedidos.repository;

import utm.edu.ec.pedidos.entity.Categoria;

import java.util.List;

public interface CategoriaRepository {
    List<Categoria> findByCodcate(String codcate);
}
