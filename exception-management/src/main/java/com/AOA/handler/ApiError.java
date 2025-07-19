package com.AOA.handler;

import lombok.Generated;

public class ApiError<E> {
    private Integer status;
    private Exception<E> exception;

    @Generated
    public Integer getStatus() {
        return this.status;
    }

    @Generated
    public Exception<E> getException() {
        return this.exception;
    }

    @Generated
    public void setStatus(final Integer status) {
        this.status = status;
    }

    @Generated
    public void setException(final Exception<E> exception) {
        this.exception = exception;
    }
}
