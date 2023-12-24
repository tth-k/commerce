package project.commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.commerce.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
