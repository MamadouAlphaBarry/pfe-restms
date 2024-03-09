package it.cws.cwstimereportservice.mappers;

import it.cws.cwstimereportservice.dto.TimeReportDtoRequest;
import it.cws.cwstimereportservice.dto.TimeReportDtoResponse;
import it.cws.cwstimereportservice.entities.TimeReport;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TimeReportMapper {
    TimeReportDtoResponse timeReportTotimeReportDtoResponse(TimeReport timeReport);
    TimeReport timeReportDtoRequestToTimeReport(TimeReportDtoRequest timeReportDtoRequest);
}
