package utm.edu.ec.pedidos.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idempleado;

    @Column(nullable = false, length = 10)
    private String codem;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 50)
    private String lastname;

    @Column(nullable = false, length = 150)
    private String address;

    @Column(nullable = false, length = 25)
    private String fechanaci;

    @Column(nullable = false, length = 25)
    private String gender;
}
