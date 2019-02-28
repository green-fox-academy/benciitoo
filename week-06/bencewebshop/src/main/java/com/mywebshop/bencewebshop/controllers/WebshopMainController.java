package com.mywebshop.bencewebshop.controllers;


import com.mywebshop.bencewebshop.models.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

@Controller
public class WebshopMainController {

    List<Item> shopItemsList = new ArrayList<>();

    public void initializeList() {
        shopItemsList.add(new Item("Running shoes", "Nike running shoes for every day sport", 2000, 24));
        shopItemsList.add(new Item("Printer", "HP printer that will print pages", 30000, 0));
        shopItemsList.add(new Item("Coca-cola", "0,5l can", 300, 500));
        shopItemsList.add(new Item("T-shirt", "You won't be naked", 3000, 50));
        shopItemsList.add(new Item("Nike backpack", "Let your stuff travel in style!", 12000, 20));
    }

    public WebshopMainController() {
        initializeList();
    }


    @RequestMapping("/webshop")
    public String listToWebshop(Model model) {
        model.addAttribute("items", shopItemsList);
        return "webshop";
    }

    @RequestMapping("/webshop/only-available")
    public String onlyAvailableList(Model model) {
        List<Item> availableList = shopItemsList.stream()
                .filter(item -> item.getQuantity() > 0)
                .collect(Collectors.toList());
        model.addAttribute("items", availableList);
        return "webshop";
    }

    @RequestMapping("/webshop/cheapest-first")
    public String returnsCheapestFirstList(Model model) {
        List<Item> cheapestFirstList = shopItemsList.stream()
                .sorted(Comparator.comparing(Item::getPrice))
                .collect(Collectors.toList());
        model.addAttribute("items", cheapestFirstList);
        return "webshop";
    }

    @RequestMapping("/webshop/contains-nike")
    public String returnsListThatContainsNike(Model model) {
        List<Item> listThatContainsNike = shopItemsList.stream()
                .filter(x -> x.getName().toLowerCase().contains("nike") || x.getDescription().toLowerCase().contains("nike"))
                .collect(Collectors.toList());
        model.addAttribute("items", listThatContainsNike);
        return "webshop";
    }

    @RequestMapping("/webshop/average-stock")
    public String returnsAverageStock(Model model) {
        double average = shopItemsList.stream()
                .mapToDouble(Item::getQuantity)
                .summaryStatistics()
                .getAverage();
        String averagestock = "Average stock: " + average;
        model.addAttribute("result", averagestock);
        return "getnumbers";
    }

    @RequestMapping("/webshop/most-expensive-available")
    public String returnsMostExpensiveItem(Model model) {
        List<Item> tempList = shopItemsList.stream()
                .sorted(Comparator.comparing(Item::getPrice))
                .collect(Collectors.toList());
        String mostExpensiveItemName = "The most expensive item from our shop is: " + tempList.get(tempList.size() - 1).getName();

        /*List<Item> nameOfMostExpensive;
        nameOfMostExpensive = stock.stream()
                .sorted((a, b) -> a.getPrice() >= b.getPrice() ? -1 : 1)
                .limit(1)
                .collect(Collectors.toList());

                Itt a sorted-nél az egészet sorbarendezi, a limit egy elemet vesz ki, a legelsőt a listából, amit itt a legnagyobb
                */

        model.addAttribute("result", mostExpensiveItemName);
        return "getnumbers";
    }

    @PostMapping("/webshop/search")
    public String search(Model model, @RequestParam("searchField") String keyword) {
        List<Item> megsemszarlakle = shopItemsList.stream()
                .filter(x -> x.getName().toLowerCase().contains(keyword) || x.getDescription().toLowerCase().contains(keyword))
                .collect(Collectors.toList());
        model.addAttribute("items", megsemszarlakle);
        return "webshop";
    }

}
