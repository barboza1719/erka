
package pe.com.erka.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.erka.entity.NegocioEntity;
import pe.com.erka.service.NegocioService;

@RestController
@RequestMapping("/negocio")
public class NegocioRestController {
    
    @Autowired
    private NegocioService negocio;
    
    @GetMapping
    public List<NegocioEntity> findAll(){
        return negocio.findAll();
    }
    
    @GetMapping("/custom")
    public List<NegocioEntity> findAllCustom(){
        return negocio.findAllCustom();
    }
    @PostMapping
    public NegocioEntity add(@RequestBody NegocioEntity c) {
        return negocio.add(c);
    }
    
    @GetMapping("/{id}")
    public Optional<NegocioEntity> findById(@PathVariable long id) {
        return negocio.findById(id);
    }
    
    @PutMapping("/{id}")
    public NegocioEntity update(@PathVariable long id,@RequestBody NegocioEntity c) {
        c.getCodigo();
        return negocio.uptdate(c);
    }
    
    @DeleteMapping("/{id}")
    public NegocioEntity delete(@PathVariable long id) {
    NegocioEntity objnegocio=new NegocioEntity();
    objnegocio.setCodigo(id);
    return negocio.delete(NegocioEntity.builder().codigo(id).build());
    }
    

}
