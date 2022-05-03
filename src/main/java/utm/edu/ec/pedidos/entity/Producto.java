package utm.edu.ec.pedidos.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idproducto;

    @Column(nullable = false, length = 10)
    private String codpro;

    @Column(nullable = false, length = 50)
    private String descripcion;

    @Column(nullable = false, length = 50)
    private Double preuni;

    @Column(nullable = false, length = 50)
    private Integer cantidad;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name ="id_proveedor"))
    private Proveedor proveedor;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name ="id_categoria"))
    private Categoria categoria;
}
