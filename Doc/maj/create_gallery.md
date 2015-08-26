# Tuto création de gallery

### Création image

#### Convert :

Ex: `convert MY_IMG.jpg -resize 165x165 MY_IMG.jpg` 

#### Mogrify :

Convert en batch
 
* Ex : **(/!\ affiche une erreur...)** `mogrify -resize 165x165 -path ./dest *`

#### Script : 

Help pour créer lister les images ; `(ls -1 | sed -e 's/\..*$//' > /tmp/res_ls.txt) && gedit /tmp/res_ls.txt`
`
