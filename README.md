# Spring Boot Projects Documentation

Este repositorio contiene una colección de proyectos Spring Boot sencillos diseñados como documentación y ejemplos de aprendizaje.

## 📁 Estructura del Repositorio

```
JavaSpringBoot/
├── crud/              # Aplicación CRUD básica con gestión de usuarios
└── README.md          # Este archivo
```

## 🚀 Proyectos Incluidos

### 1. CRUD Application
**Ubicación:** `/crud`

Una aplicación REST API completa que implementa operaciones CRUD (Create, Read, Update, Delete) para la gestión de usuarios.

#### Características:
- ✅ API RESTful con Spring Boot 3.5.5
- ✅ Persistencia de datos con Spring Data JPA
- ✅ Base de datos MySQL
- ✅ Operaciones CRUD completas
- ✅ Arquitectura por capas (Controller, Service, Repository)

#### Stack Tecnológico:
- **Framework:** Spring Boot 3.5.5
- **Java:** 17
- **Base de Datos:** MySQL
- **ORM:** Spring Data JPA
- **Build Tool:** Maven

#### Estructura del Proyecto:
```
crud/
├── src/main/java/com/api/crud/
│   ├── controllers/     # Controladores REST
│   ├── models/         # Entidades/Modelos
│   ├── repositories/   # Interfaces de repositorio
│   ├── services/       # Lógica de negocio
│   └── CrudApplication.java
└── pom.xml
```

## 🛠️ Requisitos Previos

- **Java 17** o superior
- **Maven 3.6+**
- **MySQL 8.0+** (para proyectos que lo requieran)
- **IDE recomendado:** IntelliJ IDEA, Eclipse, o VS Code

## 🏃‍♂️ Cómo Ejecutar los Proyectos

### Opción 1: Con Maven
```bash
cd [nombre-del-proyecto]
./mvnw spring-boot:run
```

### Opción 2: Con JAR
```bash
cd [nombre-del-proyecto]
./mvnw clean package
java -jar target/[nombre-del-jar].jar
```

## 📚 Propósito Educativo

Este repositorio está diseñado para:

- **Estudiantes** que aprenden Spring Boot
- **Desarrolladores** que buscan ejemplos prácticos
- **Referencias rápidas** de implementaciones comunes
- **Documentación** de patrones y mejores prácticas

## 🎯 Objetivos de Aprendizaje

Cada proyecto demuestra:
- Configuración básica de Spring Boot
- Implementación de APIs REST
- Manejo de bases de datos
- Arquitectura de aplicaciones
- Mejores prácticas de desarrollo

## 📝 Contribuciones

Este repositorio está en constante evolución. Se irán agregando más proyectos que cubran diferentes aspectos de Spring Boot:

- [ ] Autenticación y Autorización (Spring Security)
- [ ] Microservicios
- [ ] Testing con JUnit y Mockito
- [ ] Documentación con Swagger/OpenAPI
- [ ] Manejo de excepciones
- [ ] Validaciones

## 📧 Contacto

Para preguntas o sugerencias sobre estos proyectos de ejemplo, no dudes en crear un issue en este repositorio.

---
*Repositorio de documentación y aprendizaje de Spring Boot*