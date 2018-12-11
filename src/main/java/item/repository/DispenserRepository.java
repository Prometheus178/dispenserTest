package item.repository;

import item.domain.Dispenser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DispenserRepository extends CrudRepository<Dispenser, Integer > {
}
