package com.AOA.handler;

import com.AOA.exception.BaseException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler({BaseException.class})
    public ResponseEntity<ApiError> handleBaseException(BaseException baseException, WebRequest request) {
        return ResponseEntity.badRequest().body(this.createApiError(baseException.getMessage(), request));
    }

    public <E> ApiError<E> createApiError(E message, WebRequest request) {
        ApiError<E> apiError = new ApiError();
        apiError.setStatus(HttpStatus.BAD_REQUEST.value());
        Exception<E> exception = new Exception();
        exception.setCreateTime(new Date());
        exception.setHostName(this.getHostname());
        exception.setPath(request.getDescription(false).substring(4));
        exception.setMessage(message);
        apiError.setException(exception);
        return apiError;
    }

    private String getHostname() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            System.out.println("hata oluştu " + e.getMessage());
            return null;
        }
    }
}
