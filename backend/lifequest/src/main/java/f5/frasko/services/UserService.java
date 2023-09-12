package f5.frasko.services;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import f5.frasko.models.Role;
import f5.frasko.models.User;
import f5.frasko.repositories.UserRepo;

@Service
public class UserService {

    @Autowired
    UserRepo repo;

    @Autowired
    RoleService roleService;

    public List<User> getAllUsers() {
        return repo.findAll();
    }

    public User getUserById(Long id) {
        Optional<User> opt = repo.findById(id);
        if (opt.isPresent()) {
            return opt.get();
        } else {
            return null;
        }
    }

    public void assignDefaultRole(User user) throws Throwable {
        Role defaultRole = roleService.getRoleById(2L);
        Set<Role> roles = new HashSet<>();
        roles.add(defaultRole);

        user.setRoles(roles);
    }

    public User addUser(User user) throws Throwable {
        BCryptPasswordEncoder pwEncoder = new BCryptPasswordEncoder();
        String encodedPw = pwEncoder.encode(user.getPassword());
        user.setPassword(encodedPw);

        this.assignDefaultRole(user);

        return repo.save(user);
    }

    public User updateUser(User user) {
        return repo.save(user);
    }

    public void deleteUser(User user) {
        repo.delete(user);
    }
}
