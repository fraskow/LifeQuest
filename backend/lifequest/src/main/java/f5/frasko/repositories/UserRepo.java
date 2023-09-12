package f5.frasko.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import f5.frasko.models.User;

public interface UserRepo extends JpaRepository<User, Long> {

    Optional<User> findByemail(String email);

}