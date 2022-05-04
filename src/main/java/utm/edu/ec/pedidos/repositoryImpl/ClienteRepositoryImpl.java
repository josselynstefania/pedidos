package utm.edu.ec.pedidos.repositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import utm.edu.ec.pedidos.entity.Cliente;
import utm.edu.ec.pedidos.repository.ClienteRepository;
import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepositoryImpl implements ClienteRepository {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Cliente> findByCi(String ci) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Cliente> query = cb.createQuery(Cliente.class);
        Root<Cliente> cliente = query.from(Cliente.class);
        List<Predicate> predicates = new ArrayList<>();

        Path<String> ciPath = cliente.get("ci");
        predicates.add(cb.equal(ciPath, ci));

        query.select(cliente).where(cb.and(predicates.toArray(new Predicate[0]))).orderBy((cb.desc(ciPath)));
        return entityManager.createQuery(query).getResultList();
    }
}
