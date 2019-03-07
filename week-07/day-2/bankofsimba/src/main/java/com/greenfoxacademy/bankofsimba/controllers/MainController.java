package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller

public class MainController {

    private List<BankAccount> bankAccountList;

    private void initializeList() {
        bankAccountList.add(new BankAccount("Mufasa", 1000, "lion", true, true));
        bankAccountList.add(new BankAccount("Nala", 1500, "lion", false, true));
        bankAccountList.add(new BankAccount("Zazu", 1300, "bird", false, true));
        bankAccountList.add(new BankAccount("Ed", 400, "hyena", false, false));
        bankAccountList.add(new BankAccount("Pumba", 650, "boar", false, true));
    }

    public MainController(){
        bankAccountList = new ArrayList<>();
        initializeList();
    }


    private BankAccount firstAccount = new BankAccount("Simba", 2000, "lion", true, true);
    @RequestMapping(path = "/show", method = RequestMethod.GET)
    public String showAccount(Model model) {
        model.addAttribute("account", firstAccount);
        return "show";
    }


    @GetMapping(path = "/htmlception")
    public String htmlception(Model model) {
        model.addAttribute("returnString", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "htmlceptionpage";
    }


    @GetMapping(path = "/showaccounts")
    public String showAllAccounts(Model model){
        model.addAttribute("accounts", bankAccountList);
        model.addAttribute("newaccount", new BankAccount());
        return "showallaccounts";
    }


    @PostMapping(path = "/showaccounts")
    public String raiseMoneyForAnAnimal(Model model, @RequestParam ("nameField") String nameX){

        for (BankAccount account : bankAccountList) {
            if (account.getName().toLowerCase().equals(nameX.toLowerCase())){
                if(account.isKing()){
                    account.setBalance(account.getBalance() + 100);
                } else {
                    account.setBalance(account.getBalance() + 10);
                }
            }
        }
        model.addAttribute("accounts", bankAccountList);
        return "showallaccounts";
    }


    @PostMapping(path = "/showaccounts/addaccountbox")
    public String addAccount(Model model, @ModelAttribute ("newaccount") BankAccount newBankAccount){
        bankAccountList.add(newBankAccount);
        model.addAttribute("accounts", bankAccountList);
        return "showallaccounts";
    }

}