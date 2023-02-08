
package pe.com.erka.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.erka.entity.NegocioEntity;
import pe.com.erka.repository.NegocioRepository;

@Service
public class NegocioServiceImpl implements NegocioService{
    
    @Autowired
    private NegocioRepository repositorio;

    @Override
    public List<NegocioEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public Optional<NegocioEntity> findById(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public NegocioEntity add(NegocioEntity c) {
        return repositorio.save(c);
    }

    @Override
    public NegocioEntity uptdate(NegocioEntity c) {
        NegocioEntity objnegocio=repositorio.getById(c.getCodigo());
        BeanUtils.copyProperties(c, objnegocio);
        return repositorio.save(objnegocio);
    }

    @Override
    public NegocioEntity delete(NegocioEntity c) {
        NegocioEntity objnegocio=repositorio.getById(c.getCodigo());
        objnegocio.setEstado(false);
        return repositorio.save(objnegocio);
    }

    @Override
    public List<NegocioEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }
    
}
