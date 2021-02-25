<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="model.Result"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
      table {
        width: 100%;
        align-content: center;
        
      }
      th, td {
    	border: 1px solid black;
    	padding: 10px;
    	text-align: center;
  	}
  	
  		#header{
  			font-size: 20px;
  			background-color: lightgray;
  		}
    </style>
    
  
</head>
<body>

	
	
	<center>
	<h1>SW 도서 검색 사이트</h1>
	<br>
	
	<h3>과목명을 입력하세요</h3>
	<form action="search" method="get">
		<input type="text" name="subject">
		<input type="submit" value="Go" />
	</form>
	<br>

	<%
		Result result = (Result)request.getAttribute("search");

		List<Map<String, Object>> list1 = result.getInfo();
		int count = result.getCount();
	%>
	
	<h3>총 <%=count %>건의 검색결과가 있습니다.</h3>
		<table>
		<tr id="header">
			<td>교수</td>
			<td>과목명</td>
			<td>학년</td>
			<td>학과</td>
			<td>링크</td>
		</tr>
		<% for(Map<String, Object> l:list1){ %>
		
		<tr>
			<td><%=l.get("professor")%></td>
			<td><%=l.get("subname")%></td>
			<td><%=l.get("grade")%></td>
			<td><%=l.get("dept")%></td>
			<td><%if(l.get("book")==null){ %>교재가 없습니다<%}else{ %>
				 <a href="https://book.naver.com/bookdb/book_detail.nhn?bid=<%=l.get("book") %>">가격 비교 바로가기</a> <%} %>
			</td>
		</tr>
			
		
	<%		
		}
	%>
		</table>
	</center>
	
</body>
</html>