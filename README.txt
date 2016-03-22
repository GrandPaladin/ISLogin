

INSTRUCCIONES DE INSTALACION: Para linux mint 17

Todo se hace desde consola y en super usuario.

JDK
La version que utilizo es la version 1.7.0_80.
Primero se usa el siguiente comando <add-apt-repository ppa:webupd8team/java>, luego 
<apt-get update>, luego <apt-get install oracle-java7-installer>, y al final se usa
<apt-get install oracle-java7-set-default>

Netbeans -Requiere JDK instalado.
Se descarga el archivo netbeans-8.1-linux.sh de la pagina http://download.netbeans.org/netbeans/8.1/final/bundles/netbeans-8.1-linux.sh,
luego de descargado, se abre la consola en la carpeta de descarga y se utiliza el comando <chmod +x netbeans-8.1-linux.sh>
y luego se utiliza el comando <sh netbeans-8.1-linux.sh>. Este ultimo abre el wizard de instalacion de netbeans, y en este
se configuran las especificaciones necesarias.

Git
Se utiliza el comando <apt-get install git>

Hibernate, Java Server Faces y GlassFish estan incluidos en el paquete de Netbeans.


RESPUESTAS

1. Sin contar el tiempo de descarga y de instalacion, como unas 3 horas.

2. hibernate.cfg.xml es el nombre del archivo de configuracion.
Masomenos, los problemas surgieron al crear el archivo de hibernate.reveng.xml , porque la primera vez que hice la coneccion
la hice desde la creacion de hibernate.cfg.xml y no conectaba bien, luego descubri que se debia de hacer al crear el proyecto 
y de esa manera ese archivo se creaba "automaticamente", y por otro lado tuve el problema que no reconocia las tablas
de mi base, y esto era porque los nombres de las tablas estaban en mayusculas.

DISEÑO

Mi diseño para el manejo de usuarios contiene: el nombre del usuario (con este se identifica), su correo, y su contraseña
y lo divido en dos tablas, en una el nombre de usuario y el correo y en otro su contraseña, cada tabla con un id y la 
tabla de contraseña tiene una llave foranea al id de usuario.
