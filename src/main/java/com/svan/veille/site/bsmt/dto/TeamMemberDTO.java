package com.svan.veille.site.bsmt.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TeamMemberDTO {

    // ------------ PK -----------------------------------------------------//

    private Long id;

    // ------------ Columns-------------------------------------------------//

    // Person
    private String forname;

    private String sexe;

    private Calendar birthDate;

    // Member
    private String nickName;

    private String gear;

    private String role;

    private String description;

    private String status;

    private Calendar membershipDate;

    private Calendar departureDate;

    private String likes;

    private String doesntlikes;

    // ------------ Creation/update -----------------------------------------//

    private Calendar creationDate;

    private Calendar updateDate;

    // ------------ Getter/setter -------------------------------------------//

}
