package it.cws.meta.cwsresourceservice.doa;

import it.cws.meta.cwsresourceservice.entities.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource,Long> {
}
