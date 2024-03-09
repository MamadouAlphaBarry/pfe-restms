package it.cws.cwstimereportservice.service;

import it.cws.cwstimereportservice.dto.TimeReportDtoRequest;
import it.cws.cwstimereportservice.dto.TimeReportDtoResponse;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface TimeReportService {

    Map<String,Object> consuntivazione(TimeReportDtoRequest timeReportDtoRequest, Date month,Date year);
    //attention le moi et l'annèe peuvent etre null, dans ce cas considerer moi current et l'annee current

    TimeReportDtoResponse timeReportDtoResponseConvertPDF(Long userId, Date month, Date year);
    //attention le moi et l'annèe peuvent etre null, dans ce cas considerer moi current et l'annee current

    TimeReportDtoResponse consuntivazioneRisorse(Long userId, Date month,Date year);

    Map<String,Object> consuntivazioneAddCommesse(Long userId,Date month,Date year);
    Map  consuntivazioneImportCommesse(Long userID, Date month,Date year);
    void consuntivazioneStoreCommesse(Long userId,Date month,Date year);

    void consuntivazioneDeleteCommesse(Long id, TimeReportDtoRequest timeReportDtoRequest);

    TimeReportDtoResponse storeTimeReport(Long userId, Date month, Date year);

    Map approvazionePM(TimeReportDtoResponse timeReportDtoResponse, Date month, Date year);

    void createReportDay(Date date, String status, int resourceId, Integer overtime, Integer absence);
    void approvazionePMJobAllMonth(Integer month, Integer year, TimeReportDtoRequest request);
    void managerApproveOrRefuseAllOvertime(int month, int year, TimeReportDtoRequest request);
    void approvazionePMstoreSingleStraordinariAjax(int report_id, int month, int year, TimeReportDtoRequest request);
    void approvazionePMstoreStraordinariByDateAjax(int job_id, int resource_id, int day, int month, int year, TimeReportDtoRequest request);
    void approvazionePMJob(Integer month, Integer year, TimeReportDtoRequest request);
    void approvazioneTrPMstoreAjax(int job_id, int resource_id, int day, int month, int year, TimeReportDtoRequest request);
void approvazionePMstoreStraordinariAjax(int resource_id, int month, int year, TimeReportDtoRequest request);
    void workday(int user_id, int month, int year, TimeReportDtoRequest request);
    void consuntivazioneRisorseStraordinari(int user_id, int month, int year, String overtime, String risorsa, TimeReportDtoRequest request);
    void smartWorking(int user_id, int month, int year, TimeReportDtoRequest request);
    void reopenTR(int user_id, int month, int year);
    void confirmTR(int user_id, int month, int year, List<TimeReportDtoRequest> data);
    List<TimeReportDtoRequest> getApprovazioneDetails(int id);

}

