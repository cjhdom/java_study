package examples.boot.myshop.security;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

public class MemberInfoArgumentResolver implements HandlerMethodArgumentResolver {
    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        // ref 비교 ==, 값 비교 equals
        // class는 메모리에 한번만 올라가기 때문에 ==로 ref비교 해도 상관x
        if (parameter.getParameterType() == MemberInfo.class) {
            return true;
        }
        return false;
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer, NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        MemberInfo memberInfo = new MemberInfo(5L, "urstory@gmail.com");
        return memberInfo;
    }
}
