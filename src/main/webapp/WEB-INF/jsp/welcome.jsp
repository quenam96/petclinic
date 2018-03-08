<%@ page import="org.springframework.samples.petclinic.web.GetMetadata" %>
<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>

<petclinic:layout pageName="home">
    <h2><fmt:message key="welcome"/></h2>
    <div class="row">
        <div class="col-md-12">
            <spring:url value="/resources/images/pets.png" htmlEscape="true" var="petsImage"/>
            <img class="img-responsive" src="${petsImage}"/>
        </div>
    </div>
</petclinic:layout>
<b><h2> [Current WAS Information] </h2></b>
Hostname : <%=GetMetadata.getHostName()%><br>
Zone : <%=GetMetadata.getZone()%><br>
VPC Network IP : <%=GetMetadata.getNetwork()%><br>
Internal IP : <%=GetMetadata.getInternalIP()%><br>
External IP : <%=GetMetadata.getExternalIP()%><br>
Tags : <%=GetMetadata.getTag()%><br>
======================================================


<%
	String mhost = request.getHeader("MHOST");
	String mzone = request.getHeader("MZONE");
	String mnetwork = request.getHeader("MNETWORK");
	String mintip = request.getHeader("MINTIP");
	String mextip = request.getHeader("MEXTIP");
	String mtag = request.getHeader("MTAG");
%>

<b><h2> [Current WEB Information] </h2></b>
Hostname : <%=mhost%><br>
Zone : <%=mzone%><br>
VPC Network IP : <%=mnetwork%><br>
Internal IP : <%=mintip%><br>
External IP : <%=mextip%><br>
Tags : <%=mtag%>
