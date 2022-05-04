package utm.edu.ec.pedidos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utm.edu.ec.pedidos.entity.Proveedor;
import utm.edu.ec.pedidos.service.IProveedorService;

import java.util.List;

@RestController
@RequestMapping(path = "/proveedor")
public class ProveedorController {

        @Autowired
        private IProveedorService proveedorService;

        @PostMapping()
        public void saveProveedor(@RequestBody Proveedor proveedor){
            proveedorService.saveProveedor(proveedor);
        }

        @GetMapping
        public List<Proveedor> findByCodprov(@RequestParam String codprov){
            return proveedorService.findByCodprov(codprov);
        }

        @DeleteMapping
        public void deleteProveedor(@RequestParam String codprov){ proveedorService.deleteProveedor(codprov);}
    }
