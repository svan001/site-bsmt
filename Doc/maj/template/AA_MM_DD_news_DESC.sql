/**
 * ## TODO :
 * 
 * 1. __TITLE_NEWS__ : titre de la news
 * 2. __IDG__ : ID de la gallery (last + 1)
 * 3. __TITLE_GALLERY__ : titre de la gallery
 * 4. __MAIN_PICTURE__ : photo présente en fin de news
 * 5. Compléter la news
 */

/**
 * Script INSERT News : __TITLE_NEWS__
 */

-- Gallerie
insert into gallery (id, title, creation_date) values (__IDG__, '__TITLE_GALLERY__', sysdate());

-- Pictures
insert into picture (gallery, title, creation_date) values (__IDG__, '', sysdate());
insert into picture (gallery, title, creation_date) values (__IDG__, '', sysdate());
insert into picture (gallery, title, creation_date) values (__IDG__, '', sysdate());
insert into picture (gallery, title, creation_date) values (__IDG__, '', sysdate());
insert into picture (gallery, title, creation_date) values (__IDG__, '', sysdate());
insert into picture (gallery, title, creation_date) values (__IDG__, '', sysdate());
insert into picture (gallery, title, creation_date) values (__IDG__, '', sysdate());

--NEWS
insert into news 
(	author,
	title, 
	creation_date, 
	content) 
values 
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

