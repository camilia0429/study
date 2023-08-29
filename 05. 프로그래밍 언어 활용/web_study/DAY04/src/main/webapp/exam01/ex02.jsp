<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*, java.time.*" %>
<%@ page import="java.time.*" %>
<%@ page info="JSP 번역 연습" %>
<%
    List<String> names = Arrays.asList("이름","이름2","이름3");

    String info = getServletInfo();
    out.write(info);
%>