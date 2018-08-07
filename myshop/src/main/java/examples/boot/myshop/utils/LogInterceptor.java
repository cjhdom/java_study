package examples.boot.myshop.utils;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //ThreadLocal<Long> longThreadLocal = new ThreadLocal<>();
        //longThreadLocal.set(System.nanoTime());
        LogContext.timeLog.set(System.nanoTime());
        request.setAttribute("startTime", System.nanoTime());
        System.out.println("preHandle : " + handler);
        return super.preHandle(request, response, handler); //true면 ok false면 not ok, false면 controller 호출 안함
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
        //ThreadLocal<Long> longThreadLocal = new ThreadLocal<>();
        // longThreadLocal.set(System.nanoTime());
        Long startTime = LogContext.timeLog.get();
        Long timeTaken = System.nanoTime() - startTime;
        System.out.println("postHandle : " + handler + ", time taken : " + timeTaken);
    }
}
