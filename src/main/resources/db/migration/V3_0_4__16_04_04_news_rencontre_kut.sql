/**
 * Script INSERT News : Rencontre KUT
 */

-- Gallerie
INSERT INTO gallery (id, title, description, source, creation_date) VALUES (11, 'Rencontre KUT', 'Galerie de la rencontre BSMT vs KUT du 27/03/2016', 'BSMT, KUT', sysdate());

-- Pictures
INSERT INTO picture (gallery, title, creation_date) VALUES (11, 'prep', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (11, 'escalier', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (11, 'main', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (11, 'prep2', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (11, 'prep3', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (11, 'prep4', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (11, 'end', sysdate());

--NEWS
INSERT INTO news 
(	author,
	title, 
	creation_date, 
	content) 
VALUES 
(	'Svan', 
	'Rencontre KUT', 
	'2016-03-29', 
	'
<p>La BSMT remercie les <a href="https://www.facebook.com/KUT-milsim-1598370033726007">KUT</a> pour leur accueil de ce week end sur leur terrain.
</p>
<p>
Une bonne matiné avec une action intense, même si nous n''avons pas réussis à sécuriser le scientifique et désamorcer la bombe, mais nous ferons mieux la prochaine fois !
</p>
<img alt="coucou" src="api/gallery/11/picture/main" class="thumbnail img-rounded img-responsive" />
');

