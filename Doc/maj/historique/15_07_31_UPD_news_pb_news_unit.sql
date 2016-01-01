/******************************************************************************
 * Script UPDATE News : 
 ******************************************************************************/

--NEWS
UPDATE news 
SET 
-- author = '',
-- title = '', 
-- creation_date = '', 
 content = 
 '<p>
La black shark milsim team remercie les The UNIT MilsimTeam pour leur accueil aujourdhui à la grotte où nous avons passer une journée terrible, grand merci a eux !! 
</p>
<p>Merci aussi a toutes les teams présente : TASK FORCE 141, Toxico2 Paintball Milsim, LcDeux, FRAP Milsim, Eagle One Paintball Milsim, les spectres et zendoli grand plaisir d''avoir revue certain est d''en avoir rencontré d''autre.
</p>
<p>
En espérant tous vous revoir bientot !
</p>
<img alt="Gallery1" src="api/gallery/4/picture/the_unit_fev" class="thumbnail img-rounded img-responsive" />
' 
WHERE
	-- id =   
	title = 'Journée à la grotte !' 
;

/******************************************************************************
 * Ajout de la photo en local au lieu de FB
 ******************************************************************************/

insert into picture (gallery, title, creation_date) values (4, 'the_unit_fev', sysdate());




