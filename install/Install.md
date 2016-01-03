## Tuto/proc d'install

## Base de donées

### Créer la base 

#### Maria DB

* Install mariaDB server et client
* Connection en root sans mdp : `sudo mysql -uroot -p`
* Creer la base : `create database bootstrap;`
* Creer le user : `create user 'bootstrap'@'localhost' IDENTIFIED BY 'bootstrap';`
* Ajouter les priviléges/droits : ̀`GRANT ALL PRIVILEGES ON *.* TO 'bootstrap'@'localhost';` et `flush privileges;`

### Init de la Base (/!\ dépendra de la migration vers flyway/liquibase)

* Utiliser un dump de la bdd de prod  
* Commande (remplacer le MDP) : `mysqldump -ubootstrap -pMDP_PROD bootstrap > /tmp/export.sql`

### Ajouter ressource a tomcat

```` xml
<!-- Postgres -->
<Resource auth="Container" 
	driverClassName="org.postgresql.Driver" maxActive="20" maxIdle="10" maxWait="-1" 
	name="jdbc/bootstrap_ds" 
	username="bootstrap"
	password="bootstrap" 
	type="javax.sql.DataSource" 
	url="jdbc:postgresql://localhost:5432/bootstrap" 
	/>

<!-- MariaDB -->
<Resource name="jdbc/bootstrap_ds" auth="Container" type="javax.sql.DataSource"
           maxActive="50" maxIdle="30" maxWait="10000"
           username="bootstrap" password="bootstrap" 
           driverClassName="com.mysql.jdbc.Driver"
           validationQuery="SELECT 1" testOnBorrow="true"
           url="jdbc:mysql://localhost:3306/bootstrap"/>
````

### Galeries

* copier le dossier de la galerie dans /var/www/img (si besoin d'un autre dossier voir les var d'env)	

### Variable

* Var d'env pour selectionner le fichier de log : -Dlog4j.configuration="./log4jDEV.xml"
* Var d'env pour selectionner le dossier avec les images : -DIMG_DIR="" 
	*  Pointer vers le dossier du repo : -DIMG_DIR="/home/stephane/DEV/repositories/site-bsmt/install"
* Var d'env pour etre en DEV (minification ...) : -DENV="DEV" 		 		