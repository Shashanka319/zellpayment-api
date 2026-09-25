package com.zellpayment.exception;

public class TransactionLimitsException extends Exception{
    public  TransactionLimitsException(){
        super();
    }
    public TransactionLimitsException(String message){
        super(message);
    }
    public TransactionLimitsException(String message, Throwable throwable){
        super(message, throwable);
    }
}
