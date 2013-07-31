<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.*"%>
<%@ page import="com.example.model.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1 align="center">대여 도서 목록</h1>
<p>
<form method="POST" action="join.jsp">
<TABLE border=1 bordercolor=red align=center cellpadding=8 cellspacing=0>
<TR><TD> 제목 </TD><TD> 저자 </TD><TD> 책번호 </TD></TR>
<%--
//   out.print("<TABLE border=1 bordercolor=red align=center cellpadding=8 cellspacing=0>");
//  out.print("<TR><TD> 제목 </TD><TD> 저자 </TD><TD> 책번호 </TD></TR>");

   ArrayList table = (ArrayList)request.getAttribute("table");

   Iterator it = table.iterator();
   while(it.hasNext()) {
      User obj = (User)it.next();
      out.print("<TR><TD>" + obj.getName() + "</TD><TD>" + obj.getName1() + " 저</TD><TD>" + obj.getPhoneNumber() + "</TD></TR>");
   }
   //out.print("</TABLE>");
--%>
<c:forEach items="${table}" var="data">
	<TR><TD><c:out value="${data.getName()}"/></TD><TD><c:out value="${data.getName1()}"/></TD><TD><c:out value="${data.getPhoneNumber()}"/></TD></TR>
</c:forEach>

</TABLE>
<br><br>
<center>
	<input type="SUBMIT" value=등록하기>
	<a href="Logout.jsp">Logout</a>
</center>
</form>
</body>
</html>