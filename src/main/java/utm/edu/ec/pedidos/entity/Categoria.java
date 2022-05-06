package utm.edu.ec.pedidos.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idcategoria;

    @Column(nullable = false, length = 15)
    private String codcat;

    @Column(nullable = false, length = 150)
    private String category;
}
