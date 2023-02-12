<%--
  Created by IntelliJ IDEA.
  User: Sina
  Date: 1/9/2023
  Time: 4:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="fa">

<head>
    <title>ODDO - قالب HTML فرم ثبت نام و ورود اُددو</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="UTF-8">
    <jsp:include page="assets/Include.jsp"></jsp:include>
</head>
<body id="top" dir="rtl">
<div class="page_loader"></div>
<!-- Login 26 start -->
<div class="login-26">
    <div id="particles-js"></div>
    <div class="container">
        <div class="row">
            <div class="col-lg-12 col-md-12">
                <div class="form-section">
                    <div class="logo-2">
                        <a href="html/login-26.html">
                            <img src="assets/img/logos/logo-2.png" alt="logo">
                        </a>
                    </div>
                    <div class="main-title">
                        <h3 class="headline">
                            <span>ایجاد</span>
                            <span class="words-wrapper">
                                <b class="visible">حساب کاربری</b>
                                <b class="blue">حساب کاربری</b>
                            </span>
                        </h3>
                    </div>
                    <form action="/signup" method="post">
                        <div class="form-group clearfix">
                            <input name="username" type="text" class="form-control" placeholder="نام کاربری" aria-label="Full Name">
                        </div>
                        <div class="form-group clearfix">
                            <input name="password" type="password" class="form-control" autocomplete="off" placeholder="رمز عبور" aria-label="Password">
                        </div>
                        <div class="form-group clearfix">
                            <input name="firstname" type="text" class="form-control" placeholder="نام" aria-label="Full Name">
                        </div>
                        <div class="form-group clearfix">
                            <input name="lastname" type="text" class="form-control" placeholder="نام خانوادگی" aria-label="Full Name">
                        </div>
                        <div class="form-group clearfix">
                            <input name="email" type="email" class="form-control" placeholder="پست الکترونیکی" aria-label="Email Address">
                        </div>
                        <div class="form-group clearfix">
                            <input name="birthdate" type="date" class="form-control" placeholder="تاریخ تولد" aria-label="BirthDate">
                        </div>
                        <div class="form-group clearfix">
                            <select id="country-state" name="state" class="form-control">
                                <option value="32">Alborz Province</option>
                                <option value="03">Ardabil Province</option>
                                <option value="06">Bushehr Province</option>
                                <option value="08">Chaharmahal and Bakhtiari Province</option>
                                <option value="01">East Azerbaijan Province</option>
                                <option value="14">Fars Province</option>
                                <option value="19">Gilan Province</option>
                                <option value="27">Golestan Province</option>
                                <option value="23">Hormozgan Province</option>
                                <option value="05">Ilam Province</option>
                                <option value="04">Isfahan Province</option>
                                <option value="15">Kerman Province</option>
                                <option value="17">Kermanshah Province</option>
                                <option value="10">Khuzestan Province</option>
                                <option value="18">Kohgiluyeh and Boyer-Ahmad Province</option>
                                <option value="16">Kurdistan Province</option>
                                <option value="20">Lorestan Province</option>
                                <option value="22">Markazi Province</option>
                                <option value="21">Mazandaran Province</option>
                                <option value="31">North Khorasan Province</option>
                                <option value="28">Qazvin Province</option>
                                <option value="26">Qom Province</option>
                                <option value="30">Razavi Khorasan Province</option>
                                <option value="12">Semnan Province</option>
                                <option value="13">Sistan and Baluchestan</option>
                                <option value="29">South Khorasan Province</option>
                                <option value="07">Tehran Province</option>
                                <option value="02">West Azarbaijan Province</option>
                                <option value="25">Yazd Province</option>
                                <option value="11">Zanjan Province</option>
                            </select>
                        </div>
                        <div class="form-group mb-0 clearfix">
                            <button type="submit" class="btn btn-lg btn-primary btn-theme">ثبت نام</button>
                        </div>
                    </form>
                    <p>حساب کاربری دارید؟ <a href="html/login-26.html" class="thembo">از اینجا وارد شوید</a></p>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Login 26 end -->
</body>
</html>
