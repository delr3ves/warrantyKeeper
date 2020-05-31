package com.emaginalabs.warrantyKeeperServer.core.ticket

import org.springframework.stereotype.Component

@Component
class FindAllTickets(
        private val repository: TicketRepository
) {

    operator fun invoke(): List<Ticket> {
        return repository.findAllTickets()
    }
}