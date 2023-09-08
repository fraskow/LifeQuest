package f5.frasko.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import f5.frasko.models.Role;
import f5.frasko.repositories.RoleRepo;

@Service
public class RoleService {
    
    @Autowired
    RoleRepo repo;

    public List<Role> getAllRoles(){
        return repo.findAll();
    }

    public Role getRoleById(Long id){
         Optional<Role> opt = repo.findById(id);
        if(opt.isPresent()){
            return opt.get();
        }else{
            return null;
        }
    }

}
