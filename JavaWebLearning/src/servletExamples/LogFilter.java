package servletExamples;

import javax.servlet.*;
import java.io.IOException;

public class LogFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String site = filterConfig.getInitParameter("Site");
        System.out.println("��վ���ƣ� "+site);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("վ�����ƣ� ��������afjlafjlkfjlasjf");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
