package me.shulinina.web33.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class TitulController {
    @GetMapping("/")
    public String helloWorld() {
        return "Добро пожаловать!";
    }
    @GetMapping("/info")
        public String info(String nameStudent, String nameProject, LocalDate dateProject, String descriptionProject){
        nameStudent = "Марина";
        nameProject = "Приложение для рецептов";
        dateProject = LocalDate.now();
        descriptionProject = "Все о рецептах";
        return "Приложение запущено " + " / " + nameStudent + " / " + nameProject + " / " + dateProject +" / " + descriptionProject;
    }
}
