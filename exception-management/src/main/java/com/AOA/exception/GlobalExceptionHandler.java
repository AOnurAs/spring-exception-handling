package com.AOA.exception;

import com.AOA.model.RootEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice // Enables global exception handling for REST controllers
public class GlobalExceptionHandler {

    @ExceptionHandler(BaseException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST) // or NOT_FOUND etc.
    public RootEntity<?> handleBaseException(BaseException ex) {
        return RootEntity.error(ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public RootEntity<?> handleGenericException(Exception ex) {
        return RootEntity.error("An unexpected error occurred: " + ex.getMessage());
    }
}
