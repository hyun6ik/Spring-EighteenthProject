<%@ page import="com.example.studyMvc.domain.member.Member" %>
<%@ page import="com.example.studyMvc.domain.member.MemberRepository" %>
<%@ page import="java.util.Properties" %>
<%@ page import="java.util.List" %>
<%@ page import="org.springframework.data.domain.Sort" %>
<%@ page import="org.springframework.data.domain.Example" %>
<%@ page import="org.springframework.data.domain.Page" %>
<%@ page import="org.springframework.data.domain.Pageable" %>
<%@ page import="java.util.Optional" %>
<%@ page import="com.example.studyMvc.domain.member.MemberRepositoryImpl" %>
<%--
  Created by IntelliJ IDEA.
  User: 82103
  Date: 2021-03-10
  Time: 오후 5:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    MemberRepositoryImpl memberRepository = MemberRepositoryImpl.getInstance();

    String username = request.getParameter("username");
    int age = Integer.parseInt(request.getParameter("age"));

    Member member = new Member(username, age);
    memberRepository.save(member);
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
성공
<ul>
    <li>id=<%=member.getId()%></li>
    <li>username=<%=member.getUsername()%></li>
    <li>age=<%=member.getAge()%></li>
</ul>
<a href="/index.html">메인</a>

</body>
</html>
