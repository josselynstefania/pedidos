package utm.edu.ec.pedidos.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idproducto;

    @Column(nullable = false, length = 10)
    private String codpro;

    @Column(nullable = false, length = 150)
    private String descripcion;

    @Column(nullable = false, length = 50)
    private Double preuni;

    @Column(nullable = false, length = 50)
    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "idproveedor", foreignKey = @ForeignKey(name ="idproveedor"))
    private Proveedor proveedor;

    @ManyToOne
    @JoinColumn(name = "idcategoria", foreignKey = @ForeignKey(name ="idcategoria"))
    private Categoria categoria;
}
