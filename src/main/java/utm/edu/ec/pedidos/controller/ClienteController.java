package utm.edu.ec.pedidos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utm.edu.ec.pedidos.entity.Cliente;
import utm.edu.ec.pedidos.service.IClienteService;

import java.util.List;

@RestController
@RequestMapping(path = "/cliente")
public class ClienteController {

    @Autowired
    private IClienteService clienteService;

    @PostMapping()
    public void saveCliente(@RequestBody Cliente cliente) {
        clienteService.saveCliente(cliente);
    }

    @GetMapping
    public List<Cliente> findByCi(@RequestParam String ci) {
        return clienteService.findByCi(ci);
    }

    @DeleteMapping
    public void deleteCliente(@RequestParam String ci) {
        clienteService.findByCi(ci);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<Cliente> findAll() {
        return clienteService.finAll();

    }
}


