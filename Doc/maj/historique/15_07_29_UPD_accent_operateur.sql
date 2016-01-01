/**
 * Script de maj des operateur pour mettre un 'é' à tout les role "opérateur"
 */

-- Member
update team_member 
set role = 'Opérateur'
where role = 'Operateur'
;