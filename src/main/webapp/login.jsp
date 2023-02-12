<%--
  Created by IntelliJ IDEA.
  User: Sina
  Date: 1/9/2023
  Time: 4:51 PM
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
            <div class="col-lg-12 align-items-center">
                <div class="form-section">
                    <div class="logo-2">
                        <a href="html/login-26.html">
                            <img src="assets/img/logos/logo-2.png" alt="logo">
                        </a>
                    </div>
                    <div class="main-title">
                        <h3 class="headline">
                            <span>ورود به</span>
                            <span class="words-wrapper">
                                <b class="visible">حساب کاربری</b>
                                <b class="blue">حساب کاربری</b>
                            </span>
                        </h3>
                    </div>

                    <form action="/login" method="post">
                        <div class="form-group clearfix">
                            <input name="username" type="text" class="form-control" placeholder="نام کاربری" aria-label="Full Name">
                        </div>
                        <div class="form-group clearfix">
                            <input name="password" type="password" class="form-control" autocomplete="off" placeholder="رمز عبور" aria-label="Password">
                        </div>
                        <div class="checkbox form-group clearfix">
                            <div class="form-check float-end">
                                <input class="form-check-input" type="checkbox" id="rememberme">
                                <label class="form-check-label" for="rememberme">
                                    مرا به خاطر بسپار
                                </label>
                            </div>
                            <a href="html/forgot-password-26.html" class="link-light float-start forgot-password">فراموشی رمز عبور</a>
                        </div>
                        <div class="form-group mb-0 clearfix">
                            <button type="submit" class="btn btn-lg btn-primary btn-theme">ورود</button>
                        </div>
                    </form>
                    <p>حساب کاربری ندارید؟ <a href="html/register-26.html" class="thembo">از اینجا ثبت نام کنید</a></p>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Login 26 end -->
</body>
</html>

