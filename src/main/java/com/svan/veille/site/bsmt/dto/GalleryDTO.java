/**
 *
 */
package com.svan.veille.site.bsmt.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;
import java.util.List;

/**
 * @author stephane 3 janv. 2015
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GalleryDTO {

    // ------------ PK -----------------------------------------------------//

    private Long id;

    private String title;

    private String description;

    private String source;

    private List<PictureDTO> pictures;

    // ------------ Creation/update -----------------------------------------//

    private Calendar creationDate;

    private Calendar updateDate;

    // ------------ Getter/setter -------------------------------------------//

}
