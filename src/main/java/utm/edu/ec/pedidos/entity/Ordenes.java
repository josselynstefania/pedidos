package utm.edu.ec.pedidos.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Ordenes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idorden;

    @Column(nullable = false, length = 10)
    private String codor;

    @Column(nullable = false, length = 50)
    private Date dateorden;

    @Column(nullable = false, length = 50)
    private String descuento;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name ="idempleado"))
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name ="idcliente"))
    private Cliente cliente;
}
