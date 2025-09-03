# Spring Boot Projects Documentation

Este repositorio contiene una colección de proyectos Spring Boot sencillos diseñados como documentación y ejemplos de aprendizaje.

## 📁 Estructura del Repositorio

```
JavaSpringBoot/
├── crud/              # Aplicación CRUD básica con gestión de usuarios
├── jpaproject/        # Implementación avanzada con DTOs y proyecciones
├── ValidationBasic/   # Validaciones con Bean Validation
├── kubernetes-crud/   # Aplicación CRUD con configuración para Kubernetes
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
- ✅ Validaciones de entrada con Bean Validation

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

### 2. JPA Project with DTOs
**Ubicación:** `/jpaproject`

Proyecto avanzado que demuestra el uso de DTOs (Data Transfer Objects) y proyecciones de Spring Data JPA para optimizar la transferencia de datos.

#### Características:
- ✅ Implementación de DTOs con Lombok
- ✅ Proyecciones basadas en clases
- ✅ Proyecciones basadas en interfaces (abiertas y cerradas)
- ✅ Separación clara entre entidades y DTOs
- ✅ Optimización de consultas JPA
- ✅ Gestión de productos y locales

#### Stack Tecnológico:
- **Framework:** Spring Boot 3.5.5
- **Java:** 17
- **Base de Datos:** MySQL
- **ORM:** Spring Data JPA
- **Utilidades:** Lombok
- **Build Tool:** Maven

#### Estructura del Proyecto:
```
jpaproject/
├── src/main/java/com/dto/jpaproject/
│   ├── controller/              # Controladores REST
│   ├── models/                 # Entidades JPA
│   ├── projection/
│   │   ├── classbased/        # DTOs basados en clases
│   │   └── interfacebased/    # Proyecciones de interfaces
│   ├── repository/            # Repositorios JPA
│   ├── service/              # Servicios e implementaciones
│   └── JpaprojectApplication.java
└── pom.xml
```



## 🛠️ Requisitos Previos

- **Java 17** o superior
- **Maven 3.6+**
- **MySQL 8.0+** (para proyectos que lo requieran)
- **IDE recomendado:** IntelliJ IDEA, Eclipse, o VS Code



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
- Validaciones de entrada y manejo de errores
- Patrón DTO y proyecciones JPA
- Optimización de consultas de base de datos
- Mejores prácticas de desarrollo

## 📝 Contribuciones

Este repositorio está en constante evolución. Se irán agregando más proyectos que cubran diferentes aspectos de Spring Boot:

- [ ] Autenticación y Autorización (Spring Security)
- [ ] Microservicios
- [ ] Testing con JUnit y Mockito
- [ ] Documentación con Swagger/OpenAPI
- [ ] Manejo de excepciones
- [x] Validaciones
- [x] DTOs y Proyecciones JPA
- [ ] Deployment con Kubernetes

## 📧 Contacto

Para preguntas o sugerencias sobre estos proyectos de ejemplo, no dudes en crear un issue en este repositorio.

---
*Repositorio de documentación y aprendizaje de Spring Boot*
