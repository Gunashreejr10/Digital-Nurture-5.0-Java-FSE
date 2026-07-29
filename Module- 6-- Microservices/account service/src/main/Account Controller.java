package com.cognizant.fse.accountservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to the Account Service!";
    }

    @GetMapping("/status")
    public String getAccountStatus() {
        return "Account Service is active.";
    }

    @GetMapping("/details")
    public String getAccountDetails() {
        return "User ID: 123 | Available Balance: $1000.00";
    }
}
