package pl.nowacki.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.nowacki.domain.Vote;

public interface VoteRepository extends JpaRepository<Vote, Long> {

}
