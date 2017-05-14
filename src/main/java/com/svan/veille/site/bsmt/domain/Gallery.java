/**
 *
 */
package com.svan.veille.site.bsmt.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "gallery")
public class Gallery {

    // ------------ PK -----------------------------------------------------//

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name = "title", nullable = false, length = 255)
    private String title;

    @Column(name = "description", nullable = false, length = 3000)
    private String description;

    @Column(name = "source", length = 255)
    private String source;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "gallery")
    private List<Picture> pictures;

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
