package com.guiabolso.guiabolsochallenge.crawler

import com.guiabolso.guiabolsochallenge.domain.entities.Book
import com.guiabolso.guiabolsochallenge.domain.repositories.BookRepository
import io.thelandscape.krawler.http.KrawlDocument
import io.thelandscape.krawler.http.KrawlUrl
import org.jsoup.select.Elements
import org.springframework.stereotype.Component

/**
 * @author vinicius.moraes on 2019-01-05
 */

@Component
class CrawlerConfig(
        private val bookRepository: BookRepository
) : Krawler() {

    private val sites = listOf("https://kotlinlang.org/docs/books.html")

    override fun shouldVisit(url: KrawlUrl) = sites.contains(url.rawUrl)

    override fun visit(url: KrawlUrl, doc: KrawlDocument) {

        val document = doc.parsedDocument

        val kotlinLangBooks = document.getElementsByClass("page-content g-9")

        val titles = kotlinLangBooks.select("h2")

        populateDatabase(titles, kotlinLangBooks)
    }

    private fun populateDatabase(titles: Elements, kotlinLangBooks: Elements) = titles.forEachIndexed { index, _ ->
        val title = kotlinLangBooks.select("h2")[index].text()
        val lang = kotlinLangBooks.select("div")[index].text()
        val desc = kotlinLangBooks.select("p")[index].text()

        bookRepository.save(Book(
                title = title,
                description = desc,
                language = lang
        ))
    }
}


