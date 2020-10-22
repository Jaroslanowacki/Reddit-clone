package pl.nowacki.service;

import org.springframework.stereotype.Service;

import pl.nowacki.domain.Role;
import pl.nowacki.repository.RoleRepository;

@Service
public class RoleService {

	private final RoleRepository roleRepository;
	
	

	public RoleService(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}




	public Role findByName(String name) {
		 return roleRepository.findByName(name);
	}
	
}
