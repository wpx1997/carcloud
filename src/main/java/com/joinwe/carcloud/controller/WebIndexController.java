package com.joinwe.carcloud.controller;

import com.joinwe.carcloud.dto.ResultDTO;
import com.joinwe.carcloud.dto.WebTestDTO;
import com.joinwe.carcloud.dto.WebUserLoginDTO;
import com.joinwe.carcloud.exception.CustomizeErrorCode;
import com.joinwe.carcloud.model.WebUser;
import com.joinwe.carcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.UUID;

/**
 * @author 小case
 * 2020/5/20 14:34
 */
@ResponseBody
@Controller
public class WebIndexController {

    @Autowired
    private UserService userService;

    @Autowired
    private WebTestDTO webTestDTO;

    /**
     *
     * index 查看用户是否登录，若未登录则跳转到登录界面
     *
     * @author: 小case
     * @date: 2020/6/16 15:39
     * @param request
     * @return: String
     */
    @GetMapping("/")
    public String index(HttpServletRequest request) {

        WebUser webUser = (WebUser) request.getSession().getAttribute("user");
        if (webUser == null) {
            return "login";
        }

        return "index";
    }

    /**
     *
     * login
     *
     * @author: 小case
     * @date: 2020/6/16 15:40
     * @param
     * @return: String
     */
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    /**
     *
     * login 验证用户的登录账号和密码
     *
     * @author: 小case
     * @date: 2020/6/16 15:41
     * @param webUserLoginDTO
     * @param response
     * @return: Object
     */
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Object login(@RequestBody WebUserLoginDTO webUserLoginDTO,
                        HttpServletResponse response) {

        List<WebUser> webUserList = userService.loginVerify(webUserLoginDTO);
        if (!webUserList.isEmpty()) {
            WebUser webUser = webUserList.get(0);
            String token = UUID.randomUUID().toString();
            webUser.setToken(token);
            userService.updateWebUser(webUser);
            response.addCookie(new Cookie("token", token));

            return ResultDTO.okOf(webUser);
        } else {
            return ResultDTO.errorOf(CustomizeErrorCode.USER_NOT_EXISTENCE);
        }

    }

    /**
     *
     * logout 退出登录
     *
     * @author: 小case
     * @date: 2020/6/16 15:41
     * @param request
     * @param response
     * @return: String
     */
    @GetMapping("/logout")
    public String logout(HttpServletRequest request,
                         HttpServletResponse response) {

        request.getSession().removeAttribute("user");
        Cookie cookie = new Cookie("token", null);
        cookie.setMaxAge(0);
        response.addCookie(cookie);

        return "redirect:/";
    }

    @GetMapping("/test")
    public Object test(){

        webTestDTO.setName("aa");
        webTestDTO.setAge(18);

        return webTestDTO;
    }

    @GetMapping("/test/5")
    public Object test5(){
        return webTestDTO;
    }

}
