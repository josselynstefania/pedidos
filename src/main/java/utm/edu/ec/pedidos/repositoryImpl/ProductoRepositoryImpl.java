package utm.edu.ec.pedidos.repositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import utm.edu.ec.pedidos.entity.Producto;
import utm.edu.ec.pedidos.repository.ProductoRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepositoryImpl implements ProductoRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Producto> findByCodpro(String codpro) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Producto> query = cb.createQuery(Producto.class);
        Root<Producto> producto = query.from(Producto.class);
        List<Predicate> predicates = new ArrayList<>();

        Path<String> codproPath = producto.get("codpro");
        predicates.add(cb.equal(codproPath, codpro));

        query.select(producto).where(cb.and(predicates.toArray(new Predicate[0]))).orderBy((cb.desc(codproPath)));
        return entityManager.createQuery(query).getResultList();
    }
}
