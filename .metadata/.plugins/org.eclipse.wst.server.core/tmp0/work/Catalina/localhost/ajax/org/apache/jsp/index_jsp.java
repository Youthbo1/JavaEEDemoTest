/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.23
 * Generated at: 2017-11-26 06:20:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>登录</title>\r\n");
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
      out.write("<script type=\"text/javascript\" src=\"resources/js/jquery-1.4.2.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"text-align:center;\">\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"c1\">欢迎登录</span>&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"c2\">没有帐号？</span>\r\n");
      out.write("\t\t\t\t\t\t\t<span class=\"c3\">立即注册</span>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"username\" placeholder=\"请输入登录邮箱/手机号\"><span class=\"tip\" style=\"color:red;font-size:12px\"></span></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"password\" name=\"password\" placeholder=\"6-16位密码，区分大小写，不能空格\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <input type=\"submit\" value=\"登录\"  id=\"login\"> -->\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" value=\"登录\"  id=\"login\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t<!-- </form> -->\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(\"#login\").click(function(){\r\n");
      out.write("\t\t//单击登录按钮的时候触发ajax事件\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:\"");
      out.print(basePath);
      out.write("/LoginServlet\",\r\n");
      out.write("\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\tdata:{\r\n");
      out.write("\t\t\t\tusername:$(\"input[name=username]\").val(),\r\n");
      out.write("\t\t\t\tpassword:$(\"input[name=password]\").val()\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tdataType:\"json\",\r\n");
      out.write("\t\t\tsuccess:function(result){\r\n");
      out.write("\t\t\t\tvar flag = result.flag;\r\n");
      out.write("\t\t\t\tif(flag==true){\r\n");
      out.write("\t\t\t\t\t//如果登录成功则跳转到成功页面\r\n");
      out.write("\t\t\t\t\twindow.location.href=\"");
      out.print(basePath);
      out.write("/pages/front/success.jsp\";\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t//跳回到Index.jsp登录页面，同时在登录页面给用户一个友好的提示\r\n");
      out.write("\t\t\t\t\t$(\".tip\").text(\"您输入的用户名或者密码不正确\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
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
