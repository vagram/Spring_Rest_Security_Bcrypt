package spring.hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.hibernate.entity.Case;
import spring.hibernate.service.TodoService;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping("/todos")
    public List<Case> getAll(){
        return todoService.getAll();
    }

    @GetMapping("/todos/{id}")

    public Case getById(@PathVariable Integer id){
        return todoService.getById(id);
    }

    @PostMapping("/todos")
    public Case addNewTodo(@RequestBody Case aCase){
        todoService.saveTodo(aCase);
        return aCase;
    }

    @PutMapping("/todos")
    public Case updateCase(@RequestBody Case aCase){
        todoService.saveTodo(aCase);
        return aCase;
    }

    @DeleteMapping("/todos/{id}")
    public void deleteCase(@PathVariable("id") Integer id){
        todoService.deleteTodoById(id);
    }

    @DeleteMapping("/todos")
    public void deleteAllCases(){
        todoService.deleteAllCases();
    }


}
