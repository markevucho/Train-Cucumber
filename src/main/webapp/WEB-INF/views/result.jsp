
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title><style>
    #th {
        font-size: 150%;
    }
</style>

</head>
<body>
<div align="center">
    <br><br>
   <table>
       <tr>
       <th>Result: </th>
       <th width="60">${result}</th>
       </tr>
   </table>
   <br>
    <form action="/train/input">
        <input type="submit" value="Return to input numbers"/>
    </form>
</div>

</body>
</html>
