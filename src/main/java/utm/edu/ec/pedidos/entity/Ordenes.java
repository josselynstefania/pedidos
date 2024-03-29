package utm.edu.ec.pedidos.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class Ordenes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idorden;

    @Column(nullable = false, length = 10)
    private String codor;

    @Column(nullable = false, length = 50)
    private String dateorden;

    @Column(nullable = false, length = 50)
    private String descuento;

    @ManyToOne
    @JoinColumn(name = "idempleado", foreignKey = @ForeignKey(name ="idempleado"))
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "idcliente", foreignKey = @ForeignKey(name ="idcliente"))
    private Cliente cliente;
}
