<h2>Line One</h2>
<%
System.out.println("output of Scriptlet");
%>
<h2>Last Line</h2>



<%!
int a,b;
static int y,z;
public void m1(){
System.out.println("Inside m1 method");
}
public static void m2(){
System.out.println("Inside m2 method");
}
%>
<%
int i=10,j=20;
System.out.println("_jsp service method");
m1();
m2();
%>