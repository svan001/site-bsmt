## Tuto/proc d'install

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
* Var d'env pour selectionner le dossier avec les images (si necessaire) : -DIMG_DIR="" 
* Var d'env pour etre en DEV (minification ...) : -DENV="DEV" 		 		