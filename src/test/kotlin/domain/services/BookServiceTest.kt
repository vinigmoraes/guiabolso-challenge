package domain.services

import com.guiabolso.guiabolsochallenge.GuiabolsoChallengeApplication
import com.guiabolso.guiabolsochallenge.domain.entities.Book
import com.guiabolso.guiabolsochallenge.domain.services.BookService
import com.guiabolso.guiabolsochallenge.errors.exceptions.ResourceNotFoundException
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringRunner

/**
 * @author vinicius.moraes on 2019-01-06
 */

@RunWith(SpringRunner::class)
@ContextConfiguration(classes=[GuiabolsoChallengeApplication::class])
class BookServiceTest {

    @Autowired
    private lateinit var bookService: BookService

    @Test(expected = ResourceNotFoundException::class)
    fun shouldThrowResourceNotFoundExceptionWhenIdDoesntExistInDatabase() {

        val book = Book("Passionate Programmer", "Description A", "en")

        bookService.find(book.id)
    }
}