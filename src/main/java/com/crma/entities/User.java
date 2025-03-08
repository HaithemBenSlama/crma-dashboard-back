package com.crma.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "Users")
@Data
@NoArgsConstructor
public class User {

    @Id
    @Column(name = "Matricule", length = 20, nullable = false, unique = true)
    private String matricule;

    @Column(name = "Email", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name = "Mot_de_Passe", length = 255, nullable = false)
    private String motDePasse;

    @Column(name = "Nom", length = 50, nullable = false)
    private String nom;

    @Column(name = "Prenom", length = 50, nullable = false)
    private String prenom;

    @Column(name = "Numero_telephone", length = 8, nullable = false)
    private String numeroTelephone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    @Column(name = "Date_Creation", nullable = false)
    private LocalDateTime dateCreation;

    @Column(name = "Date_Derniere_Connexion")
    private LocalDateTime dateDerniereConnexion;

    @Column(name = "Is_Email_Verified", nullable = false)
    private boolean isEmailVerified = false;

    @Column(name = "Is_Blocked", nullable = false)
    private boolean isBlocked = false;

    @Column(name = "Failed_Attempts", nullable = false)
    private int failedAttempts = 0;

    @Column(name = "Block_Until")
    private LocalDateTime blockUntil;

    @Column(name = "OTP_Code", length = 6)
    private String otpCode;

    @Column(name = "OTP_Expiration")
    private LocalDateTime otpExpiration;

    @Column(name = "Is_OTP_Enabled", nullable = false)
    private boolean isOtpEnabled = false;
}
