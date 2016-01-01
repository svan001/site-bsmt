/**
 * ## TODO :
 * 
 * 1. __NICK_NAME__ : pseudo du joueur 
 * 2. Compléter le profil
 * 3. Penser a ajouter une photo !!
 */

/**
 * Script INSERT Member : __NICK_NAME__
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
'__NICK_NAME__',
'Forname', 
'sexe', -- M ou F
'role', 
'1988-10-18', 
'description', 
'gear',
'status', -- P / M / A / L
'likes', 
'doesntlikes', 
sysdate(), -- membership_date
sysdate()); -- creation_date
