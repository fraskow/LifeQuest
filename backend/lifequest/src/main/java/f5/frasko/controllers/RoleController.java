package f5.frasko.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import f5.frasko.models.Role;
import f5.frasko.services.RoleService;

@RestController
@RequestMapping("/roles")
public class RoleController {
    
    @Autowired
    RoleService service;

    @GetMapping
    public List<Role> getAllRoles(){
        return service.getAllRoles();
    }

    @GetMapping("/{id}")
    public Role getRoleById(@PathVariable Long id){
        return service.getRoleById(id);
    }

}
