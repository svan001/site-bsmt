/**
 * ## TODO :
 * 
 * 1. __TITLE_NEWS__ : titre de la news
 * 2. __IDG__ : ID de la gallery (last + 1)
 * 3. __TITLE_GALLERY__ : titre de la gallery
 * 4. __MAIN_PICTURE__ : photo présente en fin de news
 * 5. Compléter la __DESCRIPTION_GALERY__ et  __SOURCE_GALERY__ si une source a remercier
 * 6. Compléter les pictures
 * 7. Compléter la news
 */

/**
 * Script INSERT News : __TITLE_NEWS__
 */

-- Gallerie
INSERT INTO gallery (id, title, description, source, creation_date) VALUES (__IDG__, '__TITLE_GALLERY__', '__DESCRIPTION_GALERY__', '__SOURCE_GALERY__', sysdate());

-- Pictures
INSERT INTO picture (gallery, title, creation_date) VALUES (__IDG__, '', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (__IDG__, '', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (__IDG__, '', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (__IDG__, '', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (__IDG__, '', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (__IDG__, '', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (__IDG__, '', sysdate());

--NEWS
INSERT INTO news 
(	author,
	title, 
	creation_date, 
	content) 
VALUES 
(	'Soldier', 
	'__TITLE_NEWS__', 
	sysdate(), 
	'
<p>
</p>
<p>
</p>

<img alt="coucou" src="api/gallery/__IDG__/picture/__MAIN_PICTURE__" class="thumbnail img-rounded img-responsive" />
');

