<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<html>
<body>
<h1 align="center">새로 대여할 도서</h1>
<p>
<form method="POST" action="JoinUser">
<TABLE border=1 bordercolor=white bordercolorlight=gray cellpadding=2 cellspacing=0 align=center>

		<TR>
			<TD align=center bgcolor=#ECECEC> 제목 </TD>
			<TD>
				<INPUT type=text name=name size=12 maxlength=12>
			</TD>
		</TR>

		<TR>
			<TD align=center bgcolor=#ECECEC> 저자 </TD>
			<TD>
				<INPUT type=text name=name1 size=12 maxlength=12> 저
			</TD>
		</TR>

		<TR>
			<TD align=center bgcolor=#ECECEC> 책번호 </TD>
			<TD>
				<INPUT type=text name=phone size=12 maxlength=12>
			</TD>
		</TR>
</TABLE>


<br><br>
<center>
	<input type="SUBMIT" value=등록>
</center>
</form>
</body>
</html>