package com.guiabolso.guiabolsochallenge.domain.repositories

import com.guiabolso.guiabolsochallenge.domain.entities.Book
import org.springframework.data.repository.Repository

/**
 * @author vinicius.moraes on 2019-01-05
 */

interface BookRepository : Repository<Book, Int> {

    fun save(book: Book): Book

    fun findById(id: Int): Book?

    fun findAll(): List<Book>

}
