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
'tof raider',
'Christophe', 
'M', -- M ou F
'Opérateur', 
'1974-03-25', 
'Paintballer depuis de nombreuses années.', 
'TM7',
'P', -- P / M / A / L
'', 
'', 
'2016-01-16', -- membership_date
sysdate()); -- creation_date
