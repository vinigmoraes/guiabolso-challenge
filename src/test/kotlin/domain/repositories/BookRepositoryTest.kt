package domain.repositories

import com.guiabolso.guiabolsochallenge.GuiabolsoChallengeApplication
import com.guiabolso.guiabolsochallenge.domain.entities.Book
import com.guiabolso.guiabolsochallenge.domain.repositories.BookRepository
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringRunner

/**
 * @author vinicius.moraes on 2019-01-06
 */

@RunWith(SpringRunner::class)
@DataJpaTest
@ContextConfiguration(classes = [GuiabolsoChallengeApplication::class])
class BookRepositoryTest {

    @Autowired
    private lateinit var bookRepository: BookRepository

    @Test
    fun shouldReturnBook() {

        val expectedBook = Book(
                title = "Micro services in production",
                description = "How to build micro services with quality",
                language = "en",
                isbn = "2189372183721"
        )

        bookRepository.save(expectedBook)

        val book = bookRepository.findById(expectedBook.id)

        assertThat(expectedBook).isEqualToComparingFieldByField(book)
    }
}