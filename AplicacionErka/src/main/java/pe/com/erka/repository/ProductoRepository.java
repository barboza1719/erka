
package pe.com.erka.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.com.erka.entity.ProductoEntity;

public interface ProductoRepository extends JpaRepository<ProductoEntity, Long>{
    @Query("Select p from ProductoEntity p where p.estado=1")
    List<ProductoEntity> findAllCustom();
    @Query("select p from ProductoEntity p where upper(p.nombre) "+ "like upper(:nombre) and p.estado=1")
List<ProductoEntity> findByName(@Param("nombre") String nombre);
    
}
