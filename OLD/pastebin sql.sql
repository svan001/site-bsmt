pscp.exe -P 4444 C:\galleries\3 svan@178.62.38.26:/var/www/img/gallerie


update team_member set role = 'Gunner' where nick_name = 'el guereros';


insert into news (author, title, creation_date, content) 
values 
( 'Svan', 'Rencontre LHRM', sysdate(), '
<p>
La Black Shark Milsim Team remercie la Horde Russe Milsim (LHRM) pour leur accueil dimanche sur leur terrain ! 
</p>
<p>
Comme à chaque de bonne partie et une ambiance au top, au plaisir de se revoir les gars ;)  
</p>

<img alt="Gallery1" src="https://fbcdn-sphotos-b-a.akamaihd.net/hphotos-ak-xfp1/v/t1.0-9/s720x720/11009098_815803475152109_5095126578511534066_n.jpg?oh=eae74a136711d0e87782c3044a7215b2&oe=5554C151&__gda__=1434584929_1d532e634973c5d232da70b96f9f5204" class="thumbnail img-rounded img-responsive" />');


-- 25 12

insert into gallery (title, creation_date) values ('LHRM 22/02/2015', sysdate());


insert into picture (gallery, title, creation_date) values (3, '1', sysdate());
insert into picture (gallery, title, creation_date) values (3, '2', sysdate());
insert into picture (gallery, title, creation_date) values (3, '3', sysdate());
insert into picture (gallery, title, creation_date) values (3, '4', sysdate());
insert into picture (gallery, title, creation_date) values (3, '5', sysdate());
insert into picture (gallery, title, creation_date) values (3, '6', sysdate());
insert into picture (gallery, title, creation_date) values (3, '7', sysdate());
insert into picture (gallery, title, creation_date) values (3, '8', sysdate());
insert into picture (gallery, title, creation_date) values (3, '9', sysdate());
insert into picture (gallery, title, creation_date) values (3, '10', sysdate());
insert into picture (gallery, title, creation_date) values (3, 'all1', sysdate());
insert into picture (gallery, title, creation_date) values (3, 'all2', sysdate());
insert into picture (gallery, title, creation_date) values (3, 'kawa', sysdate());
insert into picture (gallery, title, creation_date) values (3, 'svan', sysdate());
insert into picture (gallery, title, creation_date) values (3, 'terro', sysdate());
insert into picture (gallery, title, creation_date) values (3, 'velotr', sysdate());
insert into picture (gallery, title, creation_date) values (3, 'zlatan', sysdate());
insert into picture (gallery, title, creation_date) values (3, 'zlatan2', sysdate());


--  NEWS MACDO
insert into picture (gallery, title, creation_date) values (1, 'macdo_membre', sysdate());


insert into news (author, title, creation_date, content) 
values 
( 'Svan', 'Macdo !', sysdate(), '
<p>
Une petite news pour signaler l''intégration officiel de Macdo comme membre de la BSMT après avoir terminer sa période en tant que postulant.      
</p>
<p>
La bsmt est fier de le compter dans ses rangs et espére que ce sera le cas le plus longtemps possible !   
</p>
<p>
Encore félicitation et à bientôt sur le terrain ma poule !   
</p>
<img alt="macdo" src="api/gallery/1/picture/macdo_membre" class="thumbnail img-rounded" height="300"/>
');

-- NEWS CPM


insert into gallery (id, title, creation_date) values (6, 'OP Nuclear_Strike', sysdate());


insert into picture (gallery, title, creation_date) values (6, 'bigsac', sysdate());
insert into picture (gallery, title, creation_date) values (6, 'blc', sysdate());
insert into picture (gallery, title, creation_date) values (6, 'bouclier', sysdate());
insert into picture (gallery, title, creation_date) values (6, 'callof1', sysdate());
insert into picture (gallery, title, creation_date) values (6, 'callof2', sysdate());
insert into picture (gallery, title, creation_date) values (6, 'callof3', sysdate());
insert into picture (gallery, title, creation_date) values (6, 'chill', sysdate());
insert into picture (gallery, title, creation_date) values (6, 'cont', sysdate());
insert into picture (gallery, title, creation_date) values (6, 'macdo', sysdate());
insert into picture (gallery, title, creation_date) values (6, 'note', sysdate());
insert into picture (gallery, title, creation_date) values (6, 'prep', sysdate());
insert into picture (gallery, title, creation_date) values (6, 'soldier', sysdate());
insert into picture (gallery, title, creation_date) values (6, 'tchetchne', sysdate());
insert into picture (gallery, title, creation_date) values (6, 'together1', sysdate());
insert into picture (gallery, title, creation_date) values (6, 'together2', sysdate());
insert into picture (gallery, title, creation_date) values (6, 'together3', sysdate());


insert into news (author, title, creation_date, content) 
values 
( 'Soldier', 'CPM : OP Nuclear Strike !', sysdate(), '
<p>
Nous remercions la CPM pour leur aceuil et leur invitation à leur OP Nuclear Strike ainsi que les teams presentes KUT / Task Force / TPT/ Socom / 6th Eagle / Ares. Un plaisir d''avoir revu certain et d''avoir rencontrer d''autre en espérant tous vous revoir sur le tarmak !!
</p>
<p>
L''amusement et le bon temp etait de la partie et nous avons tous passé une bonne journée !! </p>
<p>
Un plaisir d''avoir vu de bonne progression de parte et d''autre, les photos de ce week end sont dispo dans la gallerie, merci à tous !!
</p>
<img alt="macdo" src="api/gallery/6/picture/together3" class="thumbnail img-rounded img-responsive"/>
');
