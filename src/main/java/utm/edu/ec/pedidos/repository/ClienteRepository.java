package utm.edu.ec.pedidos.repository;

import utm.edu.ec.pedidos.entity.Cliente;

import java.util.List;

public interface ClienteRepository {
    List<Cliente> findByCodci(String ci);
}
