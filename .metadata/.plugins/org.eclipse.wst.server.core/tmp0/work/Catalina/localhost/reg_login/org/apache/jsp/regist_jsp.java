/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.23
 * Generated at: 2017-11-24 15:18:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class regist_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>注册</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"./css/reg.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"reg\">\r\n");
      out.write("\t\t<div class=\"header\">\r\n");
      out.write("\t\t\t<h1>\r\n");
      out.write("\t\t\t\t<a href=\"./login.jsp\">登录</a> <a href=\"./regist.jsp\">注册</a>\r\n");
      out.write("\t\t\t</h1>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- \r\n");
      out.write("\t\t\t文件上传的条件\r\n");
      out.write("\t\t\t* 表单必须是post提交方式\r\n");
      out.write("\t\t\t* 表单中必须有文件上传项，文件上传项必须有name属性和值\r\n");
      out.write("\t\t\t* 表单的enctype属性必须设置为multipart/form-data\r\n");
      out.write("\t\t -->\r\n");
      out.write("\t\t");

			String msg = "";
			if(request.getAttribute("msg")!=null){
				msg = (String)request.getAttribute("msg");
			}
		
      out.write("\r\n");
      out.write("\t\t<h3><font color=\"red\">");
      out.print( msg );
      out.write("</font></h3>\r\n");
      out.write("\t\t<form action=\"/reg_login/RegistServlet\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"td1\">用户名</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" class=\"input1\" name=\"username\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"td1\">密码</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"password\" class=\"input1\" name=\"password\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"td1\">昵称</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" class=\"input1\" name=\"nickname\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"td1\">性别</td>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"radio\" name=\"sex\" value=\"male\">男\r\n");
      out.write("\t\t\t\t\t\t<input type=\"radio\" name=\"sex\" value=\"female\">女\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"td1\">上传头像</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"file\" id=\"photo\" name=\"upload\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td class=\"td1\">兴趣爱好</td>\r\n");
      out.write("\t\t\t\t\t<td><label> \r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" name=\"hobby\" value=\"篮球\">篮球\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" name=\"hobby\" value=\"足球\">足球\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" name=\"hobby\" value=\"排球\">排球 \r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" name=\"hobby\" value=\"羽毛球\">羽毛球\r\n");
      out.write("\t\t\t\t\t</label></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"btn-red\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"注册\" id=\"reg-btn\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
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