package br.dev.mhc.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.mhc.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
