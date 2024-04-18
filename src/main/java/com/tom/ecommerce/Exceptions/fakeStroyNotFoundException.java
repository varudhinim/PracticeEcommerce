package com.tom.ecommerce.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.NOT_FOUND)
public class fakeStroyNotFoundException extends Exception{
    public fakeStroyNotFoundException(){
        super("The product ID Which your giving is not in the Given List");
    }
}
