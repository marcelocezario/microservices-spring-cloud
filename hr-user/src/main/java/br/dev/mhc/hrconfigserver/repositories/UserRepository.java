package br.dev.mhc.hrconfigserver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.mhc.hrconfigserver.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
