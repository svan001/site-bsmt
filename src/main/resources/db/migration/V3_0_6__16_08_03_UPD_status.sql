/**
 * Script UPDATE des membres depuis divers depart... zlatan / souffre / scarkrace
 */

-- Zlatan
UPDATE team_member 
SET	
	 status = 'A'
	 
WHERE nick_name = 'zlatan'
;
-- Souffre
UPDATE team_member 
SET	
	 status = 'A'
	 
WHERE nick_name = 'souFFre'
;
-- Shark
UPDATE team_member 
SET	
	 role = 'Opérateur', 
	 description = 'Opérateur de la team', 
	 status = 'M'
	 
WHERE nick_name = 'ScHark_-RaCe'
;
