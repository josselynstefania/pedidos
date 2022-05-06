package utm.edu.ec.pedidos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utm.edu.ec.pedidos.entity.Proveedor;
import utm.edu.ec.pedidos.service.IProveedorService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping(path = "/proveedor")
public class ProveedorController {

    @Autowired
    private IProveedorService proveedorService;

    @PostMapping()
    public void saveProveedor(@RequestBody Proveedor proveedor) {
        proveedorService.saveProveedor(proveedor);
    }

    @GetMapping
    public List<Proveedor> findByCodprov(@RequestParam String codprov) {
        return proveedorService.findByCodprov(codprov);
    }

    @DeleteMapping
    public void deleteProveedor(@RequestParam String codprov) {
        proveedorService.deleteProveedor(codprov);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<Proveedor> finAll() {
        return proveedorService.finAll();
    }

    @PutMapping
    public Proveedor updateProveedor(@RequestBody Proveedor proveedor){
        return proveedorService.updateProveedor(proveedor);

    }
}


