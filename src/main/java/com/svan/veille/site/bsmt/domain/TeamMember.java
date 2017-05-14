package com.svan.veille.site.bsmt.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "team_member")
public class TeamMember {

    // ------------ PK -----------------------------------------------------//

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    // ------------ Columns-------------------------------------------------//

    // Person
    @Column(name = "forname", nullable = false, length = 255)
    private String forname;

    @Column(name = "sexe", nullable = false, length = 1)
    private String sexe;

    @Column(name = "birth_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar birthDate;

    // Member
    @Column(name = "nick_name", nullable = false, length = 255)
    private String nickName;

    @Column(name = "gear", nullable = false, length = 255)
    private String gear;

    @Column(name = "role", nullable = false, length = 255)
    private String role;

    @Column(name = "description", nullable = false, length = 5000)
    private String description;

    @Column(name = "status", nullable = false, length = 1)
    private String status;

    @Column(name = "membership_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar membershipDate;

    @Column(name = "departure_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar departureDate;

    @Column(name = "likes", nullable = false, length = 255)
    private String likes;

    @Column(name = "doesntlikes", nullable = false, length = 255)
    private String doesntlikes;

    // ------------ Creation/update -----------------------------------------//

    @Column(name = "creation_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar creationDate;

    @Column(name = "update_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar updateDate;

    @PrePersist
    private void prePersist() {
        creationDate = GregorianCalendar.getInstance();
    }

    @PreUpdate
    private void preUpdate() {
        updateDate = GregorianCalendar.getInstance();
    }

    // ------------ Getter/setter -------------------------------------------//
}
