package com.product.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.product.model.Product;
import com.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/")
    public String home(){
        //url -  localhost:8080/
        System.out.println("Welcome page !!");
        return "welcome";
    }

    @RequestMapping("/add-product")
    public String addProduct(Model model){
        model.addAttribute("title","Add Product");
        return "addProduct";
    }

    //handle product -  add product
    @RequestMapping(value = "/handle-product", method = RequestMethod.POST)
    public RedirectView handleProduct(@ModelAttribute Product product, Model model, HttpServletRequest request){
        RedirectView rv = new RedirectView();
        System.out.println(product);
        productService.addProduct(product);
        rv.setUrl(request.getContextPath()+"/");
        return rv;
    }
}
