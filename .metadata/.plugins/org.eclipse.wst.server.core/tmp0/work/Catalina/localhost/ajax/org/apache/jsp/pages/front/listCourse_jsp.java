/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.23
 * Generated at: 2017-11-26 06:20:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages.front;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listCourse_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>js调用ajax</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\tinput{\r\n");
      out.write("\t\twidth:250px;\r\n");
      out.write("\t\theight:25px;\r\n");
      out.write("\t}\r\n");
      out.write("\t#login{\r\n");
      out.write("\t\twidth:255px;\r\n");
      out.write("\t\theight:35px;\r\n");
      out.write("\t\tbackground-color:#FF2611;\r\n");
      out.write("\t\tborder:0px;\r\n");
      out.write("\t\tcursor:pointer;\r\n");
      out.write("\t\tcolor:white\r\n");
      out.write("\t}\r\n");
      out.write("\t.c1{\r\n");
      out.write("\t\tfont-size:24px;\r\n");
      out.write("\t\tcolor:black;\r\n");
      out.write("\t\tfont-weight:bolder\r\n");
      out.write("\t}\r\n");
      out.write("\t.c2{\r\n");
      out.write("\t\tfont-size:14px;\r\n");
      out.write("\t\tcolor:#666;\r\n");
      out.write("\t}\r\n");
      out.write("\t.c3{\r\n");
      out.write("\t\tfont-size:14px;\r\n");
      out.write("\t\tcolor:red;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"text-align:center;\">\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"查看java课程\" flag=\"1\" onclick=\"showJava()\">\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"查看C课程\" flag=\"2\" onclick=\"showC()\">\r\n");
      out.write("\t\t\t<div style=\"width:400px,height:300px\" id=\"div1\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction showJava(){\r\n");
      out.write("\t\t//1、创建一个 xmlhttpRequest对象\r\n");
      out.write("\t\tvar xmlhttp = new XMLHttpRequest();\r\n");
      out.write("\t\t//2、规定请求的类型、URL 以及是否异步处理请求。\r\n");
      out.write("\t\txmlhttp.open(\"GET\",\"");
      out.print(basePath);
      out.write("/ListCouseServlet?flag=1\",true);\r\n");
      out.write("\t\t//3、将请求发送到服务器。\r\n");
      out.write("\t\txmlhttp.send();\r\n");
      out.write("\t\t//4、接收服务器端的响应(readyState=4表示请求已完成且响应已就绪    status=200表示请求响应一切正常)\r\n");
      out.write("\t\txmlhttp.onreadystatechange=function(){\r\n");
      out.write("\t\t\tif (xmlhttp.readyState==4 && xmlhttp.status==200){\r\n");
      out.write("\t\t\t\t//responseText：表示的是服务器返回给ajax的数据\r\n");
      out.write("\t\t    \tdocument.getElementById(\"div1\").innerHTML=xmlhttp.responseText;\r\n");
      out.write("\t\t    \t//alert(xmlhttp.responseText);\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction showC(){\r\n");
      out.write("\t\t//1、创建一个 xmlhttpRequest对象\r\n");
      out.write("\t\tvar xmlhttp = new XMLHttpRequest();\r\n");
      out.write("\t\t//2、规定请求的类型、URL 以及是否异步处理请求。\r\n");
      out.write("\t\txmlhttp.open(\"GET\",\"");
      out.print(basePath);
      out.write("/ListCouseServlet?flag=2\",true);\r\n");
      out.write("\t\t//3、将请求发送到服务器。\r\n");
      out.write("\t\txmlhttp.send();\r\n");
      out.write("\t\t//4、接收服务器端的响应(readyState=4表示请求已完成且响应已就绪    status=200表示请求响应一切正常)\r\n");
      out.write("\t\txmlhttp.onreadystatechange=function(){\r\n");
      out.write("\t\t\tif (xmlhttp.readyState==4 && xmlhttp.status==200){\r\n");
      out.write("\t\t\t\t//responseText：表示的是服务器返回给ajax的数据\r\n");
      out.write("\t\t    \tdocument.getElementById(\"div1\").innerHTML=xmlhttp.responseText;\r\n");
      out.write("\t\t    \t//alert(xmlhttp.responseText);\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}