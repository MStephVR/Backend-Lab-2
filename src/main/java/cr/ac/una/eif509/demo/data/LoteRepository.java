package cr.ac.una.eif509.demo.data;

import cr.ac.una.eif509.demo.domain.LoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoteRepository extends JpaRepository<LoteEntity, Long> {
}
