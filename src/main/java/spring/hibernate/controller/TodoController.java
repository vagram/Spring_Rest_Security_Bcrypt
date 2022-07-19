package spring.hibernate.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TodoController {

    @GetMapping("/")
    public String getInfoForAllTodos(){
        return "all-todos-info";
    }

    @GetMapping("/high-info")
    public String getInfoForHighPriority() {
        return "high-info";
    }

    @GetMapping("/middle-info")
    public String getInfoForMiddlePriority(){
        return "middle-info";
    }

}
