/**
 * Script INSERT News : rencontre CPM battelfield
 */

-- Gallerie
insert into gallery (id, title, creation_date) values (8, 'CPM : Battlefield', sysdate());

-- Pictures
insert into picture (gallery, title, creation_date) values (8, 'before', sysdate());
insert into picture (gallery, title, creation_date) values (8, 'cpm', sysdate());
insert into picture (gallery, title, creation_date) values (8, 'filet', sysdate());
insert into picture (gallery, title, creation_date) values (8, 'filet2', sysdate());
insert into picture (gallery, title, creation_date) values (8, 'start', sysdate());
insert into picture (gallery, title, creation_date) values (8, 'start2', sysdate());
insert into picture (gallery, title, creation_date) values (8, 'the_end', sysdate());
insert into picture (gallery, title, creation_date) values (8, 'the_end2', sysdate());
insert into picture (gallery, title, creation_date) values (8, 'the_end3', sysdate());

--NEWS
insert into news 
(	author,
	title, 
	creation_date, 
	content) 
values 
(	'Soldier', 
	'CPM : Battlefield', 
	sysdate(), 
	'
<p>
Nous remercions nos amis de la Confrerie Paintball Milsim pour ce week end, toujours un plaisir de jouer avec vous et de vous revoir.
</p>
<p>
A très bientot les amis !!
</p>

<img alt="coucou" src="api/gallery/8/picture/start" class="thumbnail img-rounded img-responsive" />
');

