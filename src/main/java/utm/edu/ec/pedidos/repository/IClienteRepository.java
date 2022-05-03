package utm.edu.ec.pedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utm.edu.ec.pedidos.entity.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Integer>, ClienteRepository {
}
