
package pe.com.erka.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.erka.entity.NegocioEntity;

public interface NegocioRepository extends JpaRepository<NegocioEntity, Long>{
    @Query("select c from NegocioEntity where c.estado=1")
    List<NegocioEntity> findAllCustom();
    
    @Query("select c from NegocioEntiry c where upper(c.nombre) "+ "like upper(:nombre) and c.estado=1")
    List<NegocioEntity> findByName(@Param("nombre") String nombre);
    
}
