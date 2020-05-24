package com.emaginalabs.warrantyKeeperServer.server.resources

import com.emaginalabs.warrantyKeeperServer.core.ticket.FindAllTickets
import com.emaginalabs.warrantyKeeperServer.core.ticket.Ticket
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TicketResource(
        private val findTickets: FindAllTickets) {

    @GetMapping("/ticket")
    fun findAllTickets(): List<Ticket> {
        return findTickets()
    }
}