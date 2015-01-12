<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleHelloWorldProxyid" scope="session" class="com.shail.ws.HelloWorldProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleHelloWorldProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleHelloWorldProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleHelloWorldProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.shail.ws.HelloWorld getHelloWorld10mtemp = sampleHelloWorldProxyid.getHelloWorld();
if(getHelloWorld10mtemp == null){
%>
<%=getHelloWorld10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        java.lang.String sayAbhi15mtemp = sampleHelloWorldProxyid.sayAbhi();
if(sayAbhi15mtemp == null){
%>
<%=sayAbhi15mtemp %>
<%
}else{
        String tempResultreturnp16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(sayAbhi15mtemp));
        %>
        <%= tempResultreturnp16 %>
        <%
}
break;
case 18:
        gotMethod = true;
        java.lang.String getRingTone18mtemp = sampleHelloWorldProxyid.getRingTone();
if(getRingTone18mtemp == null){
%>
<%=getRingTone18mtemp %>
<%
}else{
        String tempResultreturnp19 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getRingTone18mtemp));
        %>
        <%= tempResultreturnp19 %>
        <%
}
break;
case 21:
        gotMethod = true;
        java.lang.String sayHelloWorld21mtemp = sampleHelloWorldProxyid.sayHelloWorld();
if(sayHelloWorld21mtemp == null){
%>
<%=sayHelloWorld21mtemp %>
<%
}else{
        String tempResultreturnp22 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(sayHelloWorld21mtemp));
        %>
        <%= tempResultreturnp22 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
exception: <%= e %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>