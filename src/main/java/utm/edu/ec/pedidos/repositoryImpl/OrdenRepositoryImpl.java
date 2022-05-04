package utm.edu.ec.pedidos.repositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import utm.edu.ec.pedidos.entity.Ordenes;
import utm.edu.ec.pedidos.repository.OrdenRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

public class OrdenRepositoryImpl implements OrdenRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Ordenes> findByCodor(String codor)  {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Ordenes> query = cb.createQuery(Ordenes.class);
        Root<Ordenes> ordenes = query.from(Ordenes.class);
        List<Predicate> predicates = new ArrayList<>();

        Path<String> codorPath = ordenes.get("codor");
        predicates.add(cb.equal(codorPath, codor));

        query.select(ordenes).where(cb.and(predicates.toArray(new Predicate[0]))).orderBy((cb.desc(codorPath)));
        return entityManager.createQuery(query).getResultList();
    }
}
