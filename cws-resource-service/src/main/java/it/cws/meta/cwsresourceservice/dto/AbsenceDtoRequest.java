package it.cws.meta.cwsresourceservice.dto;

import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class AbsenceDtoRequest {
    /** Identifiant de la demande d'absence. */
    private int id;

    /** Date de création de la demande d'absence. */
    private LocalDateTime createdAt;

    /** Date de mise à jour de la demande d'absence. */
    private LocalDateTime updatedAt;

    /** Identifiant de la ressource associée à la demande d'absence. */
    private int resourceId;

    /** Identifiant de la personne en charge de la demande d'absence. */
    private Integer managedBy;

    /** Date et heure de début de la demande d'absence. */
    private LocalDateTime requestStart;

    /** Date et heure de fin de la demande d'absence. */
    private LocalDateTime requestEnd;

    /** Statut de la demande d'absence. */
    private String status;

    /** Identifiant du travail associé à la demande d'absence. */
    private Integer jobId;

}
