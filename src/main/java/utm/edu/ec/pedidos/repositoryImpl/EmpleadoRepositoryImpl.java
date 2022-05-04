package utm.edu.ec.pedidos.repositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import utm.edu.ec.pedidos.entity.Empleado;
import utm.edu.ec.pedidos.repository.EmpleadoRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoRepositoryImpl implements EmpleadoRepository {
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Empleado> findByCodem(String codem) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Empleado> query = cb.createQuery(Empleado.class);
        Root<Empleado> empleado = query.from(Empleado.class);
        List<Predicate> predicates = new ArrayList<>();

        Path<String> codemPath = empleado.get("codem");
        predicates.add(cb.equal(codemPath, codem));

        query.select(empleado).where(cb.and(predicates.toArray(new Predicate[0]))).orderBy((cb.desc(codemPath)));
        return entityManager.createQuery(query).getResultList();
    }
}
