/**
 * Script UPDATE Member : passe ludo/tchetchene en amis car plus vraiment présent...
 */

-- Member
UPDATE team_member 
SET	
	status = 'A'
	 
WHERE nick_name = 'tchetchene'
;
