package it.cws.meta.cwsresourceservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Rappresenta una risorsa.
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Resource {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    /**
     * La date de création de la ressource.
     */
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    /**
     * La date de mise à jour de la ressource.
     */
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    /**
     * L'identifiant de l'utilisateur associé à la ressource.
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * Le coût minimum de la ressource.
     */
    @Column(name = "cost_minimum")
    private BigDecimal costMinimum;

    /**
     * Le coût moyen de la ressource.
     */
    @Column(name = "cost_medium")
    private BigDecimal costMedium;

    /**
     * Le coût maximum de la ressource.
     */
    @Column(name = "cost_maximum")
    private BigDecimal costMaximum;

    /**
     * Le coût réel de la ressource.
     */
    @Column(name = "cost_real")
    private BigDecimal costReal;
    /**
     * L'identifiant de l'unité opérationnelle de la ressource.
     */
    private Integer businessUnitId;

    /**
     * Le code fiscal de la ressource.
     */
    private String codFiscale;

    /**
     * La matricule de la ressource.
     */
    private String matricola;

    /**
     * La date de début du rapport de la ressource.
     */
    private Date dataInizioRapporto;

    /**
     * L'assignation de la ressource.
     */
    private String inquadramento;

    /**
     * Le profil horaire de la ressource.
     */
    private String profiloOrario;

    /**
     * Indique si la ressource a des disponibilités.
     */
    private boolean hasAvailability;

    /**
     * Indique si la ressource a des heures supplémentaires.
     */
    private boolean hasOvertime;

    /**
     * La date et l'heure de suppression de la ressource.
     */
    private LocalDateTime deletedAt;

    /**
     * Le salaire annuel brut de la ressource.
     */
    private BigDecimal ral;

    /**
     * Le montant supplémentaire de la ressource.
     */
    private BigDecimal extra;

    /**
     * Les avantages sociaux de la ressource.
     */
    private BigDecimal welfare;

    /**
     * Les primes de la ressource.
     */
    private BigDecimal premi;

    /**
     * Le montant alloué pour les dépenses de voiture de la ressource.
     */
    private BigDecimal auto;

    /**
     * La qualification de la ressource.
     */
    private String qualifica;

    /**
     * Le type de consultant de la ressource.
     */
    private String consulenteType;

    /**
     * L'identifiant de la société de la ressource.
     */
    private Integer companyId;

    /**
     * L'identifiant du superviseur de la ressource.
     */
    private Integer supervisorId;

    /**
     * Indique si la ressource a un profil horaire défini.
     */
    private boolean hasProfiloOrario;

    /**
     * Indique si la ressource peut être transférée.
     */
    private boolean hasTransfers;

    /**
     * Indique si la ressource est factice.
     */
    private boolean fake;

    /**
     * Indique si la ressource a des absences.
     */
    private boolean hasAbsences;

    /**
     * La date de fin du contrat de la ressource.
     */
    private Date dataFineRapporto;

    /**
     * Indique si la ressource a un profil vertical.
     */
    private boolean profiloVerticale;

    /**
     * La date du patron de la ressource.
     */
    private Date patronDate;

    /**
     * L'éducation de la ressource.
     */
    private String educational;

    /**
     * L'identifiant de la convention collective de la ressource.
     */
    private Integer ccnlDataId;

    /**
     * Le coût de l'entreprise pour la ressource.
     */
    private BigDecimal companyCost;

    /**
     * La lettre d'emploi de la ressource.
     */
    private String employmentLetter;

    /**
     * L'identifiant du plan horaire pour le lundi.
     */
    private Integer orarioLun;

    /**
     * L'identifiant du plan horaire pour le mardi.
     */
    private Integer orarioMar;

    /**
     * L'identifiant du plan horaire pour le mercredi.
     */
    private Integer orarioMer;

    /**
     * L'identifiant du plan horaire pour le jeudi.
     */
    private Integer orarioGio;

    /**
     * L'identifiant du plan horaire pour le vendredi.
     */
    private Integer orarioVen;

    /**
     * L'identifiant du plan horaire pour le samedi.
     */
    private Integer orarioSab;

    /**
     * L'identifiant du plan horaire pour le dimanche.
     */
    private Integer orarioDom;

    /**
     * L'IBAN de la ressource.
     */
    private String iban;

    /**
     * Indique si les dépenses sont activées pour la ressource.
     */
    private boolean enableExpenses;

    /**
     * Restituisce l'ID della risorsa.
     * @return L'ID della risorsa.
     */
    public int getId() {
        return id;
    }

    /**
     * Imposta l'ID della risorsa.
     * @param id L'ID della risorsa da impostare.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Restituisce la data di creazione della risorsa.
     * @return La data di creazione.
     */
    public LocalDateTime getCreateAt() {
        return createdAt;
    }

    /**
     * Imposta la data di creazione della risorsa.
     * @param createAt La data di creazione da impostare.
     */
    public void setCreateAt(LocalDateTime createAt) {
        this.createdAt = createAt;
    }

    /**
     * Restituisce la data dell'ultimo aggiornamento della risorsa.
     * @return La data dell'ultimo aggiornamento.
     */
    public LocalDateTime getUpdateAt() {
        return updatedAt;
    }

    /**
     * Imposta la data dell'ultimo aggiornamento della risorsa.
     * @param updateAt La data dell'ultimo aggiornamento da impostare.
     */
    public void setUpdateAt(LocalDateTime updateAt) {
        this.updatedAt = updateAt;
    }

    // Ripetere il pattern sopra per gli altri attributi...


    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public BigDecimal getCostMinimum() {
        return costMinimum;
    }

    public void setCostMinimum(BigDecimal costMinimum) {
        this.costMinimum = costMinimum;
    }

    public BigDecimal getCostMedium() {
        return costMedium;
    }

    public void setCostMedium(BigDecimal costMedium) {
        this.costMedium = costMedium;
    }

    public BigDecimal getCostMaximum() {
        return costMaximum;
    }

    public void setCostMaximum(BigDecimal costMaximum) {
        this.costMaximum = costMaximum;
    }

    public BigDecimal getCostReal() {
        return costReal;
    }

    public void setCostReal(BigDecimal costReal) {
        this.costReal = costReal;
    }

    public String getCodeFiscal() {
        return codFiscale;
    }

    public void setCodeFiscal(String codeFiscal) {
        this.codFiscale = codeFiscal;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public String getInquadramento() {
        return inquadramento;
    }

    public void setInquadramento(String inquadramento) {
        this.inquadramento = inquadramento;
    }

    public String getProfilioOrario() {
        return profiloOrario;
    }

    public void setProfilioOrario(String profilioOrario) {
        this.profiloOrario = profilioOrario;
    }

    public boolean isHasAvailability() {
        return hasAvailability;
    }

    public void setHasAvailability(boolean hasAvailability) {
        this.hasAvailability = hasAvailability;
    }

    public boolean isHasOvertime() {
        return hasOvertime;
    }

    public void setHasOvertime(boolean hasOvertime) {
        this.hasOvertime = hasOvertime;
    }

    public LocalDateTime getDeleteAt() {
        return deletedAt;
    }

    public void setDeleteAt(LocalDateTime deleteAt) {
        this.deletedAt = deleteAt;
    }

    public BigDecimal  getRal() {
        return ral;
    }

    public void setRal(BigDecimal  ral) {
        this.ral = ral;
    }

    public BigDecimal  getExtra() {
        return extra;
    }

    public void setExtra(BigDecimal  extra) {
        this.extra = extra;
    }

    public BigDecimal  getPremi() {
        return premi;
    }

    public void setPremi(BigDecimal  premi) {
        this.premi = premi;
    }

    public BigDecimal  getAuto() {
        return auto;
    }

    public void setAuto(BigDecimal  auto) {
        this.auto = auto;
    }

    public String getQualifica() {
        return qualifica;
    }

    public void setQualifica(String qualifica) {
        this.qualifica = qualifica;
    }

    public String getConsulenteType() {
        return consulenteType;
    }

    public void setConsulenteType(String consulenteType) {
        this.consulenteType = consulenteType;
    }
}

