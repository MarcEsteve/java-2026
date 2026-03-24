# Java Web 2026

Repositorio de prácticas y ejemplos Java orientados a web con Spring MVC, Maven y despliegue en Apache Tomcat.

## Contexto actual del workspace

El workspace contiene tres bloques principales:

- `Primer/`: ejemplo base Java web (Hola Mundo).
- `spring-mvc-akkodis/`: aplicación Spring MVC funcional con empaquetado WAR.
- `springmvcapp/`: segundo módulo Maven WAR en preparación/estructura base.

También existe configuración local de servidor en:

- `Servers/Tomcat v11.0 Server at localhost-config/`

## Stack tecnológico

- Java
- Spring MVC
- Maven
- Apache Tomcat 11
- JSP (vistas)

## Módulo: spring-mvc-akkodis

Ruta: `spring-mvc-akkodis/`

Estado:

- Proyecto Maven empaquetado como WAR.
- Controlador principal: `src/main/java/com/example/HomeController.java`
- Vista principal: `src/main/webapp/WEB-INF/views/hello-world.jsp`
- Configuración Spring MVC XML: `src/main/webapp/WEB-INF/spring-mvc-config.xml`
- Descriptor web: `src/main/webapp/WEB-INF/web.xml`

Dependencias principales (pom actual):

- `org.springframework:spring-webmvc:6.1.8`
- `jakarta.servlet.jsp.jstl:jakarta.servlet.jsp.jstl-api:3.0.0`
- `javax.servlet:javax.servlet-api:4.0.1` (provided)

Comandos Maven:

```powershell
cd spring-mvc-akkodis
mvn clean package
```

Resultado esperado:

- WAR generado en `spring-mvc-akkodis/target/`

## Módulo: springmvcapp

Ruta: `springmvcapp/`

Estado:

- Proyecto Maven empaquetado como WAR.
- Java configurado a versión 21 en `pom.xml`.
- Dependencias Spring 7.0.6 y Jakarta Servlet 6.1.0.
- Estructura de carpetas creada, actualmente sin clases/controladores/vistas dentro de `src/main`.

Comandos Maven:

```powershell
cd springmvcapp
mvn clean package
```

Resultado esperado:

- WAR generado en `springmvcapp/target/`

## Tomcat 11 en el workspace

Configuración de servidor disponible en:

- `Servers/Tomcat v11.0 Server at localhost-config/server.xml`
- `Servers/Tomcat v11.0 Server at localhost-config/context.xml`
- `Servers/Tomcat v11.0 Server at localhost-config/web.xml`

Flujo típico de ejecución:

1. Compilar y empaquetar con Maven (`mvn clean package`).
2. Desplegar el WAR en Tomcat 11 (desde IDE o copiando a `webapps`).
3. Abrir en navegador la URL según contexto del WAR.

## Nota de compatibilidad importante

Tomcat 11 usa el namespace Jakarta (`jakarta.*`).

Actualmente, `spring-mvc-akkodis` declara `javax.servlet-api:4.0.1`, lo que puede causar incompatibilidades en tiempo de ejecución sobre Tomcat 11. Si aparece error de clases Servlet/JSP, migrar dependencias y descriptores al stack Jakarta para alinearlo con Tomcat 11.

## Próximos pasos recomendados

1. Unificar ambos módulos al mismo stack Jakarta + Spring compatible con Tomcat 11.
2. Añadir controlador y vista de prueba en `springmvcapp`.
3. Documentar URL final de cada app una vez desplegada.