// $(document).ready(function () {
//     $('#helloworldform').on('submit', function () {
//         var name = $('#name').val();

//         if (name == '') {
//             alert('Please Fill All Fields');
//         } else {
//             // AJAX Code To Submit Form.
//             $.ajax({
//                 type: 'POST',
//                 url: 'http://localhost:8081/adapex/api/helloworld',
//                 data: $('#helloworldform').serialize(),
//                 cache: false,
//                 crossDomain: true,
//                 success: function (result) {
//                     alert(result);
//                 }
//             });
//         }
//         return false;
//     });
// });


// When the user scrolls the page, execute myFunction
window.onscroll = function () {
    myFunction()
};

// Get the header
var header = document.getElementById("menu");
var logo = document.getElementById("logo");
// Get the offset position of the navbar
var sticky = header.offsetTop;

// Add the sticky class to the header when you reach its scroll position. Remove "sticky" when you leave the scroll position
function myFunction() {
    if (window.pageYOffset > sticky) {
        header.classList.add("faded");
        header.classList.add("fixed-top");
        header.classList.add("bg-dark");
        header.classList.add("navbar-dark");
        header.classList.remove("bg-light");
        header.classList.remove("navbar-light");
        logo.src = "./assets/images/logo/logo_200x55_white.png";
    } else {
        header.classList.remove("faded");
        header.classList.remove("fixed-top");
        header.classList.remove("bg-dark");
        header.classList.remove("navbar-dark");
        header.classList.add("bg-light");
        header.classList.add("navbar-light");
        logo.src = "./assets/images/logo/logo_200x55.png";
    }
}

$(document).ready(function () {
    $("#contactForm").on('submit', function () {
        var name = $("#fullname").val();
        var email = $("#email").val();
        var password = $("#title").val();
        var contact = $("#body").val();

        if (name == '' || email == '' || password == '' || contact == '') {
            alert("Please Fill All Fields");
        } else {
            // AJAX Code To Submit Form.
            $.ajax({
                type: "POST",
                url: "http://localhost:8081/adapex/api/messages",
                data: $('#contactForm').serialize(),
                cache: false,
                crossDomain: true,
                success: function (result) {
                    alert(result);
                }
            });
        }
        return false;
    });
});