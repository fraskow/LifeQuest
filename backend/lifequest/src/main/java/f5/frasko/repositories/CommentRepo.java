package f5.frasko.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import f5.frasko.models.Comment;

public interface CommentRepo extends JpaRepository<Comment,Long>{
    
    @Query("SELECT c FROM Comment c WHERE c.userComment.id = :userId")
    List<Comment> findByUserId(@Param("userId") Long userId);

    @Query("SELECT c FROM Comment c WHERE c.objetive.id = :objetiveId")
    List<Comment> findByObjetiveId(@Param("objetiveId") Long objetiveId);

}
