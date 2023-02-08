
package pe.com.erka.service;

import java.util.List;
import java.util.Optional;
import pe.com.erka.entity.NegocioEntity;


public interface NegocioService {
    //funcion para mostrar todos los datos
    List<NegocioEntity> findAll();
    
    //funcion para buscar con codigo
    Optional<NegocioEntity> findById(Long id);
    
    //funcion para registrar
    NegocioEntity add(NegocioEntity c);
    
    //Funcion para actualizar
    NegocioEntity uptdate(NegocioEntity c);
    
    //funcion para eliminar
    NegocioEntity delete(NegocioEntity c);
    
    //funcion para mostrar datos habilitados
    List<NegocioEntity> findAllCustom();
}
