package br.dev.mhc.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.mhc.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
