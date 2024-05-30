<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
    <div class="container">

        <div class="section-title">
        <h2>Contact Us</h2>
        <p>Do you want to know more information Reach us and we will guide you into this new world</p>
        </div>

        <div class="row">

        <div class="col-lg-4 col-md-6">
            <div class="contact-about">
            <h3>Celeb Business</h3>
            <p>The experts are waiting for you. Please follow us. links to our official
                social media accounts
            </p>
            <div class="social-links">
                <a href="#" class="twitter"><i class="icofont-twitter"></i></a>
                <a href="#" class="facebook"><i class="icofont-facebook"></i></a>
                <a href="#" class="instagram"><i class="icofont-instagram"></i></a>
                <a href="#" class="linkedin"><i class="icofont-linkedin"></i></a>
            </div>
            </div>
        </div>

        <div class="col-lg-3 col-md-6">
            <div class="info">
            <div>
                <i class="icofont-google-map"></i>
                <p>A108 Adam Street<br>New York, NY 535022</p>
            </div>

            <div>
                <i class="icofont-envelope"></i>
                <p>info@celeb-business.com</p>
            </div>

            <div>
                <i class="icofont-phone"></i>
                <p>+1 5589 55488 55</p>
            </div>

            </div>
        </div>

        <div class="col-lg-5 col-md-12">
            <form action="contact" method="post" role="form" class="php-email-form">

                <div class="form-group">
                    <input type="text" name="name" class="form-control" id="name" placeholder="Your Name" data-rule="minlen:4" data-msg="Please enter at least 4 chars" />
                    <div class="validate"></div>
                </div>

                <div class="form-group">
                    <input type="email" class="form-control" name="email" id="email" placeholder="Your Email" data-rule="email" data-msg="Please enter a valid email" />
                    <div class="validate"></div>
                </div>

                <div class="form-group">
                    <input type="text" class="form-control" name="subject" id="subject" placeholder="Subject" data-rule="minlen:4" data-msg="Please enter at least 8 characterers of subject" />
                    <div class="validate"></div>
                </div>

                <div class="form-group">
                    <textarea class="form-control" name="message" id="message" rows="5" data-rule="required" data-msg="Please write something for us", placeholder="Message">

                    </textarea>
                    <div class="validate"></div>
                </div>

                <div class="mb-3">
                    <div class="loading">Loading</div>
                    <div class="error-message"></div>
                    <div class="sent-message">You are now part of this selected and great family. Thank you!</div>
                </div>
                <div class="text-center"><button type="submit">Send Message</button></div>

            </form>
        </div>

        </div>

    </div>

</html>