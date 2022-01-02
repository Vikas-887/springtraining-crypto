package gov.police.college.controllers;

import gov.police.college.models.Registration;
import gov.police.college.services.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class StudentController {

    @Autowired
    StudentService studentService; // IoC = Inversion of Control
    // login

    @GetMapping("/login")
    public String showLoginPage(){
        return "login-page";
    }
    @PostMapping("/login")
    public String doLogin(String username, String password){
        boolean loginStatus = studentService.doLogin(username, password);
        if(loginStatus){
            log.info("Congratulations , you are in");
            return "Congratulations , you are in";
        }else {
            log.info("Login Failed");
            return "Login Failed";
        }
    }

    // register
    @PostMapping("/register")
    public String registration(String name, String dob){
        // todo: completed
        return "";
    }
}
