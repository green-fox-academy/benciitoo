package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HelloToAllController {

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    @RequestMapping("/greetall")
    public String greeting(Model model) {
        //model.addAttribute("oneGreeting", hellos);
        model.addAttribute("color1", (int) (Math.random() * 255));
        model.addAttribute("color2", (int) (Math.random() * 255));
        model.addAttribute("color3", (int) (Math.random() * 255));
        model.addAttribute("oneGreeting", hellos[(int) (Math.random() * hellos.length - 1)]);
        model.addAttribute("px", (8 + (Math.random() * 99)));

        return "greetall";
    }
}