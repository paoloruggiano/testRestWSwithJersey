template-j2ee-dynamic-webproject-eclipsestyle
=============================================
readme(s)
=============================================
Template di progetto web dinamico "eclipse style"
(da usarsi in IDE grafico eclipse come progetto web dinamico)

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

4)per eclipse ID
- copiare in root .project e .classpath e .settings
adeguare .project
in .settings adeguare org.eclipse.wst.common.component


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
