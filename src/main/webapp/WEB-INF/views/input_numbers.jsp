
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Input Page</title>
    <style>
        #input_style {
            width: 100px;
            font-size: 150%;
        }
    </style>
</head>
<body>
<div align="center">
<form action="/train/result">
<br><br><br>
    <strong>
    <input type="number" name="first" id="input_style"/>
    <span> X </span>
    <input type="number" name="second" id="input_style"/>
    </strong>
    <br><br>
    <input type="submit" name="submit" value="Calculate">
</form>
</div>
</body>
</html>
