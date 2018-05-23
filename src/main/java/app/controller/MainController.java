package app.controller;

import app.entity.Product;
import app.entity.User;
import app.service.user.UserService;
import com.sun.mail.imap.protocol.UIDSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class MainController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("userModel", new User());
        model.addAttribute("productModel", new Product());
    return "index";
    }

    @GetMapping("/join")
    public String join(Model model){

        model.addAttribute("users", userService.findAll());
        return "join";
    }

    @ModelAttribute("userModel")
    public User user(){
        return new User();
    }
    @ModelAttribute("productModel")
    public Product product(){
        return new Product();
    }


















}
