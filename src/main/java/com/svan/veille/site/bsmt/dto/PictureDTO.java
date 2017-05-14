/**
 *
 */
package com.svan.veille.site.bsmt.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;

/**
 * @author stephane 3 janv. 2015
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PictureDTO {

    // ------------ PK -----------------------------------------------------//

    private Long id;

    private String title;

    // ------------ Creation/update -----------------------------------------//

    private Calendar creationDate;

    private Calendar updateDate;

    // ------------ Getter/setter -------------------------------------------//
}
