/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;


/**
 *
 * @author Rohit
 */
public class down extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String filePath = "C://upload/pooja.jpeg"; // Replace with the actual file path.
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment; filename=\"filename.jpeg\"");
        try (OutputStream out = response.getOutputStream()) {
            java.nio.file.Path file = java.nio.file.Paths.get(filePath);
            java.nio.file.Files.copy(file, out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
