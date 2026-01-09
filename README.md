<div align="center">
  <img
    src="https://github.com/user-attachments/assets/cb3f82c7-9cbc-4a10-ab12-1efc4e9a5828"
    alt="Churn Insight Logo"
    width="200"
  />
</div>

<h1 align="center">📊 Churn Insight</h1>

<h3 align="center">Plataforma de Análisis y Predicción de Cancelación de Clientes</h3>

<hr/>

<h2>🧠 Descripción del Proyecto</h2>

<p>
<b>Churn Insight</b> es una plataforma web diseñada para analizar y predecir la cancelación de clientes 
(<i>customer churn</i>) mediante modelos de Machine Learning.
</p>

<p>
El sistema permite a los usuarios realizar predicciones individuales, consultar clientes por ID
y visualizar estadísticas agregadas mediante gráficas interactivas.
</p>

<p>
El proyecto está construido bajo una arquitectura de microservicios, donde este repositorio contiene:
</p>

<ul>
    <li>Frontend Web</li>
    <li>Backend desarrollado en Spring Boot (API Gateway)</li>
</ul>

<p>
El modelo de Machine Learning es consumido desde un microservicio externo desarrollado en FastAPI.
</p>

<hr/>

<h2>🏗️ Arquitectura del Sistema</h2>

<pre>
[ Frontend Web (HTML + CSS + JavaScript + Chart.js) ]
                    ↓
[ Backend Spring Boot (API Gateway / Orquestador) ]
                    ↓
[ Microservicio ML Externo (FastAPI) ]
</pre>

<hr/>
<hr/>

<h2>🧩 Componentes del Proyecto</h2>

<h3>🔹 Frontend</h3>

<p>
Interfaz web que permite la interacción del usuario con el sistema de predicción y análisis.
</p>

<b>Funcionalidades:</b>
<ul>
    <li>Cálculo manual de churn</li>
    <li>Búsqueda de clientes por ID</li>
    <li>Visualización de estadísticas</li>
    <li>Gráficas dinámicas</li>
</ul>

<b>Tecnologías:</b>
<ul>
    <li>HTML5</li>
    <li>CSS3</li>
    <li>JavaScript</li>
    <li>Chart.js</li>
</ul>

<hr/>

<div align="center">
  <img 
    src="https://github.com/user-attachments/assets/9b8b97ad-425b-460a-aca0-d5392ccf20b5"
    alt="Imagen 1"
    width="500"
  />
  </div>
<div align="center">
  <img 
    src="https://github.com/user-attachments/assets/83fc8fbb-39a8-49fd-8a94-3ad996c4ea38"
    alt="Imagen 2"
    width="500"
  />
</div>

<div align="center">
  <img 
    src="https://github.com/user-attachments/assets/09ca3e39-af43-477e-9d6f-fc9ddc1dd6a4"
    alt="Imagen 3"
    width="500"
  />
</div>

<h3>🔹 Backend (Spring Boot)</h3>

<p>
Servicio principal que actúa como intermediario entre el frontend y el microservicio de Machine Learning.
</p>

<b>Responsabilidades:</b>
<ul>
    <li>Exposición de endpoints REST</li>
    <li>Comunicación con el microservicio FastAPI</li>
    <li>Transformación y estandarización de respuestas</li>
    <li>Orquestación de predicciones y estadísticas</li>
</ul>

<b>Tecnologías:</b>
<ul>
    <li>Java 17</li>
    <li>Spring Boot</li>
    <li>Spring Web</li>
    <li>RestTemplate</li>
    <li>Maven</li>
    <li><b>Lombok</b></li>
</ul>

<hr/>
<div align="center">
  <img src="https://github.com/user-attachments/assets/9a59aa0b-1acb-484b-ad6e-f7f5102a513c" 
    alt="Imagen4 "
    width="500"/>
</div>


<h2>🔌 Endpoints del Backend</h2>

<h3>📍 Predicción</h3>
<ul>
    <li><b>POST /predict</b> – Predicción manual de churn</li>
    <li><b>GET /predict/client/{id}</b> – Consulta de cliente por ID</li>
</ul>

<h3>📈 Análisis Avanzado</h3>
<ul>
    <li><b>GET /probability/gender</b></li>
    <li><b>GET /probability/region</b></li>
    <li><b>GET /probability/subscription</b></li>
    <li><b>GET /probability/age</b></li>
</ul>

<hr/>

<h2>📊 Visualizaciones</h2>

<table border="1" cellpadding="8">
    <tr>
        <th>Análisis</th>
        <th>Tipo de Gráfica</th>
    </tr>
    <tr>
        <td>Género</td>
        <td>Barras</td>
    </tr>
    <tr>
        <td>Región</td>
        <td>Barras Horizontales</td>
    </tr>
    <tr>
        <td>Suscripción</td>
        <td>Gráfica de Pastel</td>
    </tr>
    <tr>
        <td>Edad</td>
        <td>Comparativa</td>
    </tr>
</table>

<hr/>

<h2>🐳 Ejecución con Docker</h2>

<pre>
docker-compose up --build
</pre>

<p>
La aplicación estará disponible en:
</p>

<pre>
http://localhost:8080
</pre>

<hr/>

<h2>▶️ Ejecución Local</h2>

<h3>Backend</h3>

1. **Clonar el repositorio**
```bash
git clone https://github.com/dracostack/churninsight-api.git
cd churninsight-api
```

2. **Compilar el proyecto**
```bash
mvn clean install
```

3. **Ejecutar la aplicación**
```bash
mvn spring-boot:run
```

La API estará disponible en http://localhost:8080

<hr/>

<h2>⚠️ Dependencias Externas</h2>

<p>
Este proyecto depende de un microservicio externo de Machine Learning que debe estar activo para el
funcionamiento correcto de las predicciones y estadísticas.
</p>

<hr/>

## Equipo DracoStack

Este proyecto es desarrollado en colaboración por:

### Backend (API REST, integración, persistencia)
- [Hernán Cerda](https://www.linkedin.com/in/hernán-ignacio-cerda-bustíos-60050b52/)
- [Silvia Hernández](https://www.linkedin.com/in/silvia-hernández-márquez-85597b341/)
- [Aldo Sánchez](https://www.linkedin.com/in/aldosanchezdev/)

<hr/>

<h2>📌 Notas Finales</h2>

<ul>
    <li>El backend Spring Boot funciona como API Gateway</li>
    <li>El frontend nunca consume directamente el microservicio de ML</li>
    <li>Arquitectura desacoplada y escalable</li>
</ul>
