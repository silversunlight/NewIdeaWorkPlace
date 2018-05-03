package servletExamples;

import javax.servlet.*;
import java.io.IOException;

public class LogFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String site = filterConfig.getInitParameter("Site");
        System.out.println("Filter ��init��������");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("��������doFilter����");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("Filter �Զ�����");
    }
}
