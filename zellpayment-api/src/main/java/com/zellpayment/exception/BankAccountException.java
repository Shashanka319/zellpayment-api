package com.zellpayment.exception;

public class BankAccountException extends Exception{
    public BankAccountException(){
        super();
    }
    public BankAccountException(String message){
        super(message);
    }

    public BankAccountException(String message, Throwable cause){
        super(message, cause);
    }
}
