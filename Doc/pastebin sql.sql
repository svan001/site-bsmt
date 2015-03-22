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
<img alt="macdo" src="api/gallery/1/picture/macdo_membre" class="thumbnail img-rounded img-responsive" />
');