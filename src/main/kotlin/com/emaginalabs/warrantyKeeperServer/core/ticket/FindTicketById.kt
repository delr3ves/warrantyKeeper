package com.emaginalabs.warrantyKeeperServer.core.ticket

import org.springframework.stereotype.Component

@Component
class FindTicketById(
        private val ticketRepository: TicketRepository
) {

    operator fun invoke(id: String): Ticket? {
        return ticketRepository.findById(id)
    }
}