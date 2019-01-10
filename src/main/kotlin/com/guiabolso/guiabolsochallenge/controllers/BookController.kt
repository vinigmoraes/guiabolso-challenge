package com.guiabolso.guiabolsochallenge.controllers

import com.guiabolso.guiabolsochallenge.domain.entities.Book
import com.guiabolso.guiabolsochallenge.domain.services.BookService
import com.guiabolso.guiabolsochallenge.resources.BookResource
import org.springframework.http.HttpStatus.CREATED
import org.springframework.http.HttpStatus.OK
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

/**
 * @author vinicius.moraes on 2019-01-05
 */

@RestController
@RequestMapping("/books")
class BookController(
        private val bookService: BookService
) {

    @PostMapping
    fun save(@Valid @RequestBody book: Book) = ResponseEntity(BookResource(bookService.save(book)), CREATED)

    @GetMapping("/{id}")
    fun find(@PathVariable id: Int) = ResponseEntity(BookResource(bookService.find(id)), OK)

    @GetMapping
    fun findAll() = ResponseEntity(bookService.findAll(), OK)
}