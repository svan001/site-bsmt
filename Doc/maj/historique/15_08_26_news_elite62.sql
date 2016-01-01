/**
 * Script INSERT News : Rencontre Elite62
 */

-- Gallerie
INSERT INTO gallery (id, title, creation_date) VALUES (9, 'Rencontre Elite62', sysdate());

-- Pictures
INSERT INTO picture (gallery, title, creation_date) VALUES (9, 'aurel', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (9, 'bsmt', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (9, 'el_guereros', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (9, 'elite2', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (9, 'elite3', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (9, 'elite4', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (9, 'full_face', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (9, 'full_face2', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (9, 'ludo', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (9, 'mat', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (9, 'the_end', sysdate());

--NEWS
INSERT INTO news 
(	author,
	title, 
	creation_date, 
	content) 
VALUES 
(	'Svan', 
	'Rencontre Elite62', 
	sysdate(), 
	'
<p>Un grand merci aux <a href="https://www.facebook.com/ELITE62">Elite62</a> pour leur présence ce dimanche lors de notre première rencontre avec eux. Du bon jeux, du fair play et du beau temps, tout ce qu''on aime !
</p>
<p>Merci aussi aux BTS venus nous prêter main forte ce matin.
</p>
<p>Au plaisir de se recroiser sur un terrain !
</p>

<img alt="coucou" src="api/gallery/9/picture/the_end" class="thumbnail img-rounded img-responsive" />
');

