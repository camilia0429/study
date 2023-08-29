<%@ page contextType="text/html; charset=UTF-8" %>
<%
    int num1 = 10;
    int num2 = 20;

    int result = add(num1,num2);
%>
<%=num1%> + <%=num2%> = <%=result%>
<%=result%>
<%!
    int num1 = 10;
    int num2 = 20;

    int add(int num1, int num2) {
    return num1 + num2;
%>