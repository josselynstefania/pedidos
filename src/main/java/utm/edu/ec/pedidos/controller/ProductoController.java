package utm.edu.ec.pedidos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utm.edu.ec.pedidos.entity.Producto;
import utm.edu.ec.pedidos.service.IProductoService;
import java.util.List;

@RestController
@RequestMapping(path = "/producto")
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @PostMapping()
    public void saveProducto(@RequestBody Producto producto) {
        productoService.saveProducto(producto);
    }

    @GetMapping
    public List<Producto> findByCodpro(@RequestParam String codpro) {
        return productoService.findByCodpro(codpro);
    }

    @DeleteMapping
    public void deleteProducto(@RequestParam String codpro) {
        productoService.deleteProducto(codpro);}

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<Producto> findAll() {
        return productoService.finAll();

    }

    @PutMapping
    public Producto uodateProducto(@RequestBody Producto producto){
        return productoService.updateProducto(producto);
    }
}
