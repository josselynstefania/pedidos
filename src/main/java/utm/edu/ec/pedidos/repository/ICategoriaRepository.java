package utm.edu.ec.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utm.edu.ec.pedidos.entity.Categoria;

public interface ICategoriaRepository extends JpaRepository<Categoria, Integer>, CategoriaRepository {
}
