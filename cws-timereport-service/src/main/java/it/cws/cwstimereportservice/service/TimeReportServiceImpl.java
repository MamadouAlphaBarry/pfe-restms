package it.cws.cwstimereportservice.service;

import it.cws.cwstimereportservice.dto.TimeReportDtoRequest;
import it.cws.cwstimereportservice.dto.TimeReportDtoResponse;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;


@Service
@Transactional
public class TimeReportServiceImpl implements TimeReportService {
    /**
     * @param timeReportDtoRequest
     * @param month
     * @param year
     * @return
     */
    @Override
    public Map<String, Object> consuntivazione(TimeReportDtoRequest timeReportDtoRequest, Date month, Date year) {
        return null;
    }

    /**
     * @param userId
     * @param month
     * @param year
     * @return
     */
    @Override
    public TimeReportDtoResponse timeReportDtoResponseConvertPDF(Long userId, Date month, Date year) {
        return null;
    }

    /**
     * @param userId
     * @param month
     * @param year
     * @return
     */
    @Override
    public TimeReportDtoResponse consuntivazioneRisorse(Long userId, Date month, Date year) {
        return null;
    }

    /**
     * @param userId
     * @param month
     * @param year
     * @return
     */
    @Override
    public Map<String, Object> consuntivazioneAddCommesse(Long userId, Date month, Date year) {
        return null;
    }

    /**
     * @param userID
     * @param month
     * @param year
     * @return
     */
    @Override
    public Map consuntivazioneImportCommesse(Long userID, Date month, Date year) {
        return null;
    }

    /**
     * @param userId
     * @param month
     * @param year
     */
    @Override
    public void consuntivazioneStoreCommesse(Long userId, Date month, Date year) {

    }

    /**
     * @param id
     * @param timeReportDtoRequest
     */
    @Override
    public void consuntivazioneDeleteCommesse(Long id, TimeReportDtoRequest timeReportDtoRequest) {

    }

    /**
     * @param userId
     * @param month
     * @param year
     * @return
     */
    @Override
    public TimeReportDtoResponse storeTimeReport(Long userId, Date month, Date year) {
        return null;
    }

    /**
     * @param timeReportDtoResponse
     * @param month
     * @param year
     * @return
     */
    @Override
    public Map approvazionePM(TimeReportDtoResponse timeReportDtoResponse, Date month, Date year) {
        return null;
    }

    /**
     * @param date
     * @param status
     * @param resourceId
     * @param overtime
     * @param absence
     */
    @Override
    public void createReportDay(Date date, String status, int resourceId, Integer overtime, Integer absence) {

    }

    /**
     * @param month
     * @param year
     * @param request
     */
    @Override
    public void approvazionePMJobAllMonth(Integer month, Integer year, TimeReportDtoRequest request) {

    }

    /**
     * @param month
     * @param year
     * @param request
     */
    @Override
    public void managerApproveOrRefuseAllOvertime(int month, int year, TimeReportDtoRequest request) {

    }

    /**
     * @param report_id
     * @param month
     * @param year
     * @param request
     */
    @Override
    public void approvazionePMstoreSingleStraordinariAjax(int report_id, int month, int year, TimeReportDtoRequest request) {

    }

    /**
     * @param job_id
     * @param resource_id
     * @param day
     * @param month
     * @param year
     * @param request
     */
    @Override
    public void approvazionePMstoreStraordinariByDateAjax(int job_id, int resource_id, int day, int month, int year, TimeReportDtoRequest request) {

    }

    /**
     * @param month
     * @param year
     * @param request
     */
    @Override
    public void approvazionePMJob(Integer month, Integer year, TimeReportDtoRequest request) {

    }

    /**
     * @param job_id
     * @param resource_id
     * @param day
     * @param month
     * @param year
     * @param request
     */
    @Override
    public void approvazioneTrPMstoreAjax(int job_id, int resource_id, int day, int month, int year, TimeReportDtoRequest request) {

    }

    /**
     * @param resource_id
     * @param month
     * @param year
     * @param request
     */
    @Override
    public void approvazionePMstoreStraordinariAjax(int resource_id, int month, int year, TimeReportDtoRequest request) {

    }

    /**
     * @param user_id
     * @param month
     * @param year
     * @param request
     */
    @Override
    public void workday(int user_id, int month, int year, TimeReportDtoRequest request) {

    }

    /**
     * @param user_id
     * @param month
     * @param year
     * @param overtime
     * @param risorsa
     * @param request
     */
    @Override
    public void consuntivazioneRisorseStraordinari(int user_id, int month, int year, String overtime, String risorsa, TimeReportDtoRequest request) {

    }

    /**
     * @param user_id
     * @param month
     * @param year
     * @param request
     */
    @Override
    public void smartWorking(int user_id, int month, int year, TimeReportDtoRequest request) {

    }

    /**
     * @param user_id
     * @param month
     * @param year
     */
    @Override
    public void reopenTR(int user_id, int month, int year) {

    }

    /**
     * @param user_id
     * @param month
     * @param year
     * @param data
     */
    @Override
    public void confirmTR(int user_id, int month, int year, List<TimeReportDtoRequest> data) {

    }

    /**
     * @param id
     * @return
     */
    @Override
    public List<TimeReportDtoRequest> getApprovazioneDetails(int id) {
        return null;
    }
}
