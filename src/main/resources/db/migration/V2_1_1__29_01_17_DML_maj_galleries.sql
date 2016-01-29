/**
 * Script DML d'ajout des la colonne description et source
 */


UPDATE gallery 
SET	
	 description = 'Gallerie des membres de la team'
WHERE id = 1
;

UPDATE gallery 
SET	
	 description = 'Mini bootcamp de la Delta Force Milsim',
	 source = 'BSMT et autre équipe présente ce jour'
WHERE id = 2
;

UPDATE gallery 
SET	
	 description = 'Gallerie de la rencontre avec la LHRM du 22/02/2015',
	 source = 'LHRM'
WHERE id = 3
;

UPDATE gallery 
SET	
	 description = 'Divers photos'
WHERE id = 4
;

UPDATE gallery 
SET	
	 description = 'Gallerie de l''Op Hiver Rude by SOCOM',
	 source = 'BSMT, SOCOM, ...'
WHERE id = 5
;

UPDATE gallery 
SET	
	 description = 'Gallerie de l''OP Nuclear_Strike des CPM',
	 source = 'BSMT, CPM'
WHERE id = 6
;

UPDATE gallery 
SET	
	 description = 'Gallerie du training ARES',
	 source = 'BSMT, ARES, ...'
WHERE id = 7
;

UPDATE gallery 
SET	
	 description = 'Gallerie de l''OP Battelefield des CPM',
	 source = 'CPM'
WHERE id = 8
;

UPDATE gallery 
SET	
	 description = 'Gallerie de la rencontre BSMT + Elite62',
	 source = 'Elite62'
WHERE id = 9
;

UPDATE gallery 
SET	
	 description = 'Gallerie de l''OP des WOODS : WPT inter team',
	 source = 'MSI'
WHERE id = 10
;

