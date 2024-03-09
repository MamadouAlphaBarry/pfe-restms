package it.cws.meta.cwsuserservices.entities;

import java.time.LocalDate;


public class Resource {
    private int id;
    private LocalDate createAt;
    private LocalDate updateAte;
    private int userId;
    private double cost_minimum;
    private double cost_medium;
    private double cost_maximum;
    private double cost_real;
    private String codeFiscal;
    private String matricola;
    private String inquadramento;
    private  String profilioOrario;
    private boolean hasAvailabilty;
    private boolean hasOvertime;
    private LocalDate deleteteAt;
    private  double ral;
    private  double extra;
    private double premi;
    private double auto;
    private String qualifica;
    private String consulenteType;
}
