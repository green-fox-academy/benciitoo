package com.greenfoxacademy.hundredmilepagony.Controllers;


import com.greenfoxacademy.hundredmilepagony.Model.Gender;
import com.greenfoxacademy.hundredmilepagony.Model.Inhabitant;
import com.greenfoxacademy.hundredmilepagony.Model.InhabitantList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class InhabitantController {

    InhabitantList list;

    @Autowired
    InhabitantController(InhabitantList list) {
        this.list = list;
    }

    @GetMapping(path = "/")
    public String getMainPage() {
        return "index";
    }

    @GetMapping(value = "/inhabitants")
    public String showInhabitants(Model model) {
        model.addAttribute("inhabitants", list.getInhbaitantlist());
        return "inhabitants_table";
    }

    @GetMapping(value = "/inhabitants/{id}")
    public String getInhabitatnbyIDd(@PathVariable int id, Model model) {
        Inhabitant inhabitant = list.getInhabitantFromId(id);

        if (inhabitant != null) {
            model.addAttribute("inhabitant_by_id", inhabitant);
        } else {
            model.addAttribute("error", "No inhabitatn with this id");
        }
        return "inhabitant_id";
    }

    @PostMapping(value = "/addInhabitant")
    public String addInhabitantModel(@ModelAttribute Inhabitant inhabitant, Model model) {
        list.addNewInahbaitant(inhabitant);
        return "redirect:/inhabitants";
    }

    @GetMapping(value = "/addInhabitant")
    public String refreshedInhabitant(Model model, @ModelAttribute Inhabitant inhabitant) {
        model.addAttribute("inhabitant", inhabitant);
        model.addAttribute("genders", Gender.values());
        return "inhabitant_newTable";
    }
}


