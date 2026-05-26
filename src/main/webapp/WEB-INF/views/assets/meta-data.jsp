<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="org.springframework.beans.factory.annotation.Autowired"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>  

<spring:eval expression="@environment.getProperty('spring.aswsdcnbean.css')" var="csspath" />
<spring:eval expression="@environment.getProperty('spring.aswsdcnbean.js')" var="jspath" />
<spring:eval expression="@environment.getProperty('spring.aswsdcnbean.image')" var="imagepath" />
<spring:eval expression="@environment.getProperty('spring.profiles.active')" var="activeProfile" />

