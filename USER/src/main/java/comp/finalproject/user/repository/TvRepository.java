package comp.finalproject.user.repository;

import comp.finalproject.user.entity.Tv;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TvRepository extends JpaRepository<Tv,Long> {
    List<Tv> findAll();

    Tv findById(long id);
}
