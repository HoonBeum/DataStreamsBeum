<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" session="false" %>
<%--세션 생성 x --%>
<%HttpSession session1 = request.getSession(false);
if(session1 != null){
	session1.invalidate();
}%><%--세션삭제 --%>
<html>
<body>
<h1 align="center">관리자 인증</h1>
<p>
<form method="POST" action="JoinUser">
<TABLE border=1 bordercolor=white bordercolorlight=gray cellpadding=2 cellspacing=0 align=center>

		<TR>
			<TD align=center bgcolor=#ECECEC> 아이디 </TD>
			<TD>
				<INPUT type=text name=id size=12 maxlength=12>
			</TD>
		</TR>
		<TR> 
			<TD align=center bgcolor=#ECECEC> 비밀번호 </TD>
			<TD>
				<INPUT type=password name=password size=12 maxlength=12>
			</TD>
		</TR>
</TABLE>


<br><br>
<center>
	<input type="SUBMIT" value=로그인>
</center>
</form>
</body>
</html>