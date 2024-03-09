package it.cws.meta.cwsresourceservice.dto;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class ResourceDtoResponse {

    private Long id;


    private Date createdAt;

    private Date updatedAt;

    private Long userId;


    private BigDecimal costMinimum;

    private BigDecimal costMedium;


    private BigDecimal costMaximum;


    private BigDecimal costReal;


    private Long businessUnitId;


    private String codFiscale;


    private String matricola;


    private Date dataInizioRapporto;


    private String inquadramento;


    private String profiloOrario;


    private boolean hasAvailability;


    private boolean hasOvertime;

    private Date deletedAt;

    private BigDecimal ral;

    private BigDecimal extra;

    private BigDecimal welfare;

    private BigDecimal premi;


    private BigDecimal auto;

    private String qualifica;

    private String consulenteType;


    private Long companyId;

    private Long supervisorId;

    private boolean hasProfiloOrario;

    private boolean hasTransfers;

    private boolean fake;

    private boolean hasAbsences;

    private Date dataFineRapporto;

    private boolean profiloVerticale;
    private Date patronDate;

    private String educational;


    private Long ccnlDataId;


    private BigDecimal companyCost;


    private String employmentLetter;

    private Long orarioLun;

    private Long orarioMar;

    private Long orarioMer;

    private Long orarioGio;

    private Long orarioVen;

    private Long orarioSab;

    private Long orarioDom;

    private String iban;

    private boolean enableExpenses;

    // Getters and setters
}
