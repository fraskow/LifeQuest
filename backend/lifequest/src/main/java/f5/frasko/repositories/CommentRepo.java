package f5.frasko.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import f5.frasko.models.Comment;

public interface CommentRepo extends JpaRepository<Comment,Long>{
    

    Optional<List<Comment>> findByUserId(Long userId);

    Optional<List<Comment>> findByObjetiveId(Long objetiveId);

}
