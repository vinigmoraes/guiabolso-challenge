package com.guiabolso.guiabolsochallenge.errors.exceptions

/**
 * @author vinicius.moraes on 2019-01-06
 */

class ResourceNotFoundException(
        override val message: String,
        val field: String,
        val parameter: Any
) : RuntimeException()