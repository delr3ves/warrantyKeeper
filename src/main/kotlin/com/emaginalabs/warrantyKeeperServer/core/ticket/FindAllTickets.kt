package com.emaginalabs.warrantyKeeperServer.core.ticket

import org.springframework.stereotype.Component

@Component
class FindAllTickets {
    operator fun invoke(): List<Ticket> {
        return emptyList()
    }
}