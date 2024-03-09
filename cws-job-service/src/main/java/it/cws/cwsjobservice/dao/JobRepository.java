package it.cws.cwsjobservice.dao;

import it.cws.cwsjobservice.entities.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job,Long> {
}
