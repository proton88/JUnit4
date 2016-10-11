package com.suglob.modtest;

public class NotSuchMarkException extends Exception {
    public NotSuchMarkException(){

    }

    public NotSuchMarkException(String message){
        super(message);
    }
}
