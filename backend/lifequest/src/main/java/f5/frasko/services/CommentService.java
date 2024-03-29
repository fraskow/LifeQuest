package f5.frasko.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import f5.frasko.models.Comment;
import f5.frasko.repositories.CommentRepo;

@Service
public class CommentService {
    
    @Autowired
    CommentRepo repo;

    public List<Comment> getAllComments(){
        return repo.findAll();
    }

    public Comment getCommentById(Long id){
        Optional<Comment> opt = repo.findById(id);
        if (opt.isPresent()) {
            return opt.get();
        } else {
            return null;
        }
    }

    public Comment addComment(Comment comment){
        return repo.save(comment);
    }

    public List<Comment> findByUserId(Long userId){
        return repo.findByUserId(userId);
    }

    public List<Comment> findByObjetiveId(Long objetiveId){
        return repo.findByObjetiveId(objetiveId);
    }

}
