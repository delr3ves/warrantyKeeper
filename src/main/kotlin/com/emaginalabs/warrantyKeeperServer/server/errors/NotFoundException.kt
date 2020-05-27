package com.emaginalabs.warrantyKeeperServer.server.errors

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Resource not found")
class NotFoundException(override val message: String?) : Exception() {

    companion object {
        inline fun <reified T> from(id: Any) : NotFoundException {
            val message = "Resource $id of type ${T::class.java.simpleName} not found"
            return NotFoundException(message)
        }
    }
}