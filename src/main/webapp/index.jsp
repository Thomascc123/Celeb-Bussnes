<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta content="width=device-width, initial-scale=1.0" name="viewport">

        <title>Celeb Business</title>
        <meta content="" name="descriptison">
        <meta content="" name="keywords">

        <!-- Favicons -->
        <link href="assets/img/logo2.jpg" rel="icon">
        <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Lato:400,300,700,900" rel="stylesheet">

        <!-- Vendor CSS Files -->
        <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="assets/vendor/animate.css/animate.min.css" rel="stylesheet">
        <link href="assets/vendor/icofont/icofont.min.css" rel="stylesheet">
        <link href="assets/vendor/venobox/venobox.css" rel="stylesheet">

        <!-- Template Main CSS File -->
        <link href="assets/css/style.css" rel="stylesheet">

    </head>

    <body>
        <%@ include file="header.jsp" %>
        <!-- ======= Hero Section ======= -->
        <section id="hero">
            <div class="hero-container">
            <h1>Welcome to Celeb Business</h1>
            <h2>The site where all celebrities can buy and sell their properties and more!</h2>
            <a href="register.jsp" class="btn-get-started scrollto">Get Started</a>
            </div>
        </section><!-- #hero -->

        <main id="main">

            <!-- ======= About Us Section ======= -->
            <section id="about" class="about">
                <%@ include file="about.jsp" %>
            </section><!-- End About Us Section -->

            <!-- ======= Services Section ======= -->
            <section id="services" class="services section-bg">
                <%@ include file="services.jsp" %>
            </section><!-- End Services Section -->

            <!-- ======= Call To Action Section ======= -->
            <section class="call-to-action">
                <div class="container">

                    <div class="text-center">
                    <h3>Call To Action</h3>
                    <p> Start the experience with us </p>
                    <a class="cta-btn" href="#">Call To Action</a>
                    </div>

                </div>
            </section><!-- End Call To Action Section -->

            <!-- ======= Properties Section ======= -->
            <section id="properties" class="portfolio">
                <%@ include file="properties.jsp" %>
            </section><!-- End Our Portfolio Section -->

            <!-- ======= Frequently Asked Questions Section ======= -->
            <section id="faq" class="faq section-bg">
                <%@ include file="faq.jsp" %>
            </section><!-- End Frequently Asked Questions Section -->

            <!-- ======= Our Team Section ======= -->
            <section id="team" class="team">
                <%@ include file="team.jsp" %>
            </section><!-- End Our Team Section -->

            <!-- ======= Contact Us Section ======= -->
            <section id="contact" class="contact section-bg">
                <%@ include file="contact.jsp" %>
            </section><!-- End Contact Us Section -->

            <!-- ======= Map Section ======= -->
            <section class="map">
            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3024.2219901290355!2d-74.00369368400567!3d40.71312937933185!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x89c25a23e28c1191%3A0x49f75d3281df052a!2s150%20Park%20Row%2C%20New%20York%2C%20NY%2010007%2C%20USA!5e0!3m2!1sen!2sbg!4v1579767901424!5m2!1sen!2sbg" frameborder="0" style="border:0;" allowfullscreen=""></iframe>
            </section><!-- End Map Section -->

        </main><!-- End #main -->

        <!-- ======= Footer ======= -->
        <footer id="footer">
            <div class="container">
            <div class="copyright">
                &copy; Copyright <strong><span>Celeb Business</span></strong>. All Rights Reserved
            </div>
            <div class="credits">
                <!-- All the links in the footer should remain intact. -->
                <!-- You can delete the links only if you purchased the pro version. -->
                <!-- Licensing information: https://bootstrapmade.com/license/ -->
                <!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/free-one-page-bootstrap-template-amoeba/ -->
                Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
            </div>
            </div>
        </footer><!-- End #footer -->

        <a href="#" class="back-to-top"><i class="icofont-simple-up"></i></a>

        <!-- Vendor JS Files -->
        <script src="assets/vendor/jquery/jquery.min.js"></script>
        <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="assets/vendor/jquery.easing/jquery.easing.min.js"></script>
        <script src="assets/vendor/php-email-form/validate.js"></script>
        <script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
        <script src="assets/vendor/venobox/venobox.min.js"></script>

        <!-- Template Main JS File -->
        <script src="assets/js/main.js"></script>

    </body>
</html>