package utm.edu.ec.pedidos.repositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import utm.edu.ec.pedidos.entity.Proveedor;
import utm.edu.ec.pedidos.repository.ProveedorRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

public class ProveedorRepositoryImpl implements ProveedorRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Proveedor> findByCodprov(String codprov) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Proveedor> query = cb.createQuery(Proveedor.class);
        Root<Proveedor> proveedor = query.from(Proveedor.class);
        List<Predicate> predicates = new ArrayList<>();

        Path<String> codprovPath = proveedor.get("codprov");
        predicates.add(cb.equal(codprovPath, codprov));

        query.select(proveedor).where(cb.and(predicates.toArray(new Predicate[0]))).orderBy((cb.desc(codprovPath)));
        return entityManager.createQuery(query).getResultList();
    }
}
