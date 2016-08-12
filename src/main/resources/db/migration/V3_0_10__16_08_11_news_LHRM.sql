/**
 * Script INSERT News : Rencontre LHRM et nouveau drapeau !
 */

-- Pictures
INSERT INTO picture (gallery, title, creation_date) VALUES (4, 'lhrm_31_07_16', sysdate());

--NEWS
INSERT INTO news 
(	author,
	title, 
	creation_date, 
	content) 
VALUES 
(	'Svan', 
	'Rencontre LHRM et nouveau drapeau !', 
	'2016-07-31', 
	'
<p>
Une fois de plus une rencontre avec nos amis de la LHRM, une bonne entente avec nous, de très bon game, encore merci pour vos invitations. Au plaisir les amis :).
</p>
<p>
On vous présente aussi notre nouveau drapeau qui nous permmeterra de porter fiérement nos couleurs lors de nos futur déplacement.
</p>

<img alt="coucou" src="api/gallery/4/picture/lhrm_31_07_16" class="thumbnail img-rounded img-responsive" />
');

