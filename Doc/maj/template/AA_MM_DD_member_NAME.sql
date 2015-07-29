/**
 * Script INSERT Member : predateur
 */

-- Member
insert into team_member 
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
values (
'predateur',
'Jean charles', 
'M', -- M ou F
'Opérateur', 
'1988-10-18', 
'Paintballer depuis de nombreuses années, ex Tschuss paint', 
'TM15',
'P', -- P / M / A / L
'', 
'', 
'2015-01-30', -- membership_date
sysdate()); -- creation_date
