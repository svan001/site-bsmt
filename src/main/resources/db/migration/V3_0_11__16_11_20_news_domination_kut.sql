/**
 * ## TODO :
 * 
 * 1. Domination KUT : titre de la news
 * 2. 2016-11-20 : '2016-MM-DD' date le news (danger du sysdate ! )
 * 3. 12 : ID de la gallery (last + 1)
 * 4. Domination KUT : titre de la gallery
 * 5. end : photo présente en fin de news
 * 6. Compléter la Galerie Domination KUT du 20/11/2016 et  BSMT, Les Black Skull si une source a remercier
 * 7. Compléter les pictures
 * 8. Compléter la news
 */

/**
 * Script INSERT News : Domination KUT
 */

-- Gallerie
INSERT INTO gallery (id, title, description, source, creation_date) VALUES (12, 'Domination KUT', 'Galerie Domination KUT du 20/11/2016', 'BSMT, Les Black Skull', sysdate());

-- Pictures
INSERT INTO picture (gallery, title, creation_date) VALUES (12, 'raph_pierre', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (12, 'team', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (12, 'bsmt', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (12, 'end', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (12, 'coupe', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (12, 'coupe_zoom', sysdate());

--NEWS
INSERT INTO news 
(	author,
	title, 
	creation_date, 
	content) 
VALUES 
(	'Svan',
	'Domination KUT', 
	'2016-11-20', 
	'
<p>
Journée Domination chez les KUT ce week end, merci à toutes les teams présentes :
</p>
<ul>
 <li><a href="https://www.facebook.com/KUT-milsim-1598370033726007/">KUT milsim</a></li>
  <li><a href="https://www.facebook.com/LesBlackSkull/">Les Black Skull</a></li>
  <li><a href="https://www.facebook.com/TheWatchMilsim/">The Watch Milsim</a></li>
   <li><a href="https://www.facebook.com/Toxico2.Paintball.Milsim/">Toxico2 Paintball Milsim</a></li>
    <li><a href="https://www.facebook.com/Team-L%C3%A9gion-62-Milsim-408845842542115/">Team Légion-62 Milsim</a></li>
     <li><a href="https://www.facebook.com/Eagle-One-Paintball-Milsim-738936899529382/">Eagle One Paintball Milsim</a></li>
</ul>
<p>Une bonne journée dont la BSMT sort vainqueur :P.
</p>
<p>
A bientot.
</p>

<img alt="coucou" src="api/gallery/12/picture/end" class="thumbnail img-rounded img-responsive" />
');

