# ARCHIVE Site BSMT

**Francais :**

Archive du Projet du site Web de la BSMT (Black Shark Milsim Team), équipe de paintball du nord de la France.

Ceci était un de mes projets perso ayant pour but de promouvoir l'équipe en me permettant d'expérimenter certaines idées et/ou technologies.

Le site n'est plus maintenu et plus visible sur le web, les sources reste ici pour archive. 

C'est une application java web, Front angularJs, Back Spring avec une base MariaDB, qui permet d'exposer de facon basique photos, news, présentation, ....
L'approche la plus simple possible est priviligiée. 
Le site étant supposé rester privé à l'origne, tout n'est pas forcément concus pour un quelqu'un externe, désolé, il n'est pas prévus de revenir dessus.


**English**

Archive for the website of the BSMT (Black Shark Milsim Team), French paintball team.

It was one of my pet project that I used to promote our team and play with different idea and/or technologie at that time.

It's not under current development anymore, nor it is visible on the web, source code is here to be shared and be available.

Most of the comment or concept are in French, it may be a little bit tricky to understand if you don't speak french at all.

It's a web application, Front angularJs, Back Spring + MariaDB, which allow to display simple news, photo galleries, presentation of team member, ...
The simplest solutions are preferred throughout the application over maybe better but more complicated solutions.
As the source code was supposed to stay private, everything may not be obvious for someone not familiar with the project and its history, sorry about that but it well may never change.

# OLD README

## Tuto/proc d'install

## Base de donées

### Créer la base 

#### Maria DB

* Install mariaDB server et client
* Connection en root sans mdp : `sudo mysql -uroot -p`
* Creer la base : `create database bootstrap;`
* Creer le user : `create user 'bootstrap'@'localhost' IDENTIFIED BY 'bootstrap';`
* Ajouter les priviléges/droits : ̀`GRANT ALL PRIVILEGES ON *.* TO 'bootstrap'@'localhost';` et `flush privileges;`

#### Init de la Base

* Démarrer l'appli, si déjà une bdd init de la table `schema_version` via l'executable (apres edit du fichier de config) :  `./flyway baseline -Dflyway.baselineVersion=1_0_0 -Dflyway.baselineDescription="Init migration flyway"`

(Sinon pre migration flyway)*
* Utiliser un dump de la bdd de prod  
* Commande (remplacer le MDP) : `mysqldump -ubootstrap -pMDP_PROD bootstrap > /tmp/export.sql`



#### Ajouter ressource à tomcat

```` xml
<!-- Postgres -->
<Resource auth="Container" 
	driverClassName="org.postgresql.Driver" maxActive="20" maxIdle="10" maxWait="-1" 
	name="jdbc/site_bsmt_ds" 
	username="bootstrap"
	password="bootstrap" 
	type="javax.sql.DataSource" 
	url="jdbc:postgresql://localhost:5432/bootstrap" 
	/>

<!-- MariaDB -->
<Resource name="jdbc/site_bsmt_ds" auth="Container" type="javax.sql.DataSource"
           maxActive="50" maxIdle="30" maxWait="10000"
           username="bootstrap" password="bootstrap" 
           driverClassName="com.mysql.jdbc.Driver"
           validationQuery="SELECT 1" testOnBorrow="true"
           url="jdbc:mysql://localhost:3306/bootstrap"/>
````

### Galeries

* copier le dossier de la galerie dans /var/www/img (si besoin d'un autre dossier voir les var d'env)	

### Variables

* Var d'env pour selectionner le fichier de log : -Dlog4j.configuration="./log4jDEV.xml"
* Var d'env pour selectionner le dossier avec les images : -DIMG_DIR="" 
	*  Pointer vers le dossier du repo : -DIMG_DIR="/home/stephane/DEV/git/site-bsmt/install"
* Var d'env pour etre en DEV (minification ...) : -DENV="DEV" 	
	 		
