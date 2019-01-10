package com.guiabolso.guiabolsochallenge

import com.guiabolso.guiabolsochallenge.crawler.CrawlerConfig
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GuiabolsoChallengeApplication

fun main(args: Array<String>) {
    val context = runApplication<GuiabolsoChallengeApplication>(*args)
    context.getBean(CrawlerConfig::class.java).start(listOf("https://kotlinlang.org/docs/books.html"))
}

