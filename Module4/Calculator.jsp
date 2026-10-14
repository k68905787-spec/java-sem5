
<html>
<body>
<form method="post">
Mark 1: <input name="a"><br>
Mark 2: <input name="b"><br>
<input type="submit" value="Calculate">
</form>

<%
String x = request.getParameter("a");
String y = request.getParameter("b");

if (x != null && y != null) {
    int a = Integer.parseInt(x);
    int b = Integer.parseInt(y);
    out.println("Total: " + (a + b));
}
%>
</body>
</html>
