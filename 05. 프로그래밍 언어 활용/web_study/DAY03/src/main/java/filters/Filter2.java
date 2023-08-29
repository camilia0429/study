package filters;

import jakarta.servlet.*;

import java.io.IOException;

public class Filter2 implements Filter {


    @Override
    public void doFilter(ServletRequest Request, ServletResponse Response, FilterChain Chain) throws IOException, ServletException {

        System.out.println("filter2 - 요청 전 처리");
        Chain.doFilter(Request,Response); // JoinServlet::doGet
        System.out.println("filter2 - 요청 후 처리");

    }
}
