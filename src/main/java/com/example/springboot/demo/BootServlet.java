package com.example.springboot.demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class BootServlet extends HttpServlet {
    @Override
    protected void doGet (HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        PrintWriter writer = resp.getWriter();
        writer.println("response from servlet ");
    }
}
