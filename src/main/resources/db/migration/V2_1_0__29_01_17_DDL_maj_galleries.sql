/**
 * Script DDL d'ajout des la colonne description et source
 */

-- Description
ALTER TABLE gallery 
	ADD COLUMN description varchar(3000) NOT NULL DEFAULT ''
;

-- Source
ALTER TABLE gallery 
	ADD COLUMN source varchar(255)
;
