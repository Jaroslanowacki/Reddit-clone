package pl.nowacki.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.nowacki.domain.Link;

public interface LinkRepository extends JpaRepository<Link, Long> {
		
	
}
