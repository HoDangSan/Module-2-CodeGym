package com.hodangsan.ProductDiscountCalculator.backend;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculateDiscountServlet", urlPatterns = "/display_discount")
public class CalculateDiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        double price = Double.parseDouble(request.getParameter("price"));
        double discount_percent = Double.parseDouble(request.getParameter("discount_percent"));
        double discount_Amount = price * discount_percent / 100;
        double discount_Price = price - discount_Amount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Product Discount Calculator</title>");
        writer.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">");
        writer.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<div id=\"content\">");
        writer.println("<h1 id=\"title\">Product Discount Calculator</h1>");
        writer.println("<form method=\"post\" action=\"/display_discount\">");
        writer.println("<div id=\"data\">");
        writer.println("<label id=\"lbprodes\">Product Description:</label>");
        writer.println("<span>"+description+"</span><br>");
        writer.println("<label id=\"lblispri\">List Price:</label>");
        writer.println("<span>$"+price+"</span><br>");
        writer.println("<label id=\"lbdisper\">Discount Percent:</label>");
        writer.println("<span>"+discount_percent+"%</span><br>");
        writer.println("<label id=\"lbdisamo\">Discount Amount:</label>");
        writer.println("<span>$"+discount_Amount+"</span><br>");
        writer.println("<label id=\"lbdispri\">Discount Price:</label>");
        writer.println("<span>$"+discount_Price+"</span><br>");
        writer.println("</div>");
        writer.println("</form>");
        writer.println("</div>");
        writer.println("</body>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
