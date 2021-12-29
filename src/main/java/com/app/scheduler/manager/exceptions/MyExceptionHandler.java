package com.app.scheduler.manager.exceptions;

import com.app.scheduler.manager.utils.HttpResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.persistence.NoResultException;
import java.util.NoSuchElementException;

@RestControllerAdvice
public class MyExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyExceptionHandler.class);

    @ExceptionHandler(Exception.class )
    public ResponseEntity<HttpResponse> internalServerErrorException(Exception exception){
        LOGGER.error(exception.getMessage());
        return HttpResponse.create(HttpStatus.INTERNAL_SERVER_ERROR,"Internal Server Error");
    }


    @ExceptionHandler(NoResultException.class)
    public ResponseEntity<HttpResponse> noFoundException(NoResultException exception) {
        LOGGER.error(exception.getMessage());
        return HttpResponse.create(HttpStatus.NOT_FOUND,exception.getMessage());
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<HttpResponse> noSuchElementException(NoSuchElementException exception) {
        LOGGER.error(exception.getMessage());
        return HttpResponse.create(HttpStatus.NOT_FOUND,exception.getMessage());
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<HttpResponse> requestHandlingNoHandlerFound(NoHandlerFoundException exception) {
        LOGGER.error(exception.getMessage());
        return HttpResponse.create(HttpStatus.BAD_REQUEST,exception.getMessage());
    }



}
