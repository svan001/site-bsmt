-- NEWS
insert into news (author, title, creation_date, content) 
values 
( 'Svan', 'Lancement du site !', sysdate(), '
<p>
La Black Shark Milsim Team lance officiellement son site ! Ce site a pour but d''être un moyen simple pour vous de mieux connaitre notre team ainsi que d''y trouver notre actualité.      
</p>
<p>
En espérant qu''il vous plaira et vous y revoir régulièrement ;).  
</p>

');

-- MEMBERS

--mike
update team_member 
set role = 'Gunner', gear = 'Sulfateuse, M17 CQC', likes = 'Whisky coca', doesntlikes = 'Les Kangoos', description = 'Mike, alias "El guereros", opérateur des BSMT depuis les début de la team et ex tchus paint, tient le rôle de gunner dans la team'   
where nick_name = 'el guereros';

--soldier
update team_member 
set membership_date = '2013-06-28', birth_date = '1982-09-10'   
where nick_name = 'soldier';

-- macdo
update team_member 
set membership_date = '2014-09-02', birth_date = '1972-04-25', gear = 'M17 CQC', likes = 'Moto', doesntlikes = 'Les chêvres la nuit'   
where nick_name = 'macdo';

-- Svan
update team_member 
set likes = 'Musique, guitare, le paint, serie US, l''info, ...', doesntlikes = 'Apple, la connerie, milsim shop, ...', description = 'Passioné de musique, de paint, ex membre des ToxicoO2, opérateur assidus de la team et accessoirement créateur du site ;)' 
where nick_name = 'svan';

-- Tchetchen
update team_member 
set birth_date = '1981-12-06' 
where nick_name = 'tchetchene';

-- Jordan
update team_member 
set description = 'Opérateur et bricoleur de la team'  
where nick_name = 'velotr';

-- zlatan
update team_member 
set membership_date = '2015-01-01', birth_date = '1988-05-26', description = 'Ex tchuss paint et mainteant opérateur chez les BSMT'  
where nick_name = 'zlatan';




-- 25 12

insert into gallery (id, title, creation_date) values (4, 'Divers', sysdate());
insert into picture (gallery, title, creation_date) values (4, 'magfeed', sysdate());



insert into news (author, title, creation_date, content) 
values 
( 'Svan', 'Training', '2015-03-01', '
<p>
En ce moment c''est training pour la BSMT, l''occasion de se remmetre les bons automatisme en tête.      
</p>
<p>
On vous laisse avec une petite prise de vue de l''arsenal de la team, on approche du full magfeed :).  
</p>
<img alt="Arsenal" src="api/gallery/4/picture/magfeed" class="thumbnail img-rounded img-responsive" />
');



insert into gallery (id, title, creation_date) values (5, 'Op Hiver Rude', sysdate());


insert into picture (gallery, title, creation_date) values (5, 'assault', sysdate());
insert into picture (gallery, title, creation_date) values (5, 'coucou', sysdate());
insert into picture (gallery, title, creation_date) values (5, 'exfiltration', sysdate());
insert into picture (gallery, title, creation_date) values (5, 'prep2', sysdate());
insert into picture (gallery, title, creation_date) values (5, 'prep', sysdate());
insert into picture (gallery, title, creation_date) values (5, 'saloon', sysdate());
insert into picture (gallery, title, creation_date) values (5, 'tente2', sysdate());
insert into picture (gallery, title, creation_date) values (5, 'tente', sysdate());
insert into picture (gallery, title, creation_date) values (5, 'trk', sysdate());



insert into news (author, title, creation_date, content) 
values 
( 'Svan', 'Op Hiver Rude by Socom', '2015-01-11', '
<p>
Une petite news pour vous dire que la BMST, après avoir campée sur place toute la nuit et risquée la confrontation avec une chêvre visiblement énervée, a passée une super journée à l''OP Hiver Rude des Socom !      
</p>
<p>
La bsmt remercie tous les participants à l''op hiver rude ainsi que les organisateurs la socom pour leur accueil et leurs efforts déployés pour que tous ce monde passe une bonne journée !!  
</p>
<p>
En espérant recroiser prochainement les équipes présentes, on vous laisse avec cette image.
</p>
<img alt="coucou" src="api/gallery/5/picture/coucou" class="thumbnail img-rounded img-responsive" />
');


