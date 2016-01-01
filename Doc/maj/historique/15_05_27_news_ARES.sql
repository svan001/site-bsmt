insert into gallery (id, title, creation_date) values (7, 'Training ARES', sysdate());


insert into picture (gallery, title, creation_date) values (7, 'all', sysdate());
insert into picture (gallery, title, creation_date) values (7, 'mastodon', sysdate());
insert into picture (gallery, title, creation_date) values (7, 'mastodon2', sysdate());
insert into picture (gallery, title, creation_date) values (7, 'team1', sysdate());
insert into picture (gallery, title, creation_date) values (7, 'team2', sysdate());



insert into news (author, title, creation_date, content) 
values 
( 'Soldier', 'Training ARES', '2015-05-18', '
<p>
Nous remercions la ARES milsim team pour l''invitation est ce scenario mis en place avec de supers PNJ !!! Nous avons kiffer le scenar !! ainsi que de rejouer en faction avec les Woods (toujours au top les gars !!), des adversaires au top avec un jeux de qualité, ... bref merci à tous les participants pour cette superbe matinée passée ensemble.
</p>
<p>
En espérant vous revoirs bientot.
</p>
<p>
Semper paratus.</p>
<img alt="coucou" src="api/gallery/7/picture/team2" class="thumbnail img-rounded img-responsive" />
');

