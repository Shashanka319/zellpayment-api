package com.zellpayment.exception;

public class UserDevicesException extends Exception{
    public UserDevicesException(){
        super();
    }
    public UserDevicesException(String message){
        super(message);
    }
    public UserDevicesException(String message, Throwable throwable){
        super(message, throwable);
    }
}
