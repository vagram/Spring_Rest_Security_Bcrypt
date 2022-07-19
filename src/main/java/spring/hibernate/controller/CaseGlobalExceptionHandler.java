package spring.hibernate.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import spring.hibernate.exception.CaseIncorrectData;
import spring.hibernate.exception.NoSuchCaseException;

@ControllerAdvice
public class CaseGlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<CaseIncorrectData> handel(NoSuchCaseException caseException){
        return new ResponseEntity<>(new CaseIncorrectData(caseException.getMessage()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<CaseIncorrectData> handel(Exception caseException){
        return new ResponseEntity<>(new CaseIncorrectData(caseException.getMessage()), HttpStatus.BAD_REQUEST);
    }
}
