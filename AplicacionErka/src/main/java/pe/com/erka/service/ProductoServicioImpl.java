
package pe.com.erka.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import pe.com.erka.entity.ProductoEntity;
import pe.com.erka.repository.ProductoRepository;


public class ProductoServicioImpl implements ProductoService{
    
    @Autowired
    private ProductoRepository repositorio;

    @Override
    public List<ProductoEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public Optional<ProductoEntity> findByid(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public ProductoEntity add(ProductoEntity p) {
        return repositorio.save(p);
    }

    @Override
    public ProductoEntity uptdate(ProductoEntity p) {
        ProductoEntity objproducto=repositorio.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objproducto);
        return repositorio.save(objproducto);
    }

    @Override
    public ProductoEntity delete(ProductoEntity p) {
        ProductoEntity objproducto=repositorio.getById(p.getCodigo());
        objproducto.setEstado(false);
        return repositorio.save(objproducto);
    }

    @Override
    public List<ProductoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    
}
