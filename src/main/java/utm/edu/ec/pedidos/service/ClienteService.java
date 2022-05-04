package utm.edu.ec.pedidos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utm.edu.ec.pedidos.entity.Cliente;
import utm.edu.ec.pedidos.repository.IClienteRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ClienteService implements IClienteService {

    @Autowired
    IClienteRepository clienteRepository;

    @Override
    public void saveCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> findByCi(String ci) {
        return clienteRepository.findByCi(ci);
    }

    @Override
    public void deleteCliente(String ci) {
        List<Cliente> cliente = clienteRepository.findByCi(ci);
        cliente.forEach(x -> {clienteRepository.deleteAll();
        });
    }
}
