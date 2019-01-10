package com.guiabolso.guiabolsochallenge.domain.entities

import com.fasterxml.jackson.annotation.JsonPropertyOrder
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Lob
import javax.validation.constraints.NotBlank

/**
 * @author vinicius.moraes on 2019-01-05
 */

@Entity
@JsonPropertyOrder("id", "title", "language", "isbn", "description")
class Book(
        @field:NotBlank(message = "{book.title.not.blank}")
        val title: String,

        @field:NotBlank(message = "{book.description.not.blank}")
        @Lob
        val description: String,

        @field:NotBlank(message = "{book.language.not.blank}")
        val language: String,

        @field:NotBlank(message = "{book.isbn.not.blank}")
        val isbn: String = "Unavailable"
) {

    @Id
    @GeneratedValue
    val id: Int = 0
}