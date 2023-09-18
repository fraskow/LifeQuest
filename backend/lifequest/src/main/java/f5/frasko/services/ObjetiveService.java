package f5.frasko.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import f5.frasko.models.Objetive;
import f5.frasko.repositories.ObjetiveRepo;

@Service
public class ObjetiveService {
    
    @Autowired
    ObjetiveRepo repo;

    public List<Objetive> getAllObjetives(){
        return repo.findAll();
    }

    public Objetive getObjetiveById(Long id){
        Optional<Objetive> opt = repo.findById(id);
        if(opt.isPresent()){
            return opt.get();
        }else{
            return null;
        }
    }

    public Objetive addObjetive(Objetive objetive){
        return repo.save(objetive);
    }

}
