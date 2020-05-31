package com.emaginalabs.warrantyKeeperServer.core.ticket

import org.springframework.stereotype.Component
import java.util.*

@Component
class TicketRepository {

    private val cache: MutableMap<String, Ticket> = mutableMapOf()

    init {
        cache["sarroyo"] = Ticket(
                id = "sarroyo",
                ticketUrl = "http://meneame.net",
                boughtOn = Date(),
                description = "un tio muy guay",
                productPhotoUrl = "http://pornhub",
                yearsOfWarranty = 1000
        )
    }

    fun findAllTickets(): List<Ticket> {
        return cache.values.toList()
    }

    fun add(ticket: Ticket): Ticket {
        cache[ticket.id] = ticket
        return ticket
    }

    fun findById(id: String): Ticket? {
        return cache[id]
    }

    fun remove(ticket: Ticket) {
        cache.remove(ticket.id)
    }
}