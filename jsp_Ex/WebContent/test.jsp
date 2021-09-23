<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "java.util.*"%>
<% GregorianCalendar today = new GregorianCalendar();%>
<%= String.format("%ty³â %tm¿ù %tdÀÏ",today,today,today)%>