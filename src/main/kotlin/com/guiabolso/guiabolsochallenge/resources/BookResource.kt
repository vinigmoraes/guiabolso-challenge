package com.guiabolso.guiabolsochallenge.resources

import com.guiabolso.guiabolsochallenge.controllers.BookController
import com.guiabolso.guiabolsochallenge.domain.entities.Book
import org.springframework.hateoas.ResourceSupport
import org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo
import org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn

/**
 * @author vinicius.moraes on 2019-01-05
 */
class BookResource(val book: Book) : ResourceSupport() {

    init {
        add(linkTo(methodOn(BookController::class.java).findAll()).withRel("books"))
        add(linkTo(methodOn(BookController::class.java).find(book.id)).withSelfRel())
    }
}