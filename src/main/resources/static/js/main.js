    //===== close navbar-collapse when a  clicked
    let navbarTogglerOne = document.querySelector(
      ".navbar-one .navbar-toggler"
    );
    navbarTogglerOne.addEventListener("click", function () {
      navbarTogglerOne.classList.toggle("active");
    });