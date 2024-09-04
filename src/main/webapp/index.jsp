<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gestión de Proyectos de Software</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <jsp:include page="components/header.jsp"></jsp:include>

    <section id="hero">
        <div class="container">
            <h2>Transformamos Ideas en Software de Calidad</h2>
            <p>Tu éxito es nuestro compromiso. Gestionamos todo el ciclo de vida de tu proyecto de software.</p>
            <a href="#services" class="btn">Conoce Nuestros Servicios</a>
        </div>
    </section>

    <section id="about">
        <div class="container">
            <h2>Sobre Nosotros</h2>
            <p>Somos una empresa especializada en la gestión de proyectos de desarrollo de software. Contamos con un equipo de expertos en metodología ágil, planificación, y ejecución de proyectos que aseguran la entrega de soluciones de alta calidad.</p>
        </div>
    </section>

    <section id="services">
        <div class="container">
            <h2>Servicios</h2>
            <div class="service">
                <h3>Planificación de Proyectos</h3>
                <p>Diseñamos un plan detallado para asegurar que tu proyecto se complete a tiempo y dentro del presupuesto.</p>
            </div>
            <div class="service">
                <h3>Desarrollo Ágil</h3>
                <p>Implementamos metodologías ágiles para desarrollar software de manera eficiente y adaptativa.</p>
            </div>
            <div class="service">
                <h3>Control de Calidad</h3>
                <p>Realizamos pruebas exhaustivas para asegurar la calidad y el rendimiento del software antes de su lanzamiento.</p>
            </div>
        </div>
    </section>

    <section id="testimonials">
        <div class="container">
            <h2>Testimonios</h2>
            <div class="testimonial">
                <p>"El equipo fue increíble, entregaron nuestro proyecto a tiempo y superaron nuestras expectativas."</p>
                <h4>- Cliente Satisfecho</h4>
            </div>
            <div class="testimonial">
                <p>"La comunicación y la calidad del trabajo fueron excepcionales, los recomendaría sin dudarlo."</p>
                <h4>- Otro Cliente</h4>
            </div>
        </div>
    </section>

        <jsp:include page="components/footer.jsp"></jsp:include>
</body>
</html>
