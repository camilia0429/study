<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page import="java.util.Date" %>
<c:set var="date" value="<%=new Date()%>" />

<h1>Asia/Seoul</h1>
<fmt:timeZone value="Asia/Seoul">
    <fmt:formatDate value="${date}" type="both" />
</fmt:timeZone>
<br>
<h1>Asia/Jakarta</h1>
<fmt:timeZone value="Asia/Jakarta">
    <fmt:formatDate value="${date}" type="both" />
</fmt:timeZone>
<br>
<h1>America/New_York</h1>
<fmt:timeZone value="America/New_York">
    <fmt:formatDate value="${date}" type="both" />
</fmt:timeZone>