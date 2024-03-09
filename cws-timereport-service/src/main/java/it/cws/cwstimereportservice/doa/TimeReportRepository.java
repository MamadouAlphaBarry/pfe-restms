package it.cws.cwstimereportservice.doa;

import it.cws.cwstimereportservice.entities.TimeReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeReportRepository extends JpaRepository<TimeReport,Long> {
}
