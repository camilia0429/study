<%@ tag body-content="scriptless" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layouts" %>
<%@ attribute name="pageTitle" %>
<layout:common pageTitle="${pageTitle}">
    <jsp:attribute name="header">
        <h1>헤더</h1>
    </jsp:attribute>
    <jsp:attribute name="footer">
        <h1>푸터</h1>
    </jsp:attribute>
    <jsp:body>
        <jsp:doBody />
    </jsp:body>
</layout:common>
