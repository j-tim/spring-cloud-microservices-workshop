package nl.workshop.cloud.apigateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;

/**
 * Applies a custom http response header.
 * @see - <a href="https://spring.io/guides/gs/routing-and-filtering/">Spring Cloud Zuul Documentation</a>
 * @see - <a href="https://github.com/Netflix/zuul/wiki/Writing-Filters">Zuul Filter Options</a>
 */
@Slf4j
@Service
public class CustomHttpResponseHeaderFilter extends ZuulFilter {

  @Override
  public String filterType() {
    return FilterConstants.POST_TYPE;
  }

  @Override
  public int filterOrder() {
    return -1;
  }

  @Override
  public boolean shouldFilter() {
    log.info("Response filter, shouldFilter()");
    return true;
  }

  public Object run() {
    RequestContext context = RequestContext.getCurrentContext();
    HttpServletResponse servletResponse = context.getResponse();
    servletResponse.addHeader("my-token",
        "ce099d7e208dc921e259b48aadef36c1");
    return null;
  }
}
