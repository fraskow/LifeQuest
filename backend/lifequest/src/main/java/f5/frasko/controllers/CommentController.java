package f5.frasko.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import f5.frasko.models.Comment;
import f5.frasko.models.Objetive;
import f5.frasko.models.User;
import f5.frasko.services.CommentService;
import f5.frasko.services.ObjetiveService;
import f5.frasko.services.UserService;

@RestController
@RequestMapping("/comments")
public class CommentController {
    
    @Autowired
    CommentService comService;
    @Autowired
    UserService userService;
    @Autowired
    ObjetiveService objService;


    @GetMapping
    public List<Comment> getAllComments(){
        return comService.getAllComments();
    }

    @GetMapping("/{id}")
    public Comment getCommentById(@PathVariable Long id){
        return comService.getCommentById(id);
    }

    @GetMapping("/byUserId/{id}")
    public Optional<List<Comment>> getCommentsByUserId(@PathVariable Long userId){
        User user = userService.getUserById(userId);
        return comService.findByUserId((long) user.getIduser());
    }

    @GetMapping("/byObjetive/{id}") 
    public Optional<List<Comment>> getCommentsByObjetiveId(@PathVariable Long objetiveId){
        Objetive objetive = objService.getObjetiveById(objetiveId);
        return comService.findByObjetiveId((long) objetive.getIdobjetive());
    }

    @PostMapping("/create")
    public Comment addComment(@RequestBody Comment comment){
        return comService.addComment(comment);
    }

}
