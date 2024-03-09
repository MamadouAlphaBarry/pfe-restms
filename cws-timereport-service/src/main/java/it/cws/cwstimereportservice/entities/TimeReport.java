package it.cws.cwstimereportservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * Représente un rapport temporel.
 */
@Entity
public class TimeReport {
    /** Identifiant du rapport temporel. */
    @Id
    private int id;

    /** Date de création du rapport temporel. */
    private LocalDateTime createdAt;

    /** Date de mise à jour du rapport temporel. */
    private LocalDateTime updatedAt;

    /** Date du rapport temporel. */
    private LocalDateTime date;

    /** Nombre de minutes rapportées. */
    private int minutes;

    /** Nombre d'heures supplémentaires. */
    private int overtime;

    /** Description du rapport temporel. */
    private String description;

    /** Type d'heures supplémentaires. */
    private int overtimeType;

    /** Statut du rapport temporel. */
    private String status;

    /** Identifiant de la ressource associée au rapport temporel. */
    private int resourceId;

    /** Identifiant du travail associé au rapport temporel. */
    private int jobId;

    /** Temps de déplacement rapporté. */
    private int traveltime;

    /** Indique si le travail a été effectué hors site. */
    private boolean offsite;

    /** Identifiant de la personne en charge du rapport temporel. */
    private int managedBy;

    /** Indique si le rapport a été renversé. */
    private boolean overturned;

    /** Disponibilité du rapport temporel. */
    private int availability;

    /**
     * Constructeur par défaut de la classe TimeReport.
     */
    public TimeReport() {
    }

    // Getters et Setters

    // Ajoutez les méthodes getter et setter pour chaque attribut de la classe TimeReport ici...
}

