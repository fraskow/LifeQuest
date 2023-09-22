package f5.frasko.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import f5.frasko.models.Objetive;
import f5.frasko.services.ObjetiveService;

@RestController
@RequestMapping("/objetives")
public class ObjetiveController {
    
    @Autowired
    ObjetiveService service;

    @GetMapping
    public List<Objetive> getAllObjetives(){
        return service.getAllObjetives();
    }

    @GetMapping("/{id}")
    public Objetive getObjetiveById(@PathVariable Long id){
        return service.getObjetiveById(id);
    }

    @PostMapping("/create")
    public Objetive addObjetive(@RequestBody Objetive objetive){
        return service.addObjetive(objetive);
    }

}
