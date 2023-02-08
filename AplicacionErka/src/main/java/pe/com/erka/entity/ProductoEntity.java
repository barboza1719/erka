
package pe.com.erka.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="ProductoEntity")
@Table(name="producto")

public class ProductoEntity implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="codpro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name="nompro")
    private String nombre;
    @Column(name="precpro")
    private double preciocompra;
    @Column(name="stockpro")
    private int Stock;
    @Column(name="estpro")
    private boolean estado;
    @ManyToOne
    @JoinColumn(name="codlin",nullable=false)
    private NegocioEntity Linea;
}
