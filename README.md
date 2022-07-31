# template-Crud-Java

Objetivo :

Estoy dejando un template java basico para contar con un crud en las próximas páginas que hagamos.

Descripcion : 

El archivo properties se encuentra configurado con 2 deploys hechos 1 en heroku (BackEnd) y 1 en clevercloud ( base de datos ).

Propiedades: 

La plantilla contiene un Crud completo con un login JWT (Login y Nuevo Usuario) .

A tener en cuenta: 

Para poder hacer un PR, prestar atención a estos pasos. Luego de tener acceso al proyecto, dentro del paquete "Security" --> Ir a descomentar la Clase
que se encuentra dentro del paquete "Util", la misma hace que se puedan cargar los 2 (dos) "Roles" en la tabla "Rol" de la Base de Datos, de todas formas
si no lo puede hacer manual desde "phpmyAdmin" por ejemplo. Con eso sería suficiente.

Atencion: 

Recorda que el archivo properties contiene las credenciales del deploy (user-name , password y jdbc:mysql:) entonces , si vas a trabajar de forma local aprovecha y
 hace los cambios correspondiente con tus credenciales locales. 
