<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>

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
    
    <section id="registration" class="contact section-bg">
      <div class="container">

        <div class="section-title">
          <h2>Be part of our family!</h2>
          <p>Please fill out the following registration form and enjoy of be part of the greatest celebrity
              association in the world!
          </p>
        </div>

        <div class="row">

          <div class="col-lg-5 col-md-12">
            <form action="register" method="post" role="form" class="php-email-form"> 

              <div class="form-group">
                <input type="text" name="document" class="form-control" id="name" placeholder="Your Document Number" data-rule="minlen:4" data-msg="Please enter at least 4 chars" />
                <div class="validate"></div>
              </div>

              <div class="form-group">
                <input type="text" name="name" class="form-control" id="name" placeholder="Your Name" data-rule="minlen:4" data-msg="Please enter at least 4 chars" />
                <div class="validate"></div>
              </div>

              <div class="form-group">
                <input type="text" name="second-name" class="form-control" id="second-name" placeholder="Your Second Name" data-rule="minlen:4" data-msg="Please enter at least 4 chars" />
                <div class="validate"></div>
              </div>

              <div class="form-group">
                <input type="text" name="lastname1" class="form-control" id="lastname1" placeholder="Your Surname" data-rule="minlen:4" data-msg="Please enter at least 4 chars" />
                <div class="validate"></div>
              </div>

              <div class="form-group">
                <input type="text" name="lastname2" class="form-control" id="lastname2" placeholder="Your Second Surname" data-rule="minlen:4" data-msg="Please enter at least 4 chars" />
                <div class="validate"></div>
              </div>

              <div class="form-group">
                <input type="text" name="birthplace" class="form-control" id="birthplace" placeholder="Your Birth Place" data-rule="minlen:4" data-msg="Please enter at least 4 chars" />
                <div class="validate"></div>
              </div>

              <div class="form-group">
                <input type="text" name="hometown" class="form-control" id="hometown" placeholder="Your Current Hometown" data-rule="minlen:4" data-msg="Please enter at least 4 chars" />
                <div class="validate"></div>
              </div>

              <div class="form-group">
                <input type="text" name="address" class="form-control" id="address" placeholder="Your Address" data-rule="minlen:4" data-msg="Please enter at least 4 chars" />
                <div class="validate"></div>
              </div>

              <div class="form-group">
                <input type="text" name="cell-phone" class="form-control" id="cell-phone" placeholder="Your Cell Phone Number" data-rule="minlen:4" data-msg="Please enter at least 4 chars" />
                <div class="validate"></div>
              </div>

              <div class="form-group">
                <input type="email" class="form-control" name="email" id="email" placeholder="Your Email" data-rule="email" data-msg="Please enter a valid email" />
                <div class="validate"></div>
              </div>

              <div class="mb-3">
                <div class="loading">Loading</div>
                <div class="error-message"></div>
                <div class="sent-message">You are now part of this selected and great family. Thank you!</div>
              </div>
              <div class="text-center"><button type="submit">Register</button></div>
            </form>
          </div>

        </div>

      </div>
    </section>  
  </body>

   <!-- Vendor JS Files -->
   <script src="assets/vendor/jquery/jquery.min.js"></script>
   <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
   <script src="assets/vendor/jquery.easing/jquery.easing.min.js"></script>
   <script src="assets/vendor/php-email-form/validate.js"></script>
   <script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
   <script src="assets/vendor/venobox/venobox.min.js"></script>

   <!-- Template Main JS File -->
   <script src="assets/js/main.js"></script>
    
</html>