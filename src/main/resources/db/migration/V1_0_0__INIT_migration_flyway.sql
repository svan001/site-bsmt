-- MySQL dump 10.14  Distrib 5.5.46-MariaDB, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: bootstrap
-- ------------------------------------------------------
-- Server version	5.5.46-MariaDB-1ubuntu0.14.04.2

--
-- Table structure for table gallery
--

CREATE TABLE gallery (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  creation_date datetime NOT NULL,
  title varchar(255) NOT NULL,
  update_date datetime DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=11 ;

--
-- Dumping data for table gallery
--

INSERT INTO gallery VALUES (1,'2015-01-01 00:00:00','Les Membres',NULL),(2,'2015-01-01 00:00:00','Mini bootcamp',NULL),(3,'2015-02-25 23:51:52','LHRM 22/02/2015',NULL),(4,'2015-03-19 18:28:59','Divers',NULL),(5,'2015-03-19 19:00:20','Op Hiver Rude',NULL),(6,'2015-04-08 23:08:19','OP Nuclear_Strike',NULL),(7,'2015-05-28 22:29:22','Training ARES',NULL),(8,'2015-07-29 00:10:57','CPM : Battlefield',NULL),(9,'2015-08-26 23:14:53','Rencontre Elite62',NULL),(10,'2016-01-01 19:26:20','Week end Woods',NULL);

--
-- Table structure for table news
--

CREATE TABLE news (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  author varchar(255) NOT NULL,
  content varchar(5000) NOT NULL,
  creation_date datetime NOT NULL,
  title varchar(255) NOT NULL,
  update_date datetime DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=25  ;

--
-- Dumping data for table news
--

INSERT INTO news VALUES (14,'Svan','\n<p>\nLa Black Shark Milsim Team lance officiellement son site ! Ce site a pour but d''être un moyen simple pour vous de mieux connaitre notre team ainsi que d''y trouver notre actualité.      \n</p>\n<p>\nEn espérant qu''il vous plaira et vous y revoir régulièrement ;).  \n</p>\n\n','2015-03-19 00:00:00','Lancement du site !',NULL),(15,'Svan','\n<p>\nEn ce moment c''est training pour la BSMT, l''occasion de se remmetre les bons automatisme en tête.      \n</p>\n<p>\nOn vous laisse avec une petite prise de vue de l''arsenal de la team, on approche du full magfeed :).  \n</p>\n<img alt=\"Arsenal\" src=\"api/gallery/4/picture/magfeed\" class=\"thumbnail img-rounded img-responsive\" />\n','2015-03-01 00:00:00','Training',NULL),(16,'Svan','\n<p>\nLa Black Shark Milsim Team remercie la Horde Russe Milsim (LHRM) pour leur accueil dimanche sur leur terrain ! \n</p>\n<p>\nComme à chaque de bonne partie et une ambiance au top, au plaisir de se revoir les gars ;)  \n</p>\n\n<img alt=\"Gallery1\" src=\"api/gallery/3/picture/all2\" class=\"thumbnail img-rounded img-responsive\" />','2015-02-23 00:00:00','Rencontre LHRM',NULL),(17,'Cpt soldier','<p>\nLa black shark milsim team remercie les The UNIT MilsimTeam pour leur accueil aujourdhui à la grotte où nous avons passer une journée terrible, grand merci a eux !! \n</p>\n<p>Merci aussi a toutes les teams présente : TASK FORCE 141, Toxico2 Paintball Milsim, LcDeux, FRAP Milsim, Eagle One Paintball Milsim, les spectres et zendoli grand plaisir d''avoir revue certain est d''en avoir rencontré d''autre.\n</p>\n<p>\nEn espérant tous vous revoir bientot !\n</p>\n<img alt=\"Gallery1\" src=\"api/gallery/4/picture/the_unit_fev\" class=\"thumbnail img-rounded img-responsive\" />\n','2015-02-22 00:00:00','Journée à la grotte !',NULL),(18,'Svan','\n<p>\nUne petite news pour vous dire que la BMST, après avoir campée sur place toute la nuit et risquée la confrontation avec une chêvre visiblement énervée, a passée une super journée à l''OP Hiver Rude des Socom !      \n</p>\n<p>\nLa bsmt remercie tous les participants à l''op hiver rude ainsi que les organisateurs la socom pour leur accueil et leurs efforts déployés pour que tous ce monde passe une bonne journée !!  \n</p>\n<p>\nEn espérant recroiser prochainement les équipes présentes, on vous laisse avec cette image.\n</p>\n<img alt=\"coucou\" src=\"api/gallery/5/picture/coucou\" class=\"thumbnail img-rounded img-responsive\" />\n','2015-01-11 00:00:00','Op Hiver Rude by Socom',NULL),(19,'Svan','\n<p>\nUne petite news pour signaler l''intégration officiel de Macdo comme membre de la BSMT après avoir terminer sa période en tant que postulant.      \n</p>\n<p>\nLa bsmt est fier de le compter dans ses rangs et espére que ce sera le cas le plus longtemps possible !   \n</p>\n<p>\nEncore félicitation et à bientôt sur le terrain ma poule !   \n</p>\n<img alt=\"macdo\" src=\"api/gallery/1/picture/macdo_membre\" class=\"thumbnail img-rounded\" height=\"300\"/>\n','2015-03-23 22:23:39','Macdo !',NULL),(20,'Soldier','\n<p>\nNous remercions la CPM pour leur aceuil et leur invitation à leur OP Nuclear Strike ainsi que les teams presentes KUT / Task Force / TPT/ Socom / 6th Eagle / Ares. Un plaisir d''avoir revu certain et d''avoir rencontrer d''autre en espérant tous vous revoir sur le tarmak !!\n</p>\n<p>\nL''amusement et le bon temp etait de la partie et nous avons tous passé une bonne journée !! </p>\n<p>\nUn plaisir d''avoir vu de bonne progression de parte et d''autre, les photos de ce week end sont dispo dans la gallerie, merci à tous !!\n</p>\n<img alt=\"macdo\" src=\"api/gallery/6/picture/together3\" class=\"thumbnail img-rounded img-responsive\"/>\n','2015-04-08 23:08:19','CPM : OP Nuclear Strike !',NULL),(21,'Soldier','\n<p>\nNous remercions la ARES milsim team pour l''invitation est ce scenario mis en place avec de supers PNJ !!! Nous avons kiffer le scenar !! ainsi que de rejouer en faction avec les Woods (toujours au top les gars !!), des adversaires au top avec un jeux de qualité, ... bref merci à tous les participants pour cette superbe matinée passée ensemble.\n</p>\n<p>\nEn espérant vous revoirs bientot.\n</p>\n<p>\nSemper paratus.</p>\n<img alt=\"coucou\" src=\"api/gallery/7/picture/team2\" class=\"thumbnail img-rounded img-responsive\" />\n','2015-05-18 00:00:00','Training ARES',NULL),(22,'Soldier','\n<p>\nNous remercions nos amis de la Confrerie Paintball Milsim pour ce week end, toujours un plaisir de jouer avec vous et de vous revoir.\n</p>\n<p>\nA très bientot les amis !!\n</p>\n\n<img alt=\"coucou\" src=\"api/gallery/8/picture/start\" class=\"thumbnail img-rounded img-responsive\" />\n','2015-07-29 00:12:22','CPM : Battlefield',NULL),(23,'Svan','\n<p>Un grand merci aux <a href=\"https://www.facebook.com/ELITE62\">Elite62</a> pour leur présence ce dimanche lors de notre première rencontre avec eux. Du bon jeux, du fair play et du beau temps, tout ce qu''on aime !\n</p>\n<p>Merci aussi aux BTS venus nous prêter main forte ce matin.\n</p>\n<p>Au plaisir de se recroiser sur un terrain !\n</p>\n\n<img alt=\"coucou\" src=\"api/gallery/9/picture/the_end\" class=\"thumbnail img-rounded img-responsive\" />\n','2015-08-26 23:14:53','Rencontre Elite62',NULL),(24,'Cpt Soldier','\n<p>\nPour une première chez <a href=\"https://www.facebook.com/WoodsPaintballTeam-227248747318005/?fref=ts\">les Woods</a>, nous avons vraiment appréciés les infrastructures (beaucoup de boulot), cotés scénar, la aussi, vraiment sympa même si les deux factions sont restées la plupart du temps ex-aequo (pas simple pour une évolution scénar), de bonne phase de jeux de la part des joueurs.. bref nous avons passé une très bonne journée :).\n</p>\n<p>\nUne petite frayeur pour le gars des <a href=\"https://www.facebook.com/Eagle-One-Paintball-Milsim-738936899529382/?fref=ts\">Eagle One</a>, mais qui ce termine bien !!\n</p>\n<p>\nUn grand merci aux Woods pour leurs orga et merci aux teams présentes qui ont fait vivre le jeux. Merci à tous, à bientot en 2016, passé de bonnes fétes de fin d''année !!\n</p>\n<p>\nN''hésitez pas à visiter <a href=\"gallery/10\">la galerie</a> de l''événement avec les photos prises par <a href=\"https://www.facebook.com/The-MSI-1399901450264902/\">les MSI</a>, ou <a href=\"https://www.facebook.com/media/set/?set=a.1658879251033786.1073741841.1399901450264902&type=3\">la galerie compléte</a> sur leur facebook. \n</p>\n<p>\nBSMT, semper paratus !\n</p>\n<img alt=\"coucou\" src=\"api/gallery/10/picture/action1\" class=\"thumbnail img-rounded img-responsive\" />\n','2015-12-15 00:00:00','Week end chez les Woods',NULL);

--
-- Table structure for table picture
--

CREATE TABLE picture (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  creation_date datetime NOT NULL,
  title varchar(255) NOT NULL,
  update_date datetime DEFAULT NULL,
  gallery bigint(20) NOT NULL,
  PRIMARY KEY (id),
  KEY FKDD905CFECF46EDC0 (gallery),
  CONSTRAINT FKDD905CFECF46EDC0 FOREIGN KEY (gallery) REFERENCES gallery (id)
) ENGINE=InnoDB AUTO_INCREMENT=97  ;

--
-- Dumping data for table picture
--

INSERT INTO picture VALUES (1,'2015-01-01 00:00:00','soldier',NULL,1),(2,'2015-01-01 00:00:00','macdo',NULL,1),(4,'2015-01-01 00:00:00','scarface',NULL,1),(5,'2015-01-01 00:00:00','svan',NULL,1),(6,'2015-01-01 00:00:00','pompe',NULL,2),(7,'2015-01-01 00:00:00','gun',NULL,2),(8,'2015-01-01 00:00:00','wargame',NULL,2),(9,'2015-01-01 00:00:00','velotr',NULL,1),(10,'2015-01-01 00:00:00','ScHark_-RaCe',NULL,1),(11,'2015-01-01 00:00:00','el guereros',NULL,1),(12,'2015-01-01 00:00:00','tchetchene',NULL,1),(13,'2015-02-25 23:51:53','1',NULL,3),(14,'2015-02-25 23:51:53','2',NULL,3),(15,'2015-02-25 23:51:53','3',NULL,3),(16,'2015-02-25 23:51:53','4',NULL,3),(17,'2015-02-25 23:51:53','5',NULL,3),(18,'2015-02-25 23:51:53','6',NULL,3),(19,'2015-02-25 23:51:53','7',NULL,3),(20,'2015-02-25 23:51:53','8',NULL,3),(21,'2015-02-25 23:51:53','9',NULL,3),(22,'2015-02-25 23:51:53','10',NULL,3),(23,'2015-02-25 23:51:53','all1',NULL,3),(24,'2015-02-25 23:51:53','all2',NULL,3),(25,'2015-02-25 23:51:53','kawa',NULL,3),(26,'2015-02-25 23:51:53','svan',NULL,3),(27,'2015-02-25 23:51:53','terro',NULL,3),(28,'2015-02-25 23:51:53','velotr',NULL,3),(29,'2015-02-25 23:51:53','zlatan',NULL,3),(30,'2015-02-25 23:51:53','zlatan2',NULL,3),(31,'2015-01-01 00:00:00','zlatan',NULL,1),(32,'2015-03-19 18:29:01','magfeed',NULL,4),(33,'2015-03-19 19:00:20','assault',NULL,5),(34,'2015-03-19 19:00:20','coucou',NULL,5),(35,'2015-03-19 19:00:20','exfiltration',NULL,5),(36,'2015-03-19 19:00:20','prep2',NULL,5),(37,'2015-03-19 19:00:20','prep',NULL,5),(38,'2015-03-19 19:00:20','saloon',NULL,5),(39,'2015-03-19 19:00:20','tente2',NULL,5),(40,'2015-03-19 19:00:20','tente',NULL,5),(41,'2015-03-19 19:00:21','trk',NULL,5),(42,'2015-03-22 23:09:39','macdo_membre',NULL,1),(43,'2015-04-08 23:08:19','bigsac',NULL,6),(44,'2015-04-08 23:08:19','blc',NULL,6),(45,'2015-04-08 23:08:19','bouclier',NULL,6),(46,'2015-04-08 23:08:19','callof1',NULL,6),(47,'2015-04-08 23:08:19','callof2',NULL,6),(48,'2015-04-08 23:08:19','callof3',NULL,6),(49,'2015-04-08 23:08:19','chill',NULL,6),(50,'2015-04-08 23:08:19','cont',NULL,6),(51,'2015-04-08 23:08:19','macdo',NULL,6),(52,'2015-04-08 23:08:19','note',NULL,6),(53,'2015-04-08 23:08:19','prep',NULL,6),(54,'2015-04-08 23:08:19','soldier',NULL,6),(55,'2015-04-08 23:08:19','tchetchne',NULL,6),(56,'2015-04-08 23:08:19','together1',NULL,6),(57,'2015-04-08 23:08:19','together2',NULL,6),(58,'2015-04-08 23:08:19','together3',NULL,6),(59,'2015-05-28 22:29:22','all',NULL,7),(60,'2015-05-28 22:29:22','mastodon',NULL,7),(61,'2015-05-28 22:29:22','mastodon2',NULL,7),(62,'2015-05-28 22:29:22','team1',NULL,7),(63,'2015-05-28 22:29:22','team2',NULL,7),(64,'2015-07-29 00:10:57','before',NULL,8),(65,'2015-07-29 00:10:57','cpm',NULL,8),(66,'2015-07-29 00:10:57','filet',NULL,8),(67,'2015-07-29 00:10:57','filet2',NULL,8),(68,'2015-07-29 00:10:57','start',NULL,8),(69,'2015-07-29 00:10:57','start2',NULL,8),(70,'2015-07-29 00:10:57','the_end',NULL,8),(71,'2015-07-29 00:10:57','the_end2',NULL,8),(72,'2015-07-29 00:10:57','the_end3',NULL,8),(73,'2015-07-31 23:40:10','the_unit_fev',NULL,4),(74,'2015-08-26 23:14:53','aurel',NULL,9),(75,'2015-08-26 23:14:53','bsmt',NULL,9),(76,'2015-08-26 23:14:53','el_guereros',NULL,9),(77,'2015-08-26 23:14:53','elite2',NULL,9),(78,'2015-08-26 23:14:53','elite3',NULL,9),(79,'2015-08-26 23:14:53','elite4',NULL,9),(80,'2015-08-26 23:14:53','full_face',NULL,9),(81,'2015-08-26 23:14:53','full_face2',NULL,9),(82,'2015-08-26 23:14:53','ludo',NULL,9),(83,'2015-08-26 23:14:53','mat',NULL,9),(84,'2015-08-26 23:14:53','the_end',NULL,9),(85,'2016-01-01 19:26:21','before1',NULL,10),(86,'2016-01-01 19:26:21','action1',NULL,10),(87,'2016-01-01 19:26:21','action2',NULL,10),(88,'2016-01-01 19:26:21','action3',NULL,10),(89,'2016-01-01 19:26:21','action4',NULL,10),(90,'2016-01-01 19:26:21','action5',NULL,10),(91,'2016-01-01 19:26:21','noir',NULL,10),(92,'2016-01-01 19:26:21','briefing',NULL,10),(93,'2016-01-01 19:26:21','caisse',NULL,10),(94,'2016-01-01 19:26:21','g36',NULL,10),(95,'2016-01-01 19:26:21','end',NULL,10),(96,'2016-01-01 19:26:21','incruste_scarface',NULL,10);

--
-- Table structure for table team_member
--

CREATE TABLE team_member (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  creation_date datetime NOT NULL,
  description varchar(5000) NOT NULL,
  gear varchar(255) NOT NULL,
  nick_name varchar(255) NOT NULL,
  role varchar(255) NOT NULL,
  update_date datetime DEFAULT NULL,
  birth_date datetime NOT NULL,
  departure_date datetime DEFAULT NULL,
  doesntlikes varchar(255) NOT NULL,
  forname varchar(255) NOT NULL,
  likes varchar(255) NOT NULL,
  membership_date datetime NOT NULL,
  sexe varchar(1) NOT NULL,
  status varchar(1) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=20  ;

--
-- Dumping data for table team_member
--

INSERT INTO team_member VALUES (10,'2015-02-07 21:47:52','Créateur/leader/president de la team','t15, t8.1 et a5 rt custo ump','soldier','leader, medic',NULL,'1982-09-10 00:00:00',NULL,'La triche et les personnes non correcte dans la vie en générale','Mathieu','Les bonnes series TV, paintball avec mes potes','2013-06-28 00:00:00','M','L'),(11,'2015-02-07 21:47:52','Opérateur de la team','T15, T8','scarface','Opérateur',NULL,'1985-01-03 00:00:00',NULL,'Le pastice','Sebastien','Les tatouages','2014-10-01 00:00:00','M','M'),(12,'2015-02-07 21:47:52','Opérateur de la team','M17 CQC','macdo','Opérateur',NULL,'1972-04-25 00:00:00',NULL,'Les chêvres la nuit','Reynald','Moto','2014-09-02 00:00:00','M','M'),(13,'2015-02-07 21:47:52','Passioné de musique, de paint, ex membre des ToxicO², opérateur assidus de la team et accessoirement créateur du site ;)','TGR36, Tipx, T98','svan','Opérateur',NULL,'1988-10-18 00:00:00',NULL,'Apple, la connerie, milsim shop, ...','Stephane','Musique, guitare, le paint, serie US, l''info, ...','2014-02-01 00:00:00','M','M'),(14,'2015-02-07 21:47:52','Opérateur et bricoleur de la team','RAP468, crosman 3357','velotr','Opérateur',NULL,'1993-09-08 00:00:00',NULL,'Le froid','Jordan','La bière','2013-11-08 00:00:00','M','M'),(15,'2015-02-07 21:47:52','Renfort/amis de la team','BT Delta , TPX','ScHark_-RaCe','Renfort, amis',NULL,'1999-09-06 00:00:00',NULL,'Le non respect , n''aime pas l''école :p','Pierre','Le fair-play, le respect , l''amusement , les rigolades...','2012-11-01 00:00:00','M','A'),(16,'2015-02-07 21:47:52','Mike, alias \"El guereros\", opérateur des BSMT depuis les début de la team et ex tchus paint, tient le rôle de gunner dans la team','Sulfateuse, M17 CQC','el guereros','Gunner',NULL,'1987-02-27 00:00:00',NULL,'Les Kangoos','Michael','Whisky coca','2013-06-28 00:00:00','M','M'),(17,'2015-02-07 21:47:52','Opérateur de la team','bt omega','tchetchene','Opérateur',NULL,'1981-12-06 00:00:00',NULL,'','Ludo','','2013-07-02 00:00:00','M','M'),(18,'2015-02-28 12:41:15','Ex tchuss paint et mainteant opérateur chez les BSMT','BT4','zlatan','Opérateur',NULL,'1988-05-26 00:00:00',NULL,'','Bruno','','2015-01-01 00:00:00','M','P'),(19,'2015-07-29 22:39:25','Paintballer depuis de nombreuses années, ex Tschuss paint','TM15','predateur','Opérateur',NULL,'1987-09-29 00:00:00',NULL,'Les prises de tête','Jean charles','Le fairplay','2015-01-30 00:00:00','M','P');

-- Dump completed on 2016-01-05 23:57:13
