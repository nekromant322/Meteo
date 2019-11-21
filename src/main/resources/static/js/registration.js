function auth() {
    var email = $('#email').val();
    var pass = $('#password').val();
    var dataForLogin = "email"  +"="+email +"&" + "password" + "=" + pass;
    var response = $.ajax({
        type: 'POST',
        url: '/authenticate',
        //url: 'http://localhost:8080/test',
        data: dataForLogin,
        complete: function (resp) {
            var goTo = resp.getResponseHeader("redirect");
            if(goTo != null) {
                window.location.href = goTo;
            }
            console.log(resp);
        },
        error: function (error) {
            if(document.getElementById('error-message') === null && error.status != 200) {
                var d1 = document.getElementById('password');
                d1.insertAdjacentHTML('afterend', '<p id="error-message">Wrong login or password</p>');

            }
            console.log(error);
        },
        dataType: 'application/x-www-form-urlencoded'
    });
}

function test(number){
    alert(number);
}