<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="ctx" value="<%=request.getContextPath()%>"/>

<%--js--%>
<script type="text/javascript" src="${ctx}/resources/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="${ctx}/resources/js/bootstrap.js"></script>
<script type="text/javascript" src="${ctx}/resources/js/angular2.js"></script>
<%--css--%>
<link rel="stylesheet" type="text/css" href="${ctx}/resources/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="${ctx}/resources/css/bootstrap-theme.css">

