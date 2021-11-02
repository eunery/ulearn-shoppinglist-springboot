package com.example.ulearnshoppinglistspringboot.controllers;

//import com.example.ulearnshoppinglistspringboot.SessionList;
import com.example.ulearnshoppinglistspringboot.ShoppingList;
import com.example.ulearnshoppinglistspringboot.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewController {
    @RequestMapping(path = "/list", method = RequestMethod.GET)
    public String list( Model model) {
        model.addAttribute("list", ShoppingList.getProductList());
        return "list";
    }

    @RequestMapping(path = "/list/{id}", method = RequestMethod.GET)
    public String item(@PathVariable("id") int id, Model model){
        try {
            Product product = ShoppingList.get(id);
            model.addAttribute("item", product);
            return "item";
        }
        catch (Exception e){
            return "redirect:/list";
        }
    }
}
