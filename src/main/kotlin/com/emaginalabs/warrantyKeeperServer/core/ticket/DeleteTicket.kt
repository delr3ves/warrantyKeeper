package com.emaginalabs.warrantyKeeperServer.core.ticket

import org.springframework.stereotype.Component

@Component
class DeleteTicket(
        private val ticketRepository: TicketRepository
) {

    operator fun invoke(ticket: Ticket) {
        ticketRepository.remove(ticket)
    }
}