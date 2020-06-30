package com.joinwe.carcloud.interceptor;

import com.joinwe.carcloud.model.WebUser;
import com.joinwe.carcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author 小case
 */
@Service
public class SessionInterceptor implements HandlerInterceptor {

    @Autowired
    private UserService userService;

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        Cookie[] cookies = request.getCookies();
        if (cookies != null){
            for (Cookie cookie:cookies) {
                if ("token".equals(cookie.getName())){
                    String token = cookie.getValue();
                    List<WebUser> webUserList = userService.selectWebUserByToken(token);

                    if (webUserList.size() != 0){
                        request.getSession().setAttribute("user",webUserList.get(0));
                    }
                    break;
                }
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
