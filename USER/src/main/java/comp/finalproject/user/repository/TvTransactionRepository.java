package comp.finalproject.user.repository;

import comp.finalproject.user.entity.Tv;
import comp.finalproject.user.entity.TvTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TvTransactionRepository extends JpaRepository<TvTransaction,Long> {
    List<TvTransaction> findAll();

    TvTransaction findById(long id);
}
