package spring.hibernate.dao_or_repository;

import spring.hibernate.entity.Case;

import java.util.List;

public interface TodoRepository {
    List<Case> getAllTodos();
    Case getById(Integer id);

    void saveTodo(Case aCase);

    void deleteAllCases();

}
