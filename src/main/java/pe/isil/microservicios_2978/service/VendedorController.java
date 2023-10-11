package pe.isil.microservicios_2978.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.isil.microservicios_2978.model.Vendedor;
import pe.isil.microservicios_2978.repository.VendedorRepository;
import java.util.List;

import javax.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/api_2978/vendedores")
public class VendedorController {

    @Autowired
    public VendedorRepository vendedorRepository;

    @PostMapping("/store")
    public Vendedor store(@RequestBody Vendedor vendedor){
        vendedor.setId(0);
        return vendedorRepository.save(vendedor);
    }
    @PutMapping("/update/{id}")
    public Vendedor actualizar(@RequestBody Vendedor vendedor, @PathVariable("id") Integer id){
        Vendedor vendedorFromDB = vendedorRepository.findById(id)
                .orElseThrow(()->new EntityNotFoundException("El vendedor no fue encontrado con el id: " + id));

        vendedorFromDB.setNombre(vendedor.getNombre());
        vendedorFromDB.setRUC(vendedor.getRUC());
        vendedorFromDB.setCorreo(vendedor.getCorreo());

        return vendedorRepository.save(vendedorFromDB);
    }
    @DeleteMapping("/delete/{id}")
    public boolean eliminar(@PathVariable("id") Integer id){
        try {
            vendedorRepository.deleteById(id);
            return true;
        } catch (Exception err){
            return false;
        }
    }
    @GetMapping("/getAll")
    public  List<Vendedor> getAll(){
        return vendedorRepository.findAll();
    }
}
