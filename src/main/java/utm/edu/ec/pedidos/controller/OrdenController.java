package utm.edu.ec.pedidos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utm.edu.ec.pedidos.entity.Ordenes;
import utm.edu.ec.pedidos.service.IOrdenService;
import java.util.List;

@RestController
@RequestMapping(path = "/orden")
public class OrdenController {

    @Autowired
    private IOrdenService ordenService;

    @PostMapping()
    public void saveOrden(@RequestBody Ordenes ordenes) {
        ordenService.saveOrden(ordenes);
    }

    @GetMapping
    public List<Ordenes> findByCodor(@RequestParam String codor) {
        return ordenService.findByCodor(codor);
    }

    @DeleteMapping
    public void deleteOrden(@RequestParam String codor) {
        ordenService.deleteOrden(codor);
    }
}