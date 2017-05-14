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
public class NewsDTO {
    // ------------ PK -----------------------------------------------------//

    private Long id;

    // ------------ Columns-------------------------------------------------//

    private String title;

    private String author;

    private String content;

    // ------------ Creation/update -----------------------------------------//

    private Calendar creationDate;

    private Calendar updateDate;

    // ------------ Getter/setter -------------------------------------------//
}
