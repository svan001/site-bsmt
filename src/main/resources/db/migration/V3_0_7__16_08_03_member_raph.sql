/**
 * Script INSERT Member : predateur
 */

-- Member
INSERT INTO team_member 
(	nick_name,
	forname, 
	sexe, 
	role, 
	birth_date, 
	description, 
	gear, 
	status, 
	likes, 
	doesntlikes, 
	membership_date, 
	creation_date
	) 
VALUES (
'raph',
'Raphaël', 
'M', -- M ou F
'Opérateur', 
'1990-09-18', 
'Paintballer débutant', 
'A5 / TCR',
'P', -- P / M / A / L
'', 
'', 
'2016-04-25', -- membership_date
sysdate()); -- creation_date
