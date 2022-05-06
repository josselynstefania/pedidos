package utm.edu.ec.pedidos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utm.edu.ec.pedidos.entity.Empleado;
import utm.edu.ec.pedidos.service.IEmpleadoService;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping(path = "/empleado")
public class EmpleadoController {

    @Autowired
    private IEmpleadoService empleadoService;

    @PostMapping()
    public void saveEmpleado(@RequestBody Empleado empleado) {
        empleadoService.saveEmpleado(empleado);
    }

    @GetMapping
    public List<Empleado> findByCodor(@RequestParam String codem) {
        return empleadoService.findByCodem(codem);
    }

    @DeleteMapping
    public void deleteEmpleado(@RequestParam String codem) {
        empleadoService.deleteEmpleado(codem);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<Empleado> finAll() {
        return empleadoService.finAll();
    }

    @PutMapping
    public Empleado updateEmpleado(@RequestBody Empleado empleado){
        return empleadoService.updateEmpleado(empleado);
    }
}
