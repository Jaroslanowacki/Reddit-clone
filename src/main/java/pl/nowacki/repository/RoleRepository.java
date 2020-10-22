package pl.nowacki.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.nowacki.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
		
	Role findByName(String name);
	
}
