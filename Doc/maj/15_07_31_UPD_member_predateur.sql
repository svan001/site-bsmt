/**
 * Script UPDATE Member : Maj profil predateur 
 * 
 * "Message :
 * Sujet: Re: presentation   Hier à 22:10	Sélectionner/Désélectionner multi-citation Répondre en citant
 * Date de naissance 29 09 1987
 * J aime le fairplay
 * n aime pas les prises de tete "
 */

-- Member
UPDATE team_member 
SET	
	-- nick_name = '',
	-- forname = '', 
	-- sexe = '', -- M ou F
	-- role = '', 
	 birth_date = '1987-09-29', 
	-- description = '', 
	-- gear = '', 
	-- status = '', -- P / M / A / L
	 likes = 'Le fairplay', 
	 doesntlikes = 'Les prises de tête' 
	-- membership_date = '2015-01-30'
	 
WHERE nick_name = 'predateur'
;
