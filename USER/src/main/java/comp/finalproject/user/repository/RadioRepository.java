package comp.finalproject.user.repository;

import comp.finalproject.user.entity.Radio;
import comp.finalproject.user.entity.Tv;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RadioRepository extends JpaRepository<Radio,Long> {
    List<Radio> findAll();

    Radio findById(long id);
}
