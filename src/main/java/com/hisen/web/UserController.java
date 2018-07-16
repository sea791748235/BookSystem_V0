/**
 * FileName:    UserController
 * Author:      sealllsea
 * Date:        2018/7/4 16:14
 * Description:
 */
package com.hisen.web;

import com.hisen.entity.Book;
import com.hisen.entity.User;
import com.hisen.service.BookService;
import com.hisen.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login")
    private String login(User user) {
        logger.error(user.toString());
        boolean isLogin = userService.login(user.getUsername(), user.getPassword());
        if (isLogin) {
            return "redirect:/book/list";
        } else {
            //request.setAttribute("message", "登录信息错误");
            return "error";
        }
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    private String list(Model model) {
        List<User> list = userService.getList(0, 1000);
        model.addAttribute("list", list);
        return "list";// WEB-INF/jsp/"list".jsp
    }

    @RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
    private String detail(@PathVariable("id") int id, Model model) {
        User user = userService.getById(id);
        model.addAttribute("user", user);
        return "detail";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    @ResponseBody
    private String add(User user) {
        User hasUser = userService.getById(user.getId());
        int i = -2;
        if (hasUser == null) {
            i = userService.addUser(user);
        }
        return i > 0 ? "success" : "error";
    }

    @RequestMapping(value = "/del/{id}", method = RequestMethod.GET)
    @ResponseBody
    private String deleteUserById(@PathVariable("id") int id) {
        int i = userService.deleteUserById(id);
        return i > 0 ? "success" : "error";
    }
}
