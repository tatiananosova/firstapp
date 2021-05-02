package ru.geekbrains.mvc.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.geekbrains.mvc.dto.Product;
import ru.geekbrains.mvc.service.ProductService;

import java.util.List;

@Controller
@RequestMapping("/product")
@RequiredArgsConstructor
@Log4j2
public class ProductController {

    private final ProductService productService;


    @GetMapping
    public String showHtml(Model model) {
        model.addAttribute("products", productService.getProducts());
        return "product";
    }
}
