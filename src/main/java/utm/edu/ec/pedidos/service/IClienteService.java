package utm.edu.ec.pedidos.service;

import utm.edu.ec.pedidos.entity.Cliente;
import java.util.List;

public interface IClienteService {
    void saveCliente(Cliente cliente);
    List<Cliente> findByCi(String ci);
    void deleteCliente(String ci);
    List<Cliente> finAll();
    Cliente updateCliente(Cliente cliente);
}
