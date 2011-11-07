testRESTWSwithJersey
====================
readme
======
Progetto web dinamico "eclipse style"
(da usarsi in IDE grafico eclipse come progetto web dinamico)
per test REST webservices con Jersey

RIF.
----
http://jersey.java.net/nonav/documentation/latest/user-guide.html

PRE-REQUISITI
-------------
jdk 1.6
jre 1.6 in runtime (Tomcat6 o equivalente appserver che supporta jre1.6)

SVILUPPO
--------
cartella trunk dedicata allo sviluppo corrente
Nota :
una volta creata la propria "copia" locale
se è una working copy
non gestire sul repository di versionamento
le seguenti cartelle
	bin
	build
	package
i seguenti files
	make/local.properties
	make/application-version.properties
	local/*

CONFIGURAZIONE
--------------
1)copiare docs/template_local.properties
  in make rinominandolo local.properties
  ed adeguarne il contenuto
2)copiare docs/template_application-version.properties
  in make rinominandolo application-version.properties
  ed adeguarne il contenuto
3)api specifiche
	3.1)log4j
	copiare docs/template_log4j.properties
	in local rinominandolo log4j.properties
	ed adeguarne il contenuto




USO
---
1)ciclo di vita
  1.1)ripulitura
  ant clean-all  
  2.2)compilazione
  ant compile
  2.3)build war
  ant build-war
  2.4)packaging war
      ant package-war
