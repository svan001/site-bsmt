/**
 * Script INSERT News : Week end chez les Woods
 */

-- Gallerie
INSERT INTO gallery (id, title, creation_date) VALUES (10, 'Week end Woods', sysdate());

-- Pictures
INSERT INTO picture (gallery, title, creation_date) VALUES (10, 'before1', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (10, 'action1', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (10, 'action2', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (10, 'action3', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (10, 'action4', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (10, 'action5', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (10, 'noir', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (10, 'briefing', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (10, 'caisse', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (10, 'g36', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (10, 'end', sysdate());
INSERT INTO picture (gallery, title, creation_date) VALUES (10, 'incruste_scarface', sysdate());

-- NEWS
INSERT INTO news 
(	author,
	title, 
	creation_date, 
	content) 
VALUES 
(	'Cpt Soldier', 
	'Week end chez les Woods', 
	'2015-12-15', 
	'
<p>
Pour une première chez <a href="https://www.facebook.com/WoodsPaintballTeam-227248747318005/?fref=ts">les Woods</a>, nous avons vraiment appréciés les infrastructures (beaucoup de boulot), cotés scénar, la aussi, vraiment sympa même si les deux factions sont restées la plupart du temps ex-aequo (pas simple pour une évolution scénar), de bonne phase de jeux de la part des joueurs.. bref nous avons passé une très bonne journée :).
</p>
<p>
Une petite frayeur pour le gars des <a href="https://www.facebook.com/Eagle-One-Paintball-Milsim-738936899529382/?fref=ts">Eagle One</a>, mais qui ce termine bien !!
</p>
<p>
Un grand merci aux Woods pour leurs orga et merci aux teams présentes qui ont fait vivre le jeux. Merci à tous, à bientot en 2016, passé de bonnes fétes de fin d''année !!
</p>
<p>
N''hésitez pas à visiter <a href="gallery/10">la galerie</a> de l''événement avec les photos prises par <a href="https://www.facebook.com/The-MSI-1399901450264902/">les MSI</a>, ou <a href="https://www.facebook.com/media/set/?set=a.1658879251033786.1073741841.1399901450264902&type=3">la galerie compléte</a> sur leur facebook. 
</p>
<p>
BSMT, semper paratus !
</p>
<img alt="coucou" src="api/gallery/10/picture/action1" class="thumbnail img-rounded img-responsive" />
');

