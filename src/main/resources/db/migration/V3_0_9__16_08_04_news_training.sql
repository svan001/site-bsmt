/**
 * Script INSERT News : Training !
 */

-- Pictures
INSERT INTO picture (gallery, title, creation_date) VALUES (4, 'training_21_05_2016', sysdate());

--NEWS
INSERT INTO news 
(	author,
	title, 
	creation_date, 
	content) 
VALUES 
(	'Svan', 
	'Training !', 
	'2016-05-29', 
	'
<p>Aujourd''hui c''était training pour la BSMT ! Encore beaucoup de bonne progression et de bonne humeur.
</p>
<p>On vous laisse avec la photo souvenir du groupe ;).
</p>

<img alt="coucou" src="api/gallery/4/picture/training_21_05_2016" class="thumbnail img-rounded img-responsive" />
');

