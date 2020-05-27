package com.emaginalabs.warrantyKeeperServer.server.resources

import com.emaginalabs.warrantyKeeperServer.core.ticket.FindAllTickets
import com.emaginalabs.warrantyKeeperServer.core.ticket.Ticket
import com.emaginalabs.warrantyKeeperServer.server.errors.NotFoundException
import org.springframework.web.bind.annotation.*
import javax.ws.rs.PathParam

@RestController
class TicketResource(
        private val findTickets: FindAllTickets) {

    @GetMapping("/ticket")
    fun findAllTickets(): List<Ticket> {
        return findTickets()
    }

    @PostMapping("/ticket")
    fun createTicket(ticket: Ticket): Ticket {
        return ticket
    }

    @GetMapping("/ticket/{id}")
    fun findTicket(@PathVariable("id") id: String): Ticket {
        throw NotFoundException.from<Ticket>(id)
    }

    @PutMapping("/ticket/{id}")
    fun updateTicket(@PathVariable("id") id: String, ticket: Ticket): Ticket {
        throw NotFoundException.from<Ticket>(id)
    }

    @DeleteMapping("ticket/{id}")
    fun deleteTicket(@PathVariable("id") id: String) {

    }
}