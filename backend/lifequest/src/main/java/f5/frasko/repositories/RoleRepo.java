package f5.frasko.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import f5.frasko.models.Role;

public interface RoleRepo extends JpaRepository<Role, Long>{
    
}
