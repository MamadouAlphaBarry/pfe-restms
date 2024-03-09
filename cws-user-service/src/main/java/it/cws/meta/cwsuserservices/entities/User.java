package it.cws.meta.cwsuserservices.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Rappresenta un utente.
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Table(name = "users")
@Component

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @NotEmpty(message ="user.name.NotBlank")
    @Size(min=3, max=20, message="user.name.Size")
    private String name;
    @NotBlank(message = "user.email.NotBlank")
    @Email(message = "user.email.Email")
    private String email;
   // @NotBlank(message = "user.password.NotBlank")
  //  @Size(message = "user.password.Size")
    private String password;
    private String rememberToken;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

    private String username;
    @NotNull(message = "{user.firstName.NotNull}")
    @Size(message = "{user.firstName.Size}")
    private String firstName;
    @NotNull(message = "user.lastName.NotNull")
    @Size(message = "{user.lastName.Size}")
    private String lastName;
   // @NotBlank(message = "")
    @Size(min = 2,message = "user.initials.Size")
    @NotNull(message = "user.initials.NotNull")
    private String initials;
    private String picture;
    private String country;
    @NotNull(message = "user.address.NotNull")
    @Size(message = "user.address.Size")
    private String address;
   // @NotBlank(message = "")
    private String postalCode;
   // @NotBlank(message = "")
    private String sede;
    private String phone;
    private String mobile;
    private String city;
    private String title;
    private String state;
    private String ipphone;
    @NotNull(message = "user.ipphone.NotNull")
    @Size(message = "user.displayName.Size")
    private String displayName;
    private boolean isAdmin;
    private boolean isAd;
    /**
     * Restituisce l'ID dell'utente.
     * @return L'ID dell'utente.
     */
    public int getId() {
        return id;
    }

    /**
     * Imposta l'ID dell'utente.
     * @param id L'ID dell'utente da impostare.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Restituisce il nome dell'utente.
     * @return Il nome dell'utente.
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il nome dell'utente.
     * @param name Il nome dell'utente da impostare.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Restituisce l'indirizzo email dell'utente.
     * @return L'indirizzo email dell'utente.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Imposta l'indirizzo email dell'utente.
     * @param email L'indirizzo email dell'utente da impostare.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Restituisce la password dell'utente.
     * @return La password dell'utente.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Imposta la password dell'utente.
     * @param password La password dell'utente da impostare.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Restituisce il nome dell'utente.
     * @return Il nome dell'utente.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Imposta il nome dell'utente.
     * @param firstName Il nome dell'utente da impostare.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Restituisce il cognome dell'utente.
     * @return Il cognome dell'utente.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Imposta il cognome dell'utente.
     * @param lastName Il cognome dell'utente da impostare.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Restituisce le iniziali del nome dell'utente.
     * @return Le iniziali del nome dell'utente.
     */
    public String getInitials() {
        return initials;
    }

    /**
     * Imposta le iniziali del nome dell'utente.
     * @param initials Le iniziali del nome dell'utente da impostare.
     */
    public void setInitials(String initials) {
        this.initials = initials;
    }

    /**
     * Restituisce l'immagine profilo dell'utente.
     * @return L'immagine profilo dell'utente.
     */
    public String getPicture() {
        return picture;
    }

    /**
     * Imposta l'immagine profilo dell'utente.
     * @param picture L'immagine profilo dell'utente da impostare.
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * Restituisce il paese dell'utente.
     * @return Il paese dell'utente.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Imposta il paese dell'utente.
     * @param country Il paese dell'utente da impostare.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Restituisce l'indirizzo dell'utente.
     * @return L'indirizzo dell'utente.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Imposta l'indirizzo dell'utente.
     * @param address L'indirizzo dell'utente da impostare.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Restituisce il codice postale dell'utente.
     * @return Il codice postale dell'utente.
     */
    public String getPostCode() {
        return postalCode;
    }

    /**
     * Imposta il codice postale dell'utente.
     * @param postCode Il codice postale dell'utente da impostare.
     */
    public void setPostCode(String postCode) {
        this.postalCode = postCode;
    }

    /**
     * Restituisce la sede dell'utente.
     * @return La sede dell'utente.
     */
    public String getSede() {
        return sede;
    }

    /**
     * Imposta la sede dell'utente.
     * @param sede La sede dell'utente da impostare.
     */
    public void setSede(String sede) {
        this.sede = sede;
    }

    /**
     * Restituisce il numero di telefono dell'utente.
     * @return Il numero di telefono dell'utente.
     */
    public String getPhone(){
    return  this.phone;
    }
    /**
     * Impposta il numero di telefono dell'utente.
     * @return Il numero di telefono dell'utente.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Restituisce il numero di telefono aziendale dell'utente.
     * @return Il numero di telefono aziendale dell'utente.
     */
    public String getMobile() {
        return mobile;
    }


    /**
     * Imposta il numero di telefono aziendale dell'utente.
     * @return Il numero di telefono aziendale dell'utente.
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


   /**
     * Restituisce la città  dell'utente.
     * @return la citta dell'utente.
     */
    public String getCity() {
        return city;
    }

    /**
     * IMposta la città  dell'utente.
     * @return la citta dell'utente.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Restituisce il titolo  lavorativo  dell'utente.
     * @return il titol dell'utente.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Imposta il titolo  lavorativo  dell'utente.
     * @return il titol dell'utente.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Restituisce il paese dell'utente
     * @return il Paese
     */
    public String getState() {
        return state;
    }

    /**
     * Imposta lo stato dell'utente
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    public String getIpphone() {
        return ipphone;
    }

    public void setIpphone(String ipphone) {
        this.ipphone = ipphone;
    }

    /**
     * Imposta il nome visualizzato dell'utente
     *
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Imposta il nome visualizzato dell'utente
     * @param displayName
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public boolean isIs_admin() {
        return isAdmin;
    }

    public void setIs_admin(boolean is_admin) {
        this.isAdmin = is_admin;
    }

    public boolean isIs_ad() {
        return isAd;
    }

    public void setIs_ad(boolean is_ad) {
        this.isAd = is_ad;
    }

    public LocalDateTime getCreateAt() {
        return createdAt;
    }

    /**
     * Imposta automaticamente la data di Creazione dell'user al mommento della creazione
     */
    @PrePersist
    public void setCreateAt() {
        this.createdAt = LocalDateTime.now();
    }

    public LocalDateTime getUpdateAt() {
        return updatedAt;
    }

    /**
     * Imposta automaticamente la data di modificazione dell'user quando le informazioni dell'user vengono modificati
     */
    @PreUpdate
    public void setUpdateAt() {
        this.updatedAt = LocalDateTime.now();
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    /**
     * Imposta automaticamente la data di Concellazione dell'user quando viene cancellato
     */
    @PreRemove
    public void setDeletedAt() {
        this.deletedAt = deletedAt;
    }
}

