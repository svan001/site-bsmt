-- TEAM MEMBER
insert into team_member 
(nick_name, forname, sexe, role, birth_date, description, gear, status, likes, doesntlikes, membership_date, creation_date) 
values ('soldier', 'Mathieu', 'M', 'leader, medic', sysdate(), 'Createur/leader/president de la team', 't15, t8.1 et a5 rt custo ump', 'L', 'Les bonnes series TV, paintball avec mes potes', 'La triche et les personnes non correcte dans la vie en générale', sysdate(), sysdate());

/* OUBLIE FOREST 
insert into team_member 
(nick_name, forname, sexe, role, birth_date, description, gear, status, likes, doesntlikes, membership_date, creation_date, departure_date) 
values ('forest', 'Jerome', 'M', 'Medic', sysdate(), 'Ex medic de la team', 'RAM, SAR-12', 'V', 'Petit calibres, couteau, comics', '', sysdate(), sysdate(), sysdate());
*/

insert into team_member 
(nick_name, forname, sexe, role, birth_date, description, gear, status, likes, doesntlikes, membership_date, creation_date) 
values ('scarface', 'Sebastien', 'M', 'Operateur', '1985-01-03', 'Operateur de la team', 'T15, T8', 'M', 'Les tatouages', 'Le pastice', '2014-10-01', sysdate());

insert into team_member 
(nick_name, forname, sexe, role, birth_date, description, gear, status, likes, doesntlikes, membership_date, creation_date) 
values ('macdo', 'Reynald', 'M', 'Operateur', sysdate(), 'Operateur de la team', 'M17', 'P', 'Frite', '', sysdate(), sysdate());

insert into team_member 
(nick_name, forname, sexe, role, birth_date, description, gear, status, likes, doesntlikes, membership_date, creation_date) 
values ('svan', 'Stephane', 'M', 'Operateur', '1988-10-18', 'Operateur de la team', 'TGR36, Tipx, T98', 'M', 'Musique/guitare, paint', 'apple', '2014-02-01', sysdate());

insert into team_member 
(nick_name, forname, sexe, role, birth_date, description, gear, status, likes, doesntlikes, membership_date, creation_date) 
values ('velotr', 'Jordan', 'M', 'Operateur', '1993-09-08', 'Opérateur', 'RAP468, crosman 3357', 'M', 'La bière', 'Le froid', '2013-11-08', sysdate());

insert into team_member 
(nick_name, forname, sexe, role, birth_date, description, gear, status, likes, doesntlikes, membership_date, creation_date) 
values ('ScHark_-RaCe', 'Pierre', 'M', 'Renfort, amis', '1999-09-06', 'Renfort/amis de la team', 'BT Delta , TPX', 'A', 'Le fair-play, le respect , l''amusement , les rigolades...', 'Le non respect , n''aime pas l''école :p', '2012-11-01', sysdate());

insert into team_member 
(nick_name, forname, sexe, role, birth_date, description, gear, status, likes, doesntlikes, membership_date, creation_date) 
values ('el guereros', 'Michael', 'M', 'Operateur, gunner', '1987-02-27', 'Gunner de la team', 'Sulfateuse', 'M', '', '', '2013-06-28', sysdate());

insert into team_member 
(nick_name, forname, sexe, role, birth_date, description, gear, status, likes, doesntlikes, membership_date, creation_date) 
values ('tchetchene', 'Ludo', 'M', 'Operateur', '2015-01-01', 'Opérateur de la team', 'bt omega', 'M', '', '', '2013-07-02', sysdate());



-- DELETE
delete from team_member where nick_name  = 'forest';


-- Gallery

insert into gallery (title, creation_date) values ('Les Membres', '2015-01-01');
insert into gallery (title, creation_date) values ('Mini bootcamp', '2015-01-01');


-- Picture
insert into picture (gallery, title, creation_date) values (1, 'soldier', '2015-01-01');
insert into picture (gallery, title, creation_date) values (1, 'macdo', '2015-01-01');
insert into picture (gallery, title, creation_date) values (1, 'forest', '2015-01-01');
insert into picture (gallery, title, creation_date) values (1, 'scarface', '2015-01-01');
insert into picture (gallery, title, creation_date) values (1, 'svan', '2015-01-01');
insert into picture (gallery, title, creation_date) values (1, 'velotr', '2015-01-01');
insert into picture (gallery, title, creation_date) values (1, 'ScHark_-RaCe', '2015-01-01');
insert into picture (gallery, title, creation_date) values (1, 'el guereros', '2015-01-01');
insert into picture (gallery, title, creation_date) values (1, 'tchetchene', '2015-01-01');

insert into picture (gallery, title, creation_date) values (2, 'pompe', '2015-01-01');
insert into picture (gallery, title, creation_date) values (2, 'gun', '2015-01-01');
insert into picture (gallery, title, creation_date) values (2, 'wargame', '2015-01-01');

--DELETE
delete from picture where gallery= 1 and title = 'forest';

