package it.cws.cwsjobservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import java.time.LocalDateTime;
import java.util.Date;

/**
 * Représente un travail.
 */

@Entity
public class Job {
    /** Identifiant du travail. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** Date de création du travail. */
    private LocalDateTime createdAt;

    /** Date de mise à jour du travail. */
    private LocalDateTime updatedAt;

    /** Nom du travail. */
    private String name;

    /** Code du travail. */
    private String code;

    /** Description du travail. */
    private String description;

    /** Date de début du travail. */
    private Date startDate;

    /** Date de fin du travail. */
    private Date endDate;

    /** Statut du travail. */
    private String status;

    /** Identifiant du travail associé. */
    private int jobId;

    /** Identifiant du client associé au travail. */
    private int customerId;

    /** Identifiant de l'activité associée au travail. */
    private int activityId;

    /** Identifiant de l'unité opérationnelle associée au travail. */
    private int businessUnitId;

    /** Identifiant du gestionnaire de projet associé au travail. */
    private int pmId;

    /** Alias du travail. */
    private String alias;

    /** Date de suppression du travail. */
    private LocalDateTime deletedAt;

    /** Indique si le travail est interne. */
    private boolean isInternal;

    /** Attribut 1 du travail. */
    private String attr1;

    /** Attribut 2 du travail. */
    private String attr2;

    /** Identifiant du centre de coût associé au travail. */
    private int costCenterId;

    /** Indique si le travail est fermé. */
    private boolean isClosed;

    /** Date de fermeture du travail. */
    private Date closedAt;

    /** Indique si le travail est renversé. */
    private boolean isOverturn;

    /** Indique si le travail est ancien. */
    private boolean old;

    /** Indique si le travail a une disponibilité. */
    private boolean hasAvailability;

    /** Coût de disponibilité du travail. */
    private double availabilityCost;

    /** Indique si le travail doit ajouter des revenus TM. */
    private boolean addTmRevenues;

    /** Note sur le travail. */
    private String note;

    /** Indique si le travail est activé. */
    private boolean isEnabled;

    /** Date d'activation du travail. */
    private Date enabledAt;

    /** Identifiant de la personne ayant activé le travail. */
    private int enabledBy;

    /** Indique si le travail est quotidien. */
    private boolean isDaily;

    /** Indique si le travail est direct. */
    private boolean isDirect;

    /** Indique si le travail est de support. */
    private boolean isSupport;

    /** Salaire du travail. */
    private double sal;

    /** Indique si le travail est fermé hebdomadairement. */
    private boolean isWeeklyClosed;

    /**
     * Constructeur par défaut de la classe Job.
     */
    public Job() {
    }

    /**
     * Renvoie l'ID du travail.
     * @return L'ID du travail.
     */
    public Long getId() {
        return id;
    }

    /**
     * Définit l'ID du travail.
     * @param id L'ID du travail à définir.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Renvoie la date de création du travail.
     * @return La date de création du travail.
     */
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Définit la date de création du travail.
     * @param createdAt La date de création du travail à définir.
     */
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Renvoie la date de mise à jour du travail.
     * @return La date de mise à jour du travail.
     */
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Définit la date de mise à jour du travail.
     * @param updatedAt La date de mise à jour du travail à définir.
     */
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Renvoie le nom du travail.
     * @return Le nom du travail.
     */
    public String getName() {
        return name;
    }

    /**
     * Définit le nom du travail.
     * @param name Le nom du travail à définir.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Renvoie le code du travail.
     * @return Le code du travail.
     */
    public String getCode() {
        return code;
    }

    /**
     * Définit le code du travail.
     * @param code Le code du travail à définir.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Renvoie la description du travail.
     * @return La description du travail.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Définit la description du travail.
     * @param description La description du travail à définir.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Renvoie la date de début du travail.
     * @return La date de début du travail.
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Définit la date de début du travail.
     * @param startDate La date de début du travail à définir.
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * Renvoie la date de fin du travail.
     * @return La date de fin du travail.
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Définit la date de fin du travail.
     * @param endDate La date de fin du travail à définir.
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * Renvoie le statut du travail.
     * @return Le statut du travail.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Définit le statut du travail.
     * @param status Le statut du travail à définir.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Renvoie l'ID du travail associé.
     * @return L'ID du travail associé.
     */
    public int getJobId() {
        return jobId;
    }

