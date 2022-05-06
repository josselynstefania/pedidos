package utm.edu.ec.pedidos.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class DetalleOrden {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idetaorden;

    @Column(nullable = false, length = 10)
    private String cordet;

    @Column(nullable = false, length = 50)
    private String cantidad;

    @ManyToOne
    @JoinColumn(name = "idproducto", foreignKey = @ForeignKey(name ="idproducto"))
    private Producto producto;

    @ManyToOne
    @JoinColumn(name= "idorden",foreignKey = @ForeignKey(name ="idorden"))
    private Ordenes ordenes;

}
