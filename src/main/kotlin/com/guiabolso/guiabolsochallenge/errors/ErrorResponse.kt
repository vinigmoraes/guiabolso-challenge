package com.guiabolso.guiabolsochallenge.errors

import com.guiabolso.guiabolsochallenge.errors.ErrorObject

class ErrorResponse(
        val message: String,
        val errors: List<ErrorObject>
)