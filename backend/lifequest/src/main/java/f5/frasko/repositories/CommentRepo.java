package f5.frasko.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import f5.frasko.models.Comment;

public interface CommentRepo extends JpaRepository<Comment,Long>{
    
}
