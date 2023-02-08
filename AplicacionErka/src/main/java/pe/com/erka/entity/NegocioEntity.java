
package pe.com.erka.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="NegocioEntity")
@Table(name="negocio")

public class NegocioEntity implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="codlin")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    @Column(name="nomlin")
    private String nombre;
    @Column(name="ertlin")
    private boolean estado;
    
    
}
