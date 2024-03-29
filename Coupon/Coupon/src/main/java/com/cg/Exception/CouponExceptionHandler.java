package com.cg.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CouponExceptionHandler
{
@ExceptionHandler(Exception.class)
public ResponseEntity<String> error(Exception exception)
{
	System.out.println("Exception Handled");
	return new ResponseEntity<String>(exception.getMessage(),HttpStatus.NOT_FOUND);
}


}
