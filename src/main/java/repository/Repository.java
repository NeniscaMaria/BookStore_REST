package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.io.Serializable;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface Repository<ID extends Serializable, T extends model.BaseEntity<ID>>
extends JpaRepository<T,ID> {
}
