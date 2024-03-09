package it.cws.meta.cwsresourceservice.entities;

import java.util.Date;

/**
 * Représente une demande d'absence.
 */
public class AbsenceRequest {
    /** Identifiant de la demande d'absence. */
    private int id;

    /** Date de création de la demande d'absence. */
    private Date createdAt;

    /** Date de mise à jour de la demande d'absence. */
    private Date updatedAt;

    /** Identifiant de la ressource associée à la demande d'absence. */
    private int resourceId;

    /** Identifiant de la personne en charge de la demande d'absence. */
    private Integer managedBy;

    /** Date et heure de début de la demande d'absence. */
    private Date requestStart;

    /** Date et heure de fin de la demande d'absence. */
    private Date requestEnd;

    /** Statut de la demande d'absence. */
    private String status;

    /** Identifiant du travail associé à la demande d'absence. */
    private Integer jobId;

    /**
     * Constructeur par défaut de la classe AbsenceRequest.
     */
    public AbsenceRequest() {
    }

    // Getters et Setters

    /**
     * Obtient l'identifiant de la demande d'absence.
     *
     * @return L'identifiant de la demande d'absence.
     */
    public int getId() {
        return id;
    }

    /**
     * Définit l'identifiant de la demande d'absence.
     *
     * @param id L'identifiant de la demande d'absence.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtient la date de création de la demande d'absence.
     *
     * @return La date de création de la demande d'absence.
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * Définit la date de création de la demande d'absence.
     *
     * @param createdAt La date de création de la demande d'absence.
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    // Ajoutez des méthodes getter et setter pour chaque attribut de la classe AbsenceRequest...
}
