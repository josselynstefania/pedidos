package utm.edu.ec.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utm.edu.ec.pedidos.entity.Categoria;

import java.util.UUID;

public interface ICategoriaRepository extends JpaRepository<Categoria, UUID>, CategoriaRepository {
}
