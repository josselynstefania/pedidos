package utm.edu.ec.pedidos.controller;

import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utm.edu.ec.pedidos.entity.DetalleOrden;
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
        ordenService.findByCodor(codor);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<Ordenes> findAll() {
        return ordenService.finAll();
    }

    @PutMapping
    public void updateOrden(@RequestBody Ordenes ordenes){
        ordenService.updateOrden(ordenes);
    }
    }

