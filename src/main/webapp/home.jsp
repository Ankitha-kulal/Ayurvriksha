<!DOCTYPE html>
<html lang="en" ng-app="myApp">
<head>
    <!-- Include AngularJS -->
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.8.2/angular.min.js"></script>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Start Page</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery (CDN) -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.19.0/font/bootstrap-icons.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
</head>
<body>
    <div ng-controller="NavController">
        <!-- Navigation Bar -->
        <nav class="navbar fixed-top navbar-light" style="background: rgba(0, 0, 0, 0.5);">
            <a class="navbar-brand" href="#" style="font-family: cursive; color: #ffffff;">AYURVRIKSHA</a>
            <ul class="nav">
                <li class="nav-item">
                    <a class="nav-link active" href="#" style="color: #ffffff;">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#/shop" style="color: #ffffff;">Shop</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#" style="color: #ffffff;">Add to cart</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#/login" style="color: #ffffff;">Login</a>
                </li>
            </ul>
        </nav>

        <!-- Carousel -->
        <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
            <!-- Carousel Inner Content -->
            <div class="carousel-inner">
                <!-- First Carousel Item -->
                <div class="carousel-item active">
                    <img src="images/plant1.png" class="d-block w-100" alt="..." height="600">
                    <div class="carousel-caption d-none d-md-block">
                        <!-- Your carousel content here -->
                    </div>
                </div>
                <!-- Second Carousel Item -->
                <div class="carousel-item">
                    <img src="images/plant2.jpg" class="d-block w-100" alt="..." height="600">
                    <div class="carousel-caption d-none d-md-block">
                        <!-- Your carousel content here -->
                    </div>
                </div>
                <!-- Third Carousel Item -->
                <div class="carousel-item">
                    <img src="images/plant3.jpeg" class="d-block w-100" alt="..." height="600">
                    <div class="carousel-caption d-none d-md-block">
                        <!-- Your carousel content here -->
                    </div>
                </div>
            </div>
            <!-- Carousel Control Buttons -->
            <button class="carousel-control-prev" type="button" data-target="#carouselExampleIndicators" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-target="#carouselExampleIndicators" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </button>
        </div>
    </div>

    <!-- AngularJS Application Script -->
    <script>
        var app = angular.module('myApp', []);

        // Controller for Navigation Bar
        app.controller('NavController', function($scope) {
            // Controller logic here
        });
    </script>
</body>
</html>
