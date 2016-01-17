/**
 * Script UPDATE Member : Passage de predateur en membre 
 */

-- Member
UPDATE team_member 
SET	
	 status = 'M'
	 
WHERE nick_name = 'predateur'
;
