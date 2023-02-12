<%--
  Created by IntelliJ IDEA.
  User: Sina
  Date: 1/10/2023
  Time: 3:48 PM
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
                            <span>بازیابی</span>
                            <span class="words-wrapper">
                                <b class="visible">کلمه عبور</b>
                                <b class="blue">کلمه عبور</b>
                            </span>
                        </h3>
                    </div>
                    <form action="/forgotPassword" method="post">
                        <div class="form-group clearfix">
                            <input name="email" type="email" class="form-control" placeholder="ایمیل را وارد کنید..." aria-label="Email Address">
                        </div>
                        <div class="form-group mb-0">
                            <button type="submit" class="btn btn-lg btn-primary btn-theme">ارسال لینک بازیابی</button>
                        </div>
                    </form>
                    <p>حساب کاربری ندارید؟ <a href="html/register-26.html">از اینجا ثبت نام کنید</a></p>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Login 26 end -->
</body>
</html>

