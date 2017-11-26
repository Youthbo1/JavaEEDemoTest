package filter;

/**
 * 字符集编码过滤器
 */
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodingFilter implements Filter {

	private FilterConfig config;

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		request.setCharacterEncoding(config.getInitParameter("charset"));// 根据过滤器配置字符集，设置请求字符集编码

		// System.out.println("characterEncodingFilter 请求预处理");//测试过滤器（链）工作流程使用
		chain.doFilter(request, response);
		// System.out.println("characterEncodingFilter 响应后处理");//测试过滤器（链）工作流程使用

	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		this.config = config;

	}

	public FilterConfig getConfig() {
		return config;
	}

	public void setConfig(FilterConfig config) {
		this.config = config;
	}

}
