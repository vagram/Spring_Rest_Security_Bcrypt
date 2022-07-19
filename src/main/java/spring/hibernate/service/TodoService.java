package spring.hibernate.service;

import spring.hibernate.entity.Case;

import java.util.List;

public interface TodoService {
    List<Case> getAll();
    Case getById(Integer id);

    void saveTodo(Case aCase);

    void deleteTodoById(Integer id);

    void deleteAllCases();
}
