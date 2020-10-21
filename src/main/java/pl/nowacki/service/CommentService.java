package pl.nowacki.service;

import org.springframework.stereotype.Service;

import pl.nowacki.domain.Comment;
import pl.nowacki.repository.CommentRepository;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Comment save(Comment comment) {
        return commentRepository.save(comment);
    }
}
