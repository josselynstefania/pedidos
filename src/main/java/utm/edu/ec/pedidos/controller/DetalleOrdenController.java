package utm.edu.ec.pedidos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utm.edu.ec.pedidos.entity.DetalleOrden;
import utm.edu.ec.pedidos.service.IDetalleOrdenServide;
import java.util.List;

@RestController
@RequestMapping(path = "/detalleorden")
public class DetalleOrdenController {

    @Autowired
    private IDetalleOrdenServide detalleOrdenServide;

    @PostMapping()
    public void saveDetalleOrden(@RequestBody DetalleOrden detalleOrden) {
        detalleOrdenServide.saveDetalleOrden(detalleOrden);
    }

    @GetMapping
    public List<DetalleOrden> findByCordet(@RequestParam String cordet) {
        return detalleOrdenServide.findByCordet(cordet);
    }

    @DeleteMapping
    public void deleteDetalleOrden(@RequestParam String cordet) {
        detalleOrdenServide.findByCordet(cordet);
    }
}
