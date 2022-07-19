package spring.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.hibernate.dao_or_repository.TodoRepository;
import spring.hibernate.entity.Case;
import spring.hibernate.exception.NoSuchCaseException;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;
@Service
public class TodoServiceImpl implements TodoService{
    private TodoRepository todoRepository;

    @Autowired
    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    @Transactional
    public List<Case> getAll() {
        return todoRepository.getAllTodos();
    }

    @Override
    @Transactional
    public Case getById(Integer id) {
        Case aCase = todoRepository.getById(id);
        if (aCase == null){
            throw new NoSuchCaseException("There's no Case with such a id: " + id + " in Database");
        }
        return aCase;
    }

    @Override
    @Transactional
    public void saveTodo(Case aCase) {
        todoRepository.saveTodo(aCase);
    }

    @Override
    @Transactional
    public void deleteTodoById(Integer id) {
        Case aCase = todoRepository.getById(id);
        if (aCase == null){
            throw new NoSuchCaseException("There's no Case with such a id: " + id + " in Database");
        }
        aCase.setIsDeleted(1);
        todoRepository.saveTodo(aCase);
    }

    @Override
    @Transactional
    public void deleteAllCases() {
        todoRepository.deleteAllCases();
    }
}
