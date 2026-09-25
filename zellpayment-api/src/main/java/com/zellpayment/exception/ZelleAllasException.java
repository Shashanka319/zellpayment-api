package com.zellpayment.exception;

public class ZelleAllasException extends Exception {
    public ZelleAllasException(){
        super();
    }
    public ZelleAllasException(String message){
        super(message);
    }
    public ZelleAllasException(String message, Throwable throwable){
        super(message, throwable);
    }
}
