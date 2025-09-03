# Spring Boot Projects Documentation

Este repositorio contiene una colección de proyectos Spring Boot sencillos diseñados como documentación y ejemplos de aprendizaje.

## 📁 Estructura del Repositorio

```
JavaSpringBoot/
├── crud/              # Aplicación CRUD básica con gestión de usuarios
├── jpaproject/        # Implementación avanzada con DTOs y proyecciones
├── ValidationBasic/   # Validaciones con Bean Validation
├── kubernetes-crud/   # Aplicación CRUD con configuración para Kubernetes y autoscaling
└── README.md          # Este archivo
```

## 🚀 Proyectos Incluidos

### 1. CRUD Application
**Ubicación:** `/crud`  
Aplicación REST API completa que implementa operaciones CRUD (Create, Read, Update, Delete) para la gestión de usuarios.

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

---

### 2. JPA Project with DTOs
**Ubicación:** `/jpaproject`  
Proyecto avanzado que demuestra el uso de DTOs y proyecciones de Spring Data JPA para optimizar la transferencia de datos.

---

### 3. Kubernetes CRUD Application
**Ubicación:** `/kubernetes-crud`  
Aplicación CRUD empaquetada y desplegada en Kubernetes con soporte para escalado automático.

#### Características:
- ✅ Despliegue en contenedores con Docker  
- ✅ Manifiestos de Kubernetes (`Deployment`, `Service`, `ConfigMap`, `Secret`)  
- ✅ Exposición mediante **LoadBalancer / Ingress**  
- ✅ Configuración de recursos (CPU / memoria)  
- ✅ **Horizontal Pod Autoscaler (HPA)** para escalar dinámicamente según métricas  
- ✅ Integración con MySQL dentro o fuera del clúster  

#### Ejemplo de despliegue:
```bash
# Construir la imagen
docker build -t usuario/java-crud:latest .

# Subir a Docker Hub
docker push usuario/java-crud:latest

# Aplicar despliegue en Kubernetes
kubectl apply -f k8s/deployment.yaml
kubectl apply -f k8s/service.yaml

# Configurar HPA
kubectl autoscale deployment crud-deployment --cpu-percent=70 --min=2 --max=10
```

#### Estructura:
```
kubernetes-crud/
├── src/main/java/com/api/k8scrud/   # Código fuente
├── pom.xml
└── k8s/
    ├── deployment.yaml
    ├── service.yaml
    ├── ingress.yaml
    └── hpa.yaml
```

---

## 🛠️ Requisitos Previos
- **Java 17** o superior  
- **Maven 3.6+**  
- **MySQL 8.0+** (para proyectos que lo requieran)  
- **Docker & Kubernetes (kubectl, minikube o cluster en la nube)**  
- **IDE recomendado:** IntelliJ IDEA, Eclipse, o VS Code  

---

## 📚 Propósito Educativo
Este repositorio está diseñado para:
- **Estudiantes** que aprenden Spring Boot  
- **Desarrolladores** que buscan ejemplos prácticos  
- **Referencias rápidas** de implementaciones comunes  
- **Documentación** de patrones y mejores prácticas  

---

## 🎯 Objetivos de Aprendizaje
Cada proyecto demuestra:
- Configuración básica de Spring Boot  
- Implementación de APIs REST  
- Manejo de bases de datos  
- Arquitectura de aplicaciones  
- Validaciones y manejo de errores  
- Patrón DTO y proyecciones JPA  
- **Despliegue en Kubernetes y escalado automático**  
- Mejores prácticas de desarrollo  

---

## 📝 Contribuciones
Este repositorio está en constante evolución. Se irán agregando más proyectos que cubran diferentes aspectos de Spring Boot:
- [ ] Autenticación y Autorización (Spring Security)  
- [ ] Microservicios  
- [ ] Testing con JUnit y Mockito  
- [ ] Documentación con Swagger/OpenAPI  
- [ ] Manejo de excepciones  
- [x] Validaciones  
- [x] DTOs y Proyecciones JPA  
- [x] Deployment con Kubernetes y Autoscaling  

---

## 📧 Contacto
Para preguntas o sugerencias sobre estos proyectos de ejemplo, no dudes en crear un issue en este repositorio.

---

*Repositorio de documentación y aprendizaje de Spring Boot*
