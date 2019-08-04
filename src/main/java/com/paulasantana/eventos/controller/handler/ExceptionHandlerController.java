package com.paulasantana.eventos.controller.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.paulasantana.eventos.exception.EventoNaoEncontradoException;

@ControllerAdvice
@Controller
public class ExceptionHandlerController extends ResponseEntityExceptionHandler {

	@ExceptionHandler(EventoNaoEncontradoException.class)
	public final ResponseEntity<?> exception(EventoNaoEncontradoException exception) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMessage());
	}

}
