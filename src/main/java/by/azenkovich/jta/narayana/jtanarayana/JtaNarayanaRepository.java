package by.azenkovich.jta.narayana.jtanarayana;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author alexsandr
 * @since 25.09.17.
 */
@Repository
public interface JtaNarayanaRepository extends JpaRepository<JtaNarayanaEntity, Long> {

}
