package com.guiabolso.guiabolsochallenge.domain.services

import com.guiabolso.guiabolsochallenge.domain.entities.Book
import com.guiabolso.guiabolsochallenge.domain.repositories.BookRepository
import com.guiabolso.guiabolsochallenge.errors.exceptions.ResourceNotFoundException
import org.springframework.stereotype.Service

/**
 * @author vinicius.moraes on 2019-01-05
 */
@Service
class BookService(
        private val bookRepository: BookRepository
) {
    fun save(book: Book): Book = bookRepository.save(book)

    fun find(id: Int) = bookRepository.findById(id)
            ?: throw ResourceNotFoundException("Book Not found", "id", id)

    fun findAll() = bookRepository.findAll()
}