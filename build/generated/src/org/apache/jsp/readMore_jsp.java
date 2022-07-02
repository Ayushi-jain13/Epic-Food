package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class readMore_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>W3.CSS Template</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<style>\n");
      out.write("body {font-family: \"Times New Roman\", Georgia, Serif;}\n");
      out.write("h1, h2, h3, h4, h5, h6 {\n");
      out.write("  font-family: \"Playfair Display\";\n");
      out.write("  letter-spacing: 5px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- Navbar (sit on top) -->\n");
      out.write("<div class=\"w3-top\">\n");
      out.write("  <div class=\"w3-bar w3-white w3-padding w3-card\" style=\"letter-spacing:4px;\">\n");
      out.write("    <a href=\"#home\" class=\"w3-bar-item w3-button\">Gourmet au Catering</a>\n");
      out.write("    <!-- Right-sided navbar links. Hide them on small screens -->\n");
      out.write("    <div class=\"w3-right w3-hide-small\">\n");
      out.write("      <a href=\"#about\" class=\"w3-bar-item w3-button\">About</a>\n");
      out.write("      <a href=\"#menu\" class=\"w3-bar-item w3-button\">Menu</a>\n");
      out.write("      <a href=\"#contact\" class=\"w3-bar-item w3-button\">Contact</a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Header -->\n");
      out.write("<header class=\"w3-display-container w3-content w3-wide\" style=\"max-width:1600px;min-width:500px\" id=\"home\">\n");
      out.write("  <img class=\"w3-image\" src=\"/w3images/hamburger.jpg\" alt=\"Hamburger Catering\" width=\"1600\" height=\"800\">\n");
      out.write("  <div class=\"w3-display-bottomleft w3-padding-large w3-opacity\">\n");
      out.write("    <h1 class=\"w3-xxlarge\">Le Catering</h1>\n");
      out.write("  </div>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<!-- Page content -->\n");
      out.write("<div class=\"w3-content\" style=\"max-width:1100px\">\n");
      out.write("\n");
      out.write("  <!-- About Section -->\n");
      out.write("  <div class=\"w3-row w3-padding-64\" id=\"about\">\n");
      out.write("    <div class=\"w3-col m6 w3-padding-large w3-hide-small\">\n");
      out.write("     <img src=\"/w3images/tablesetting2.jpg\" class=\"w3-round w3-image w3-opacity-min\" alt=\"Table Setting\" width=\"600\" height=\"750\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"w3-col m6 w3-padding-large\">\n");
      out.write("      <h1 class=\"w3-center\">About Catering</h1><br>\n");
      out.write("      <h5 class=\"w3-center\">Tradition since 1889</h5>\n");
      out.write("      <p class=\"w3-large\">The Catering was founded in blabla by Mr. Smith in lorem ipsum dolor sit amet, consectetur adipiscing elit consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute iruredolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.We only use <span class=\"w3-tag w3-light-grey\">seasonal</span> ingredients.</p>\n");
      out.write("      <p class=\"w3-large w3-text-grey w3-hide-medium\">Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod temporincididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <hr>\n");
      out.write("  \n");
      out.write("  <!-- Menu Section -->\n");
      out.write("  <div class=\"w3-row w3-padding-64\" id=\"menu\">\n");
      out.write("    <div class=\"w3-col l6 w3-padding-large\">\n");
      out.write("      <h1 class=\"w3-center\">Our Menu</h1><br>\n");
      out.write("      <h4>Bread Basket</h4>\n");
      out.write("      <p class=\"w3-text-grey\">Assortment of fresh baked fruit breads and muffins 5.50</p><br>\n");
      out.write("    \n");
      out.write("      <h4>Honey Almond Granola with Fruits</h4>\n");
      out.write("      <p class=\"w3-text-grey\">Natural cereal of honey toasted oats, raisins, almonds and dates 7.00</p><br>\n");
      out.write("    \n");
      out.write("      <h4>Belgian Waffle</h4>\n");
      out.write("      <p class=\"w3-text-grey\">Vanilla flavored batter with malted flour 7.50</p><br>\n");
      out.write("    \n");
      out.write("      <h4>Scrambled eggs</h4>\n");
      out.write("      <p class=\"w3-text-grey\">Scrambled eggs, roasted red pepper and garlic, with green onions 7.50</p><br>\n");
      out.write("    \n");
      out.write("      <h4>Blueberry Pancakes</h4>\n");
      out.write("      <p class=\"w3-text-grey\">With syrup, butter and lots of berries 8.50</p>    \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"w3-col l6 w3-padding-large\">\n");
      out.write("      <img src=\"/w3images/tablesetting.jpg\" class=\"w3-round w3-image w3-opacity-min\" alt=\"Menu\" style=\"width:100%\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <hr>\n");
      out.write("\n");
      out.write("  <!-- Contact Section -->\n");
      out.write("  <div class=\"w3-container w3-padding-64\" id=\"contact\">\n");
      out.write("    <h1>Contact</h1><br>\n");
      out.write("    <p>We offer full-service catering for any event, large or small. We understand your needs and we will cater the food to satisfy the biggerst criteria of them all, both look and taste. Do not hesitate to contact us.</p>\n");
      out.write("    <p class=\"w3-text-blue-grey w3-large\"><b>Catering Service, 42nd Living St, 43043 New York, NY</b></p>\n");
      out.write("    <p>You can also contact us by phone 00553123-2323 or email catering@catering.com, or you can send us a message here:</p>\n");
      out.write("    <form action=\"/action_page.php\" target=\"_blank\">\n");
      out.write("      <p><input class=\"w3-input w3-padding-16\" type=\"text\" placeholder=\"Name\" required name=\"Name\"></p>\n");
      out.write("      <p><input class=\"w3-input w3-padding-16\" type=\"number\" placeholder=\"How many people\" required name=\"People\"></p>\n");
      out.write("      <p><input class=\"w3-input w3-padding-16\" type=\"datetime-local\" placeholder=\"Date and time\" required name=\"date\" value=\"2020-11-16T20:00\"></p>\n");
      out.write("      <p><input class=\"w3-input w3-padding-16\" type=\"text\" placeholder=\"Message \\ Special requirements\" required name=\"Message\"></p>\n");
      out.write("      <p><button class=\"w3-button w3-light-grey w3-section\" type=\"submit\">SEND MESSAGE</button></p>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("<!-- End page content -->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
      out.write("<footer class=\"w3-center w3-light-grey w3-padding-32\">\n");
      out.write("  <p>Powered by <a href=\"https://www.w3schools.com/w3css/default.asp\" title=\"W3.CSS\" target=\"_blank\" class=\"w3-hover-text-green\">w3.css</a></p>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
