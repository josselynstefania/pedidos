package utm.edu.ec.pedidos.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import utm.edu.ec.pedidos.entity.Cliente;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ClienteRepositoryTest {

    @Autowired
    IClienteRepository clienteRepository;

    @Test
    public void shouldGetCliente(){
        Cliente clienteToSave = new Cliente();
        clienteToSave.setCi("1315879142");
        clienteToSave.setName("Alejandro");
        clienteToSave.setLastname("Garcia");
        clienteToSave.setAddress("Manta");
        clienteToSave.setPhone("0987453152");
        clienteToSave.setEmail("alegarcia9142@gmail.com");

        clienteRepository.save(clienteToSave);

        //List<Empleado> empleadoSaved = empleadoRepository.findByCodem(empleadoToSave.getCodem());
        //Assertions.assertEquals(empleadoSaved.get().getName(),empleadoToSave.getName(), "Alumno creado correctamente");

        List<Cliente> listCliente = clienteRepository.findByCi("1315879142");
        Assertions.assertFalse(listCliente.isEmpty(), "Should return some elements");
    }
}
