package com.guiabolso.guiabolsochallenge.errors

import com.guiabolso.guiabolsochallenge.errors.exceptions.ResourceNotFoundException
import org.springframework.http.HttpStatus.BAD_REQUEST
import org.springframework.http.HttpStatus.NOT_FOUND
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ErrorHandler {

    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun handleMethodArgumentNotValid(ex: MethodArgumentNotValidException) = ex.bindingResult.fieldErrors
            .map { ErrorObject(it.defaultMessage!!, it.field, it.rejectedValue!!) }
            .let { ResponseEntity(ErrorResponse("Invalid data", it), BAD_REQUEST) }

    @ExceptionHandler(ResourceNotFoundException::class)
    fun handleResourceNotFoundException(ex: ResourceNotFoundException): ResponseEntity<ErrorResponse> {
        val error = ErrorObject(ex.message, ex.field, ex.parameter)
        val errorResponse = ErrorResponse("Application could not handle the request", listOf(error))

        return ResponseEntity(errorResponse, NOT_FOUND)
    }
}
