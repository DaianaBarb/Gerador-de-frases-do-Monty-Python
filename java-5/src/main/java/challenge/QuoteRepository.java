package challenge;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface QuoteRepository extends JpaRepository<Quote, Long> {
    public List<Quote> findByActor(String actor);
}
