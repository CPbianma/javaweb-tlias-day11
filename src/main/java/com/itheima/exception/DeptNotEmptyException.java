package com.itheima.exception;

public class DeptNotEmptyException extends RuntimeException {
    public DeptNotEmptyException(String message) {
        super(message);
    }
}
