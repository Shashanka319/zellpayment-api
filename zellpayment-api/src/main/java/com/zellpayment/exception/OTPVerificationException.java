package com.zellpayment.exception;

public class OTPVerificationException extends Exception{
    public OTPVerificationException(){
        super();
    }
    public OTPVerificationException(String message){
        super(message);
    }
    public OTPVerificationException(String message, Throwable throwable){
        super(message,throwable);
    }
}
