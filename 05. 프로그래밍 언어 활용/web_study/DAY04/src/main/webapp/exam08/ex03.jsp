<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page import="java.util.Date" %>
<c:set var="date" value="<%=new Date()%>" />

<fmt:formatNumber value="10000" type="currency" /><br>
<fmt:formatDate value="${date}" type="both" /><br>
<br>
<fmt:setLocale value="us-en" />
<fmt:formatNumber value="10000.12" type="currency" /><br>
<fmt:formatDate value="${date}" type="both" /><br>
<br>
<fmt:setLocale value="ja_jp" />
<fmt:formatNumber value="10000" type="currency" /><br>
<fmt:formatDate value="${date}" type="both" /><br>