import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ge.ibsu.demo.dto.projections.Cinema;

@Repository
public interface FilmRepository extends JpaRepository<Cinema, Long> {
    Page<Cinema> findByTitleContainingOrDescriptionContainingOrReleaseYearOrLanguageContaining(String title, String description, int releaseYear, String language, Pageable pageable);
}
