package comp.finalproject.user.repository;

import comp.finalproject.user.entity.SosmedTransaction;
import comp.finalproject.user.entity.TvTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SosmedTransactionRepository extends JpaRepository<SosmedTransaction,Long> {
    List<SosmedTransaction> findAll();

    SosmedTransaction findById(long id);
}
