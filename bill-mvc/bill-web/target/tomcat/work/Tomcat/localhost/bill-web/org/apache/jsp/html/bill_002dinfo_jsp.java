/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-04-25 13:11:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.html;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class bill_002dinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"/bill-web/css/billInfo/billInfo.css\">\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<script src=\"/bill-web/thrid/jquery-3.4.1.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$(\"#login\").click(function() {\r\n");
      out.write("\t\t\talert(\"已点击\");\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl : \"/bill-web/login/login\",\r\n");
      out.write("\t\t\t\ttype : \"POST\",\r\n");
      out.write("\t\t\t\t//timeout:\r\n");
      out.write("\t\t\t\tdataType : \"text JSON\",\r\n");
      out.write("\t\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\t\"data\" : \"login\"\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t\talert(\"已成功\");\r\n");
      out.write("\t\t\t\t\talert(data.result);\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\terror : function(e) {\r\n");
      out.write("\t\t\t\t\talert(\"失败\");\r\n");
      out.write("\t\t\t\t\talert(e);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t$(\".uploadFile\").click(function() {\r\n");
      out.write("\t\t\t$(\"#uploaddiv\").show();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"headdiv\">\r\n");
      out.write("\t\t<div id=\"homepage\">首页</div>\r\n");
      out.write("\t\t<div id=\"massegediv\">消息</div>\r\n");
      out.write("\t\t<div id=\"userdiv\">用户</div>\r\n");
      out.write("\t\t<div id=\"helpdiv\">帮助</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"tankuang\">\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li>数据中心</li>\r\n");
      out.write("\t\t\t<li>帮助</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"tableid\">\r\n");
      out.write("\t\t<div id=\"upload\">\r\n");
      out.write("\t\t\t<form action=\"/bill-web/file/upload\" enctype=\"multipart/form-data\"\r\n");
      out.write("\t\t\t\tmethod=\"post\">\r\n");
      out.write("\t\t\t\t<input type=\"file\" name=\"multipartResolver\"> <input\r\n");
      out.write("\t\t\t\t\ttype=\"submit\" value=\"提交\">\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<a href=\"/bill-web/file/download\">下载</a>\r\n");
      out.write("\t\t<table BORDER=\"2\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>编号</td>\r\n");
      out.write("\t\t\t\t<td>数据类型</td>\r\n");
      out.write("\t\t\t\t<td>数据值</td>\r\n");
      out.write("\t\t\t\t<td>详情页</td>\r\n");
      out.write("\t\t\t\t<td>操作</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>1</td>\r\n");
      out.write("\t\t\t\t<td>报表数据1</td>\r\n");
      out.write("\t\t\t\t<td>100</td>\r\n");
      out.write("\t\t\t\t<td><a href=\"xxxx\">详情页</a></td>\r\n");
      out.write("\t\t\t\t<td><a href=\"xxxx\">删除</a><a href=\"xxxx\">修改</a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>1</td>\r\n");
      out.write("\t\t\t\t<td>报表数据1</td>\r\n");
      out.write("\t\t\t\t<td>100</td>\r\n");
      out.write("\t\t\t\t<td><a href=\"xxxx\">详情页</a></td>\r\n");
      out.write("\t\t\t\t<td><a href=\"xxxx\">删除</a><a href=\"xxxx\">修改</a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>1</td>\r\n");
      out.write("\t\t\t\t<td>报表数据1</td>\r\n");
      out.write("\t\t\t\t<td>100</td>\r\n");
      out.write("\t\t\t\t<td><a href=\"xxxx\">详情页</a></td>\r\n");
      out.write("\t\t\t\t<td><a href=\"xxxx\">删除</a><a href=\"xxxx\">修改</a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>1</td>\r\n");
      out.write("\t\t\t\t<td>报表数据1</td>\r\n");
      out.write("\t\t\t\t<td>100</td>\r\n");
      out.write("\t\t\t\t<td><a href=\"xxxx\">详情页</a></td>\r\n");
      out.write("\t\t\t\t<td><a href=\"xxxx\">删除</a><a href=\"xxxx\">修改</a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>1</td>\r\n");
      out.write("\t\t\t\t<td>报表数据1</td>\r\n");
      out.write("\t\t\t\t<td>100</td>\r\n");
      out.write("\t\t\t\t<td><a href=\"xxxx\">详情页</a></td>\r\n");
      out.write("\t\t\t\t<td><a href=\"xxxx\">删除</a><a href=\"xxxx\">修改</a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>1</td>\r\n");
      out.write("\t\t\t\t<td>报表数据1</td>\r\n");
      out.write("\t\t\t\t<td>100</td>\r\n");
      out.write("\t\t\t\t<td><a href=\"xxxx\">详情页</a></td>\r\n");
      out.write("\t\t\t\t<td><a href=\"xxxx\">删除</a><a href=\"xxxx\">修改</a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>1</td>\r\n");
      out.write("\t\t\t\t<td>报表数据1</td>\r\n");
      out.write("\t\t\t\t<td>100</td>\r\n");
      out.write("\t\t\t\t<td><a href=\"xxxx\">详情页</a></td>\r\n");
      out.write("\t\t\t\t<td><a href=\"xxxx\">删除</a><a href=\"xxxx\">修改</a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>1</td>\r\n");
      out.write("\t\t\t\t<td>报表数据1</td>\r\n");
      out.write("\t\t\t\t<td>100</td>\r\n");
      out.write("\t\t\t\t<td><a href=\"xxxx\">详情页</a></td>\r\n");
      out.write("\t\t\t\t<td><a href=\"xxxx\">删除</a><a href=\"xxxx\">修改</a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>1</td>\r\n");
      out.write("\t\t\t\t<td>报表数据1</td>\r\n");
      out.write("\t\t\t\t<td>100</td>\r\n");
      out.write("\t\t\t\t<td><a href=\"xxxx\">详情页</a></td>\r\n");
      out.write("\t\t\t\t<td><a href=\"xxxx\">删除</a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>1</td>\r\n");
      out.write("\t\t\t\t<td>报表数据1</td>\r\n");
      out.write("\t\t\t\t<td>100</td>\r\n");
      out.write("\t\t\t\t<td><a href=\"xxxx\">详情页</a></td>\r\n");
      out.write("\t\t\t\t<td><a href=\"xxxx\">删除</a><a href=\"xxxx\">修改</a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<div id=\"nextpage\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<button>上一页</button>\r\n");
      out.write("\t\t\t\t<input type=\"text\" />\r\n");
      out.write("\t\t\t\t<button>下一页</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
