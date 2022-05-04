package utm.edu.ec.pedidos.repositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import utm.edu.ec.pedidos.entity.DetalleOrden;
import utm.edu.ec.pedidos.repository.DetalleOrdenRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

public class DetalleOrdenRepositoryImpl implements DetalleOrdenRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<DetalleOrden> findByCordet(String cordet) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<DetalleOrden> query = cb.createQuery(DetalleOrden.class);
        Root<DetalleOrden> detalleOrden = query.from(DetalleOrden.class);
        List<Predicate> predicates = new ArrayList<>();

        Path<String> cordetPath = detalleOrden.get("cordet");
        predicates.add(cb.equal(cordetPath, cordet));

        query.select(detalleOrden).where(cb.and(predicates.toArray(new Predicate[0]))).orderBy((cb.desc(cordetPath)));
        return entityManager.createQuery(query).getResultList();
    }
}
