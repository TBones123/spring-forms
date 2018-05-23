package app.controller;

import app.entity.Product;
import app.entity.User;
import app.service.product.ProductService;
import app.service.user.UserService;
import app.service.user.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/save")


public class SaveController {

    @Autowired
    private UserService userService;
    @Autowired
    private ProductService productService;
    @Autowired
    private UserValidator userValidator;

    @PostMapping("/user")
    public String saveUser(@ModelAttribute("userModel") @Validated User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "index";
        } else {

            userService.save(user);
            return "index";
        }
    }

    @InitBinder("userModel")
    public void binder(WebDataBinder dataBinder) {
        dataBinder.addValidators(userValidator);
    }


    @PostMapping("/product")
    public String saveProduct(@ModelAttribute("productModel") Product assortment) {
        productService.save(assortment);
        return "index";
    }


    @PostMapping("/product/user")
    public String SaveProductUser(@ModelAttribute Product productModel) {
        productService.save(productModel);

        return "index";
    }

    @ModelAttribute("userModel")
    public User user() {
        return new User();
    }

    @ModelAttribute("productModel")
    public Product product() {
        return new Product();
    }


}