    /**
     * Définit l'ID du travail associé.
     * @param jobId L'ID du travail associé à définir.
     */
    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    /**
     * Renvoie l'identifiant du client associé.
     * @return L'identifiant du client associé.
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Définit l'identifiant du client associé.
     * @param customerId L'identifiant du client associé à définir.
     */
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }


    /**
     * Renvoie l'identifiant de l'activité associée au travail.
     * @return L'identifiant de l'activité associée au travail.
     */
    public int getActivityId() {
        return activityId;
    }

    /**
     * Définit l'identifiant de l'activité associée au travail.
     * @param activityId L'identifiant de l'activité associée au travail à définir.
     */
    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    /**
     * Renvoie l'identifiant de l'unité commerciale associée au travail.
     * @return L'identifiant de l'unité commerciale associée au travail.
     */
    public int getBusinessUnitId() {
        return businessUnitId;
    }

    /**
     * Définit l'identifiant de l'unité commerciale associée au travail.
     * @param businessUnitId L'identifiant de l'unité commerciale associée au travail à définir.
     */
    public void setBusinessUnitId(int businessUnitId) {
        this.businessUnitId = businessUnitId;
    }

    /**
     * Renvoie l'identifiant du chef de projet associé au travail.
     * @return L'identifiant du chef de projet associé au travail.
     */
    public int getPmId() {
        return pmId;
    }

    /**
     * Définit l'identifiant du chef de projet associé au travail.
     * @param pmId L'identifiant du chef de projet associé au travail à définir.
     */
    public void setPmId(int pmId) {
        this.pmId = pmId;
    }

    /**
     * Renvoie l'alias du travail.
     * @return L'alias du travail.
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Définit l'alias du travail.
     * @param alias L'alias du travail à définir.
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * Renvoie la date de suppression du travail.
     * @return La date de suppression du travail.
     */
    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    /**
     * Définit la date de suppression du travail.
     * @param deletedAt La date de suppression du travail à définir.
     */
    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    /**
     * Indique si le travail est interne.
     * @return Vrai si le travail est interne, faux sinon.
     */
    public boolean isInternal() {
        return isInternal;
    }

    /**
     * Définit si le travail est interne.
     * @param internal Vrai si le travail est interne, faux sinon.
     */
    public void setInternal(boolean internal) {
        isInternal = internal;
    }

    /**
     * Renvoie l'attribut 1 du travail.
     * @return L'attribut 1 du travail.
     */
    public String getAttr1() {
        return attr1;
    }

    /**
     * Définit l'attribut 1 du travail.
     * @param attr1 L'attribut 1 du travail à définir.
     */
    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    /**
     * Renvoie l'attribut 2 du travail.
     * @return L'attribut 2 du travail.
     */
    public String getAttr2() {
        return attr2;
    }

    /**
     * Définit l'attribut 2 du travail.
     * @param attr2 L'attribut 2 du travail à définir.
     */
    public void setAttr2(String attr2) {
        this.attr2 = attr2;
    }

    /**
     * Renvoie l'identifiant du centre de coût associé au travail.
     * @return L'identifiant du centre de coût associé au travail.
     */
    public int getCostCenterId() {
        return costCenterId;
    }

    /**
     * Définit l'identifiant du centre de coût associé au travail.
     * @param costCenterId L'identifiant du centre de coût associé au travail à définir.
     */
    public void setCostCenterId(int costCenterId) {
        this.costCenterId = costCenterId;
    }

    /**
     * Indique si le travail est clos.
     * @return Vrai si le travail est clos, faux sinon.
     */
    public boolean isClosed() {
        return isClosed;
    }

    /**
     * Définit si le travail est clos.
     * @param closed Vrai si le travail est clos, faux sinon.
     */
    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    /**
     * Renvoie la date de clôture du travail.
     * @return La date de clôture du travail.
     */
    public Date getClosedAt() {
        return closedAt;
    }

    /**
     * Définit la date de clôture du travail.
     * @param closedAt La date de clôture du travail à définir.
     */
    public void setClosedAt(Date closedAt) {
        this.closedAt = closedAt;
    }

    /**
     * Indique si le travail est renversé.
     * @return Vrai si le travail est renversé, faux sinon.
     */
    public boolean isOverturn() {
        return isOverturn;
    }

    /**
     * Définit si le travail est renversé.
     * @param overturn Vrai si le travail est renversé, faux sinon.
     */
    public void setOverturn(boolean overturn) {
        isOverturn = overturn;
    }

    /**
     * Indique si le travail est ancien.
     * @return Vrai si le travail est ancien, faux sinon.
     */
    public boolean isOld() {
        return old;
    }

    /**
     * Définit si le travail est ancien.
     * @param old Vrai si le travail est ancien, faux sinon.
     */
    public void setOld(boolean old) {
        this.old = old;
    }

    /**
     * Indique si le travail a une disponibilité.
     * @return Vrai si le travail a une disponibilité, faux sinon.
     */
    public boolean isHasAvailability() {
        return hasAvailability;
    }

    /**
     * Définit si le travail a une disponibilité.
     * @param hasAvailability Vrai si le travail a une disponibilité, faux sinon.
     */
    public void setHasAvailability(boolean hasAvailability) {
        this.hasAvailability = hasAvailability;
    }

    /**
     * Renvoie le coût de disponibilité du travail.
     * @return Le coût de disponibilité du travail.
     */
    public double getAvailabilityCost() {
        return availabilityCost;
    }

    /**
     * Définit le coût de disponibilité du travail.
     * @param availabilityCost Le coût de disponibilité du travail à définir.
     */
    public void setAvailabilityCost(double availabilityCost) {
        this.availabilityCost = availabilityCost;
    }

    /**
     * Indique si les revenus du gestionnaire de projet doivent être ajoutés.
     * @return Vrai si les revenus du gestionnaire de projet doivent être ajoutés, faux sinon.
     */
    public boolean isAddTmRevenues() {
        return addTmRevenues;
    }

    /**
     * Définit si les revenus du gestionnaire de projet doivent être ajoutés.
     * @param addTmRevenues Vrai si les revenus du gestionnaire de projet doivent être ajoutés, faux sinon.
     */
    public void setAddTmRevenues(boolean addTmRevenues) {
        this.addTmRevenues = addTmRevenues;
    }

    /**
     * Renvoie la note du travail.
     * @return La note du travail.
     */
    public String getNote() {
        return note;
    }

    /**
     * Définit la note du travail.
     * @param note La note du travail à définir.
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * Indique si le travail est activé.
     * @return Vrai si le travail est activé, faux sinon.
     */
    public boolean isEnabled() {
        return isEnabled;
    }

    /**
     * Définit si le travail est activé.
     * @param enabled Vrai si le travail est activé, faux sinon.
     */
    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    /**
     * Renvoie la date d'activation du travail.
     * @return La date d'activation du travail.
     */
    public Date getEnabledAt() {
        return enabledAt;
    }

    /**
     * Définit la date d'activation du travail.
     * @param enabledAt La date d'activation du travail à définir.
     */
    public void setEnabledAt(Date enabledAt) {
        this.enabledAt = enabledAt;
    }

    /**
     * Renvoie l'identifiant de l'utilisateur qui a activé le travail.
     * @return L'identifiant de l'utilisateur qui a activé le travail.
     */
    public int getEnabledBy() {
        return enabledBy;
    }

    /**
     * Définit l'identifiant de l'utilisateur qui a activé le travail.
     * @param enabledBy L'identifiant de l'utilisateur qui a activé le travail à définir.
     */
    public void setEnabledBy(int enabledBy) {
        this.enabledBy = enabledBy;
    }

    /**
     * Indique si le travail est quotidien.
     * @return Vrai si le travail est quotidien, faux sinon.
     */
    public boolean isDaily() {
        return isDaily;
    }

    /**
     * Définit si le travail est quotidien.
     * @param daily Vrai si le travail est quotidien, faux sinon.
     */
    public void setDaily(boolean daily) {
        isDaily = daily;
    }

    /**
     * Indique si le travail est direct.
     * @return Vrai si le travail est direct, faux sinon.
     */
    public boolean isDirect() {
        return isDirect;
    }

    /**
     * Définit si le travail est direct.
     * @param direct Vrai si le travail est direct, faux sinon.
     */
    public void setDirect(boolean direct) {
        isDirect = direct;
    }

    /**
     * Indique si le travail est de support.
     * @return Vrai si le travail est de support, faux sinon.
     */
    public boolean isSupport() {
        return isSupport;
    }

    /**
     * Définit si le travail est de support.
     * @param support Vrai si le travail est de support, faux sinon.
     */
    public void setSupport(boolean support) {
        isSupport = support;
    }

    /**
     * Renvoie le salaire du travail.
     * @return Le salaire du travail.
     */
    public double getSal() {
        return sal;
    }

    /**
     * Définit le salaire du travail.
     * @param sal Le salaire du travail à définir.
     */
    public void setSal(double sal) {
        this.sal = sal;
    }

    /**
     * Indique si le travail est fermé de manière hebdomadaire.
     * @return Vrai si le travail est fermé de manière hebdomadaire, faux sinon.
     */
    public boolean isWeeklyClosed() {
        return isWeeklyClosed;
    }

    /**
     * Définit si le travail est fermé de manière hebdomadaire.
     * @param weeklyClosed Vrai si le travail est fermé de manière hebdomadaire, faux sinon.
     */
    public void setWeeklyClosed(boolean weeklyClosed) {
        isWeeklyClosed = weeklyClosed;
    }

}
