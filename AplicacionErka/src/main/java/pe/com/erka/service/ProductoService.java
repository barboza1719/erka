
package pe.com.erka.service;

import java.util.List;
import java.util.Optional;
import pe.com.erka.entity.ProductoEntity;

public interface ProductoService {
    List<ProductoEntity> findAll();
    Optional<ProductoEntity> findByid(Long id);
    ProductoEntity add(ProductoEntity p);
    ProductoEntity uptdate(ProductoEntity p);
    ProductoEntity delete(ProductoEntity p);
    List<ProductoEntity> findAllCustom();
}
