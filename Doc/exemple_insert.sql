-- TEAM MEMBER
insert into team_member 
(nick_name, forname, sexe, role, birth_date, description, gear, status, likes, doesntlikes, membership_date, creation_date) 
values ('soldier', 'Mathieu', 'M', 'Leader', sysdate(), 'Createur/leader/president de la team', 'T15, T8', 'L', 'Tiberius, ACIM, vert olive', '', sysdate(), sysdate());

insert into team_member 
(nick_name, forname, sexe, role, birth_date, description, gear, status, likes, doesntlikes, membership_date, creation_date, departure_date) 
values ('forest', 'Jerome', 'M', 'Medic', sysdate(), 'Ex medic de la team', 'RAM, SAR-12', 'V', 'Petit calibres, couteau, comics', '', sysdate(), sysdate(), sysdate());


insert into team_member 
(nick_name, forname, sexe, role, birth_date, description, gear, status, likes, doesntlikes, membership_date, creation_date) 
values ('scarface', 'Sebastien', 'M', 'Operateur', sysdate(), 'Operateur de la team', 'T15, T8', 'M', 'Tiberius, \"grenade\"', '', sysdate(), sysdate());


insert into team_member 
(nick_name, forname, sexe, role, birth_date, description, gear, status, likes, doesntlikes, membership_date, creation_date) 
values ('macdo', 'Reynald', 'M', 'Operateur', sysdate(), 'Operateur de la team', 'M17', 'P', 'Frite', '', sysdate(), sysdate());


insert into team_member 
(nick_name, forname, sexe, role, birth_date, description, gear, status, likes, doesntlikes, membership_date, creation_date) 
values ('svan', 'Stephane', 'M', 'Operateur', '1988-10-18', 'Operateur de la team', 'TGR36, Tipx, T98', 'M', 'Musique/guitare, paint', 'apple', '2014-02-01', sysdate());

insert into team_member 
(nick_name, forname, sexe, role, birth_date, description, gear, status, likes, doesntlikes, membership_date, creation_date) 
values ('velotr', 'Jordan', 'M', 'Operateur', '1993-09-08', 'Opérateur', 'RAP468, crosman 3357', 'M', 'La bière', 'Le froid', '2013-11-08', sysdate());


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

insert into picture (gallery, title, creation_date) values (2, 'pompe', '2015-01-01');
insert into picture (gallery, title, creation_date) values (2, 'gun', '2015-01-01');
insert into picture (gallery, title, creation_date) values (2, 'wargame', '2015-01-01');
