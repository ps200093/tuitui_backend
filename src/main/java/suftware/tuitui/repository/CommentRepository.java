package suftware.tuitui.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import suftware.tuitui.domain.Comment;

import java.util.List;
import java.util.Optional;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {
    public List<Comment> findByTimeCapsule_TimeCapsuleId(Integer id, Sort sort);
    public Optional<Comment> findByTimeCapsule_TimeCapsuleIdAndProfile_ProfileId(Integer timeCapsuleId, Integer userId);
}
