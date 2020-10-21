package pl.nowacki.service;

import org.springframework.stereotype.Service;

import pl.nowacki.domain.Vote;
import pl.nowacki.repository.VoteRepository;

@Service
public class VoteService {

    private final VoteRepository voteRepository;

    public VoteService(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    public Vote save(Vote vote) {
        return voteRepository.save(vote);
    }
}
