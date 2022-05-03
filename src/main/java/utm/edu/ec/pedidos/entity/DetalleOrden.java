package utm.edu.ec.pedidos.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class DetalleOrden {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idetaorden;

    @Column(nullable = false, length = 10)
    private String cordet;

    @Column(nullable = false, length = 50)
    private String cantidad;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name ="id_producto"))
    private Producto producto;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name ="id_orden"))
    private Ordenes ordenes;

}
