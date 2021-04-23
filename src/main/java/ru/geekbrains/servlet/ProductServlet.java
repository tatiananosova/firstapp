package ru.geekbrains.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.geekbrains.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/product_servlet")
public class ProductServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(FirstServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("New Get request with includes");
        resp.getWriter().println("<h1>Homework1</h1>");
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Potato", 4));
        products.add(new Product(2, "Tomato", 5));
        products.add(new Product(3, "Sweet Potato", 6));
        products.add(new Product(4, "Cucumber", 7));
        products.add(new Product(5, "Radish", 8));
        products.add(new Product(6, "Paper", 9));
        products.add(new Product(7, "Paper Bell", 10));
        products.add(new Product(8, "Horse Radish", 1));
        products.add(new Product(9, "Zucchini", 2));
        products.add(new Product(10, "Pumpkin", 3));

        for (Product p : products) {
            resp.getWriter().println("<p>" + p.toString() + "</p>");
        }
    }


}
