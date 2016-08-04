/**
 * Script INSERT News : Rencontre CPM
 */

-- Pictures
INSERT INTO picture (gallery, title, creation_date) VALUES (4, 'cpm_juin_2016', sysdate());

--NEWS
INSERT INTO news 
(	author,
	title, 
	creation_date, 
	content) 
VALUES 
(	'Svan', 
	'Rencontre CPM', 
	'2016-06-19', 
	'
<p>Superbe matinée avec la Team BSMT en compagnie des <a href="https://www.facebook.com/confreriepaintballmilsim/?ref=ts&fref=ts">CPM</a>, merci pour l''invit les gars ;).
</p>

<img alt="coucou" src="api/gallery/4/picture/cpm_juin_2016" class="thumbnail img-rounded img-responsive" />
');

