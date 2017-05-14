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
@Table(name = "news")
public class News {
    // ------------ PK -----------------------------------------------------//

    @Id
    @Column(name = "id")
    @GeneratedValue
    private Long id;

    // ------------ Columns-------------------------------------------------//

    @Column(name = "title", nullable = false, length = 255)
    private String title;

    @Column(name = "author", nullable = false, length = 255)
    private String author;

    @Column(name = "content", nullable = false, length = 5000)
    private String content;

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
