package com.example.PracticeAssignment.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Component
@Order(1)
public class BrowserFilter implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        String userAgent = ((HttpServletRequest) servletRequest).getHeader("User-Agent");

        if (userAgent != null && userAgent.toLowerCase().contains("postman")) {
            ((HttpServletResponse) servletResponse).setHeader("Trigger-Agent", "Server filter");
            ((HttpServletResponse) servletResponse).setStatus(HttpServletResponse.SC_FORBIDDEN);
            servletResponse.setContentType("application/json");
            servletResponse.setCharacterEncoding("UTF-8");

            Map<String, String> msg = new HashMap<>();
            msg.put("timestamp", LocalDateTime.now().toString());
            msg.put("status", String.valueOf(HttpServletResponse.SC_FORBIDDEN));
            msg.put("error", String.valueOf(HttpStatus.FORBIDDEN));
            msg.put("message", "Your request comes from Postman");
            msg.put("path", ((HttpServletRequest) servletRequest).getRequestURI());
            servletResponse.getWriter().write(new ObjectMapper().writeValueAsString(msg));
        }
        else filterChain.doFilter(servletRequest, servletResponse);

    }
}
