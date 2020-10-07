package pl.nowacki.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.nowacki.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{

}
