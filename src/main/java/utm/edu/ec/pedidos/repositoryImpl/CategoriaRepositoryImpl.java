package utm.edu.ec.pedidos.repositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import utm.edu.ec.pedidos.entity.Categoria;
import utm.edu.ec.pedidos.repository.CategoriaRepository;
import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

public class CategoriaRepositoryImpl implements CategoriaRepository {
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Categoria> findByCodcat(String codcat) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Categoria> query = cb.createQuery(Categoria.class);
        Root<Categoria> categoria = query.from(Categoria.class);
        List<Predicate> predicates = new ArrayList<>();

        Path<String> codcatPath = categoria.get("codcat");
        predicates.add(cb.equal(codcatPath, codcat));

        query.select(categoria).where(cb.and(predicates.toArray(new Predicate[0]))).orderBy((cb.desc(codcatPath)));
        return entityManager.createQuery(query).getResultList();
    }
}

