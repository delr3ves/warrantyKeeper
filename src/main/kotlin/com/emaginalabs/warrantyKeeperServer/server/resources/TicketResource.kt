package com.emaginalabs.warrantyKeeperServer.server.resources

import com.emaginalabs.warrantyKeeperServer.core.ticket.*
import com.emaginalabs.warrantyKeeperServer.server.errors.NotFoundException
import org.springframework.web.bind.annotation.*
import javax.ws.rs.PathParam

@RestController
class TicketResource(
        private val findTickets: FindAllTickets,
        private val findTicketById: FindTicketById,
        private val create: CreateTicket,
        private val update: UpdateTicket,
        private val delete: DeleteTicket
) {

    @GetMapping("/ticket")
    fun findAllTickets(): List<Ticket> {
        return findTickets()
    }

    @PostMapping("/ticket")
    fun createTicket(@RequestBody ticket: Ticket): Ticket {
        return create(ticket)
    }

    @GetMapping("/ticket/{id}")
    fun findTicket(@PathVariable("id") id: String): Ticket {
        val ticket = findTicketById(id)
        if(ticket != null) {
            return ticket
        } else {
            throw NotFoundException.from<Ticket>(id)
        }
    }

    @PutMapping("/ticket/{id}")
    fun updateTicket(@PathVariable("id") id: String, ticket: Ticket): Ticket {
        throw NotFoundException.from<Ticket>(id)
    }

    @DeleteMapping("ticket/{id}")
    fun deleteTicket(@PathVariable("id") id: String) {
        findTicketById(id)?.let { delete(it) }
    }
}