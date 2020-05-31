package com.emaginalabs.warrantyKeeperServer.core.ticket

import org.springframework.stereotype.Component

@Component
class UpdateTicket(
        private val ticketRepository: TicketRepository
) {

    operator fun invoke(ticket: Ticket): Ticket {
        return ticketRepository.add(ticket)
    }
}