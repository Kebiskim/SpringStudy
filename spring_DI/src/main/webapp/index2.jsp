<%@page import="ex09_db.VO"%>
<%@page import="java.util.List"%>
<%@page import="ex09_db.DAO"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<%-- CHOOSE 쓰기 위해서 위에 prefix="c" 해줌 --%>
<%-- 자바랑 HTML 구분 위해서 일부러 위에다 씀 (body 안에 안 넣고) --%>
<%
	WebApplicationContext context = 
	WebApplicationContextUtils.getWebApplicationContext(application);
	// root-context에 있는 dao를 가지고 오게 됨
	DAO dao = (DAO) context.getBean("dao");
	List<VO> list = dao.getList();
	pageContext.setAttribute("list", list);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table{width: 800px; border-collapse: collapse; text-align: center; margin: auto;}
	table, th, td{border: 1px solid red; padding: 3px;}
</style>
</head>
<body>
	<h2>회원정보</h2>
	<table>
		<thead>
			<tr>
				<th>번호</th><th>아이디</th><th>패스워드</th><th>이름</th><th>나이</th><th>등록일</th>
			</tr>
		</thead>
		<tbody>
			<c:choose>
				<c:when test="${empty list}">
					<tr><td colspan="6"><h2>자료가 존재하지 않습니다.</h2></td></tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="k" items="${list}">
						<tr>
							<td>${k.m_idx}</td>
							<td>${k.m_id}</td>
							<td>${k.m_pw}</td>
							<td>${k.m_name}</td>
							<td>${k.m_age}</td>
							<td>${k.m_reg.substring(0, 10)}</td>
						</tr>
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</tbody>
	</table>
</body>
</html>