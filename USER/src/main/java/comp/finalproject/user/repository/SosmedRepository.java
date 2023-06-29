package comp.finalproject.user.repository;

import comp.finalproject.user.entity.Sosmed;
import comp.finalproject.user.entity.Tv;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SosmedRepository extends JpaRepository<Sosmed,Long> {
    List<Sosmed> findAll();

    Sosmed findById(long id);
}
