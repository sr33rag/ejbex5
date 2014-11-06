package foo.web;

import java.io.PrintWriter;
import java.io.IOException;

import javax.ejb.EJB;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import foo.ejb.FooRemote;
import foo.ejb.FooBean;

public class FooServlet extends HttpServlet {

  @EJB(mappedName="FooBean/remote")
  private FooRemote foo;

  protected void processRequest(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
    res.setContentType("text/html;charset=UTF-8");
    PrintWriter out = res.getWriter();
    out.println("<html><head><title>Servlet FooServlet</title></head><body>");
    out.println("<h>FooRemote.echo returned:" + foo.echo("From FooServlet") + "</h>");
    out.println("</body></html>");
  }

  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
     processRequest(req, res);
  }

  protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
     processRequest(req, res);
  }
}
