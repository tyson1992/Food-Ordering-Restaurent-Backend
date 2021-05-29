package com.upgrad.FoodOrderingApp.service.exception;

import org.springframework.http.HttpStatus;

import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * AddressNotFoundException is thrown when address id customer entered does not exist in the database.
 */
public class AddressNotFoundException extends Exception {
    private final String code;
    private final String errorMessage;

    public AddressNotFoundException(final String code, final String errorMessage) {
        this.code = code;
        this.errorMessage = errorMessage;
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }

    @Override
    public void printStackTrace(PrintStream s) {
        super.printStackTrace(s);
    }

    @Override
    public void printStackTrace(PrintWriter s) {
        super.printStackTrace(s);
    }

    public String getCode() {
        return code;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public HttpStatus getHttpCode() {
        switch(code) {
            case "ATH-001" : return HttpStatus.UNAUTHORIZED;
            case "ATH-002" : return HttpStatus.UNAUTHORIZED;
        }
        return HttpStatus.NOT_FOUND;
    }

}

