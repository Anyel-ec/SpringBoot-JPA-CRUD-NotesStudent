### Proyecto 1: SpringBoot-Notes
# SpringBoot-ManagerNotes of Student
 El objetivo principal de esta API es gestionar las calificaciones de estudiantes en diferentes áreas de evaluación.

## Características

- Gestión de estudiantes y sus calificaciones.
- API documentada con Swagger para facilitar la interacción.
- Persistencia de datos en una base de datos MySQL.

## Configuración del Entorno

### MySQL

Configura tu base de datos MySQL utilizando los siguientes parámetros:

```properties
spring.datasource.url = jdbc:mysql://localhost:3306/prueba_u3_distribuidas
spring.datasource.username = root
spring.datasource.password = anyel
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```

### Swagger

El acceso a la documentación de la API está habilitado y puede ser consultado en la siguiente ruta:

```properties
springdoc.swagger-ui.path=/swagger-ui.html
```

## Configuración de Hibernate

La configuración de Hibernate está definida para que se actualice automáticamente la estructura de la base de datos en cada inicio de la aplicación:

```properties
spring.jpa.hibernate.ddl-auto = update
```

## Endpoints Principales

- **Guardar estudiante y notas:** `POST /api/v1/appd/guardar`
- **Contar estudiantes con notas:** `GET /api/v1/appd/count`
- **Obtener estudiantes con calificación mayor o igual:** `GET /api/v1/appd/calificacionMayorIgual/{calificacion}`
- **Obtener estudiantes con calificación menor:** `GET /api/v1/appd/calificacionMenor/{calificacion}`
- **Obtener estudiantes por rango de calificaciones:** `GET /api/v1/appd/rango?minApp={minApp}&maxApp={maxApp}`

## Documentación

La documentación de la API está disponible en:

```
http://localhost:8080/swagger-ui.html
```

## Autor

Desarrollado por Anyel EC | [cyberdevmatrix@gmail.com](mailto:cyberdevmatrix@gmail.com)


### Proyecto 2: Introduce-CRUD-MongoDB
# Introduce-CRUD-MongoDB

Este proyecto es una API desarrollada con Spring Boot que realiza operaciones CRUD en una base de datos MongoDB. Se enfoca en el manejo de números y la determinación de si son primos.

## Características

- Generación y almacenamiento de números en una base de datos MongoDB.
- Cálculo de números primos.
- API documentada con Swagger para facilitar la interacción.

## Configuración del Entorno

### MongoDB

Configura tu base de datos MongoDB utilizando los siguientes parámetros:

```properties
spring.data.mongodb.host = localhost 
spring.data.mongodb.port = 27017 
spring.data.mongodb.database = prueba_primos
```

### Swagger

El acceso a la documentación de la API está habilitado y puede ser consultado en la siguiente ruta:

```properties
springdoc.swagger-ui.path=/swagger-ui.html
```

## Endpoints Principales

- **Guardar números hasta un límite especificado:** `POST /api/appd/numeros?limiteApp={limiteApp}`

## Documentación

La documentación de la API está disponible en:

```
http://localhost:8080/swagger-ui.html
```

## Autor

Desarrollado por Anyel EC | [cyberdevmatrix@gmail.com](mailto:cyberdevmatrix@gmail.com)
