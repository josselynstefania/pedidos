package utm.edu.ec.pedidos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utm.edu.ec.pedidos.entity.Categoria;
import utm.edu.ec.pedidos.service.ICategoriaService;
import java.util.List;

@RestController
@RequestMapping(path = "/categoria")
public class CategoriaController {

    @Autowired
    private ICategoriaService categoriaService;

    @PostMapping()
    public void saveCategoria(@RequestBody Categoria categoria) {
        categoriaService.saveCategoria(categoria);
    }

    @GetMapping
    public List<Categoria> findByCodcat(@RequestParam String codcat) {
        return categoriaService.findByCodcat(codcat);
    }

    @DeleteMapping
    public void deleteCategoria(@RequestParam String codcat) {
        categoriaService.deleteCategoria(codcat);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<Categoria> findAll() {
        return categoriaService.finAll();
    }

    @PutMapping
    public Categoria updateCategoria(@RequestBody Categoria categoria){
        return categoriaService.updateCategoria(categoria);
    }
}
