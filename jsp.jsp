<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cookie Example</title>
</head>
<body>

<%
    String cookieName = "myCookie";
    String cookieValue = request.getParameter("cookieValue");

    if (cookieValue != null && !cookieValue.isEmpty()) {
        Cookie cookie = new Cookie(cookieName, cookieValue);
        cookie.setMaxAge(60 * 60 * 24); // cookie expires in 1 day
        response.addCookie(cookie);
        out.println("<p>Cookie created with value: " + cookieValue + "</p>");
    }

    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if (cookieName.equals(cookie.getName())) {
                out.println("<p>Cookie found with value: " + cookie.getValue() + "</p>");
            }
        }
    }
%>

<form method="get">
    <label for="cookieValue">Enter a value:</label>
    <input type="text" id="cookieValue" name="cookieValue">
    <button type="submit">Create Cookie</button>
</form>

</body>
</html>
