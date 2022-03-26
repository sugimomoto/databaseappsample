package sugimomoto.databaseappsample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sugimomoto.databaseappsample.model.*;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {
    
}
