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

/**
 * @author stephane 3 janv. 2015
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "picture")
public class Picture {

    // ------------ PK -----------------------------------------------------//

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    @Column(name = "title", nullable = false, length = 255)
    private String title;

    @ManyToOne()
    @JoinColumn(name = "gallery", nullable = false)
    private Gallery gallery;

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
